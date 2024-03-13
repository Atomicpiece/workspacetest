
package net.mcreator.workspacetest.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class RoboticAssemblerBlock extends FallingBlock implements EntityBlock {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public RoboticAssemblerBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.METAL).strength(1f, 10f).noCollission().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(1, 0, 1, 15, 1, 15), box(4, 0, 4, 12, 2, 12), box(7, -6, 8, 9, -4, 16), box(7, 5, 5, 9, 7, 11), box(7, -4, 14, 9, 2, 16), box(7, -1, 3, 9, 7, 5), box(7, 8, 7, 9, 16, 9), box(18, 5, 7, 20, 11, 9),
					box(12, -3, 7, 14, 5, 9), box(1, -6, 7, 3, 0, 9), box(6.899, 8.899, 3.899, 9.101, 11.101, 12.101), box(3.9, 8.9, 6.9, 12.1, 11.1, 9.1));
			case NORTH -> Shapes.or(box(1, 0, 1, 15, 1, 15), box(4, 0, 4, 12, 2, 12), box(7, -6, 0, 9, -4, 8), box(7, 5, 5, 9, 7, 11), box(7, -4, 0, 9, 2, 2), box(7, -1, 11, 9, 7, 13), box(7, 8, 7, 9, 16, 9), box(-4, 5, 7, -2, 11, 9),
					box(2, -3, 7, 4, 5, 9), box(13, -6, 7, 15, 0, 9), box(6.899, 8.899, 3.899, 9.101, 11.101, 12.101), box(3.9, 8.9, 6.9, 12.1, 11.1, 9.1));
			case EAST -> Shapes.or(box(1, 0, 1, 15, 1, 15), box(4, 0, 4, 12, 2, 12), box(8, -6, 7, 16, -4, 9), box(5, 5, 7, 11, 7, 9), box(14, -4, 7, 16, 2, 9), box(3, -1, 7, 5, 7, 9), box(7, 8, 7, 9, 16, 9), box(7, 5, -4, 9, 11, -2),
					box(7, -3, 2, 9, 5, 4), box(7, -6, 13, 9, 0, 15), box(3.899, 8.899, 6.899, 12.101, 11.101, 9.101), box(6.9, 8.9, 3.9, 9.1, 11.1, 12.1));
			case WEST -> Shapes.or(box(1, 0, 1, 15, 1, 15), box(4, 0, 4, 12, 2, 12), box(0, -6, 7, 8, -4, 9), box(5, 5, 7, 11, 7, 9), box(0, -4, 7, 2, 2, 9), box(11, -1, 7, 13, 7, 9), box(7, 8, 7, 9, 16, 9), box(7, 5, 18, 9, 11, 20),
					box(7, -3, 12, 9, 5, 14), box(7, -6, 1, 9, 0, 3), box(3.899, 8.899, 6.899, 12.101, 11.101, 9.101), box(6.9, 8.9, 3.9, 9.1, 11.1, 12.1));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}

	@Override
	public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
		BlockEntity tileEntity = worldIn.getBlockEntity(pos);
		return tileEntity instanceof MenuProvider menuProvider ? menuProvider : null;
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new RoboticAssemblerBlockEntity(pos, state);
	}

	@Override
	public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
		super.triggerEvent(state, world, pos, eventID, eventParam);
		BlockEntity blockEntity = world.getBlockEntity(pos);
		return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
	}

	@Override
	public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
		if (state.getBlock() != newState.getBlock()) {
			BlockEntity blockEntity = world.getBlockEntity(pos);
			if (blockEntity instanceof RoboticAssemblerBlockEntity be) {
				Containers.dropContents(world, pos, be);
				world.updateNeighbourForOutputSignal(pos, this);
			}
			super.onRemove(state, world, pos, newState, isMoving);
		}
	}

	@Override
	public boolean hasAnalogOutputSignal(BlockState state) {
		return true;
	}

	@Override
	public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos) {
		BlockEntity tileentity = world.getBlockEntity(pos);
		if (tileentity instanceof RoboticAssemblerBlockEntity be)
			return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
		else
			return 0;
	}
}