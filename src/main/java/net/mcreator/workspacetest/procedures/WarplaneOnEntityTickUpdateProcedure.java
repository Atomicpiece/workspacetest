package net.mcreator.workspacetest.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.workspacetest.init.WorkspaceTestModEntities;
import net.mcreator.workspacetest.init.WorkspaceTestModBlocks;
import net.mcreator.workspacetest.WorkspaceTestMod;

public class WarplaneOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double vx = 0;
		if ((world.getBlockState(BlockPos.containing(x, y - 3, z))).getBlock() == WorkspaceTestModBlocks.ROBOTIC_ASSEMBLER.get() || (world.getBlockState(BlockPos.containing(x, y - 4, z))).getBlock() == WorkspaceTestModBlocks.ROBOTIC_ASSEMBLER.get()
				|| (world.getBlockState(BlockPos.containing(x, y - 5, z))).getBlock() == WorkspaceTestModBlocks.ROBOTIC_ASSEMBLER.get()
				|| (world.getBlockState(BlockPos.containing(x, y - 6, z))).getBlock() == WorkspaceTestModBlocks.ROBOTIC_ASSEMBLER.get()
				|| (world.getBlockState(BlockPos.containing(x, y - 7, z))).getBlock() == WorkspaceTestModBlocks.ROBOTIC_ASSEMBLER.get()
				|| (world.getBlockState(BlockPos.containing(x, y - 8, z))).getBlock() == WorkspaceTestModBlocks.ROBOTIC_ASSEMBLER.get()) {
			if (entity.getPersistentData().getBoolean("bomb") == false) {
				entity.getPersistentData().putBoolean("bomb", true);
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = WorkspaceTestModEntities.FALLINGBOMB.get().spawn(_level, BlockPos.containing(x, y - 1, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				WorkspaceTestMod.queueServerWork(40, () -> {
					entity.getPersistentData().putBoolean("bomb", false);
				});
			}
			entity.setDeltaMovement(new Vec3((Mth.nextInt(RandomSource.create(), -1, 1)), 0, (Mth.nextInt(RandomSource.create(), -1, 1))));
		}
	}
}
