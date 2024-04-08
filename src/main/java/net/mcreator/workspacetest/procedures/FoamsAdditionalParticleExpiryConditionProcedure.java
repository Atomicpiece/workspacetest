package net.mcreator.workspacetest.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FoamsAdditionalParticleExpiryConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.FIRE) {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
			return true;
		}
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.FIRE) {
			world.destroyBlock(BlockPos.containing(x, y + 1, z), false);
			return true;
		}
		return false;
	}
}
