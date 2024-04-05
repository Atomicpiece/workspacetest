
package net.mcreator.workspacetest.block;

import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class CrudeoilBlock extends LiquidBlock {
	public CrudeoilBlock() {
		super(() -> WorkspaceTestModFluids.CRUDEOIL.get(), BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).strength(10f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 750;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 5;
	}

	@Override
	public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
		super.onPlace(blockstate, world, pos, oldState, moving);
		world.scheduleTick(pos, this, 1);
	}

	@Override
	public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.tick(blockstate, world, pos, random);
		CrudeoilUpdateTickProcedure.execute();
		world.scheduleTick(pos, this, 1);
	}
}