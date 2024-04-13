package net.mcreator.workspacetest.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.workspacetest.WorkspaceTestMod;

public class HazmatsuitHelmetTickEventProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean ont = false;
		boolean F1 = false;
		if (0 < entity.getDeltaMovement().x() || 0 < entity.getDeltaMovement().y() || 0 < entity.getDeltaMovement().z()) {
			if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z))) {
				world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.LIGHT.defaultBlockState(), 3);
			}
			WorkspaceTestMod.queueServerWork(10, () -> {
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.LIGHT) {
					world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
				}
			});
		} else if (0 >= entity.getDeltaMovement().x() && 0 >= entity.getDeltaMovement().y() && 0 >= entity.getDeltaMovement().z()) {
			if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z))) {
				world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.LIGHT.defaultBlockState(), 3);
			}
		}
		WorkspaceTestMod.queueServerWork(10, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.LIGHT) {
				world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
			}
		});
	}
}
