
package net.mcreator.workspacetest.world.features.treedecorators;

import com.mojang.serialization.Codec;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BLeaveDecorator extends LeaveVineDecorator {

	public static Codec<LeaveVineDecorator> CODEC = Codec.unit(BLeaveDecorator::new);

	public static TreeDecoratorType<?> DECORATOR_TYPE = new TreeDecoratorType<>(CODEC);

	@SubscribeEvent
	public static void registerPointOfInterest(RegisterEvent event) {
		event.register(ForgeRegistries.Keys.TREE_DECORATOR_TYPES, registerHelper -> registerHelper.register("b_tree_leave_decorator", DECORATOR_TYPE));
	}

	public BLeaveDecorator() {
		super(0.25f);
	}

	@Override
	protected TreeDecoratorType<?> type() {
		return DECORATOR_TYPE;
	}

	@Override
	public void place(TreeDecorator.Context context) {
		context.leaves().forEach((blockpos) -> {
			if (context.random().nextFloat() < 0.25f) {
				BlockPos pos = blockpos.west();
				if (context.isAir(pos)) {
					addVine(pos, context);
				}
			}

			if (context.random().nextFloat() < 0.25f) {
				BlockPos pos = blockpos.east();
				if (context.isAir(pos)) {
					addVine(pos, context);
				}
			}

			if (context.random().nextFloat() < 0.25f) {
				BlockPos pos = blockpos.north();
				if (context.isAir(pos)) {
					addVine(pos, context);
				}
			}

			if (context.random().nextFloat() < 0.25f) {
				BlockPos pos = blockpos.south();
				if (context.isAir(pos)) {
					addVine(pos, context);
				}
			}
		});
	}

	private static void addVine(BlockPos pos, TreeDecorator.Context context) {
		context.setBlock(pos, Blocks.GLOW_LICHEN.defaultBlockState());
		int i = 4;
		for (BlockPos blockpos = pos.below(); context.isAir(blockpos) && i > 0; --i) {
			context.setBlock(blockpos, Blocks.GLOW_LICHEN.defaultBlockState());
			blockpos = blockpos.below();
		}

	}

}
