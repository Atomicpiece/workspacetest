package net.mcreator.workspacetest.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class MossyGolemEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.ASH, x, y, z, 50, 0.2, 0.2, 0.2, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 50, 0.5, 0.5, 0.5, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.WHITE_ASH, x, y, z, 50, 0.2, 0.2, 0.2, 1);
	}
}
