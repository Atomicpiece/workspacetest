package net.mcreator.workspacetest.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class FrostBlazeOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CLOUD, x, y, z, 5, 0.2, 0.6, 0.2, 0.01);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SNOWFLAKE, x, y, z, 5, 0.2, 0.6, 0.2, 0.01);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.ITEM_SNOWBALL, x, y, z, 5, 0.2, 0.6, 0.2, 0.01);
	}
}
