package net.mcreator.workspacetest.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.workspacetest.init.WorkspaceTestModEntities;
import net.mcreator.workspacetest.init.WorkspaceTestModBlocks;
import net.mcreator.workspacetest.WorkspaceTestMod;

public class WarplaneOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == WorkspaceTestModBlocks.ROBOTIC_ASSEMBLER.get()
				|| (world.getBlockState(BlockPos.containing(x, y - 2, z))).getBlock() == WorkspaceTestModBlocks.ROBOTIC_ASSEMBLER.get()) {
			if (entity.getPersistentData().getBoolean("bomb") == false) {
				entity.getPersistentData().putBoolean("bomb", true);
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = WorkspaceTestModEntities.FALLINGBOMB.get().spawn(_level, BlockPos.containing(x, y - 1, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				WorkspaceTestMod.queueServerWork(20, () -> {
					entity.getPersistentData().putBoolean("bomb", false);
				});
			}
		}
	}
}
