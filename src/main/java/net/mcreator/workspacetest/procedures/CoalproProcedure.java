package net.mcreator.workspacetest.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.workspacetest.init.WorkspaceTestModBlocks;

public class CoalproProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == WorkspaceTestModBlocks.COALDE.get()) {
			return true;
		}
		return false;
	}
}
