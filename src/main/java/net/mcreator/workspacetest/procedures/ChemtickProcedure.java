package net.mcreator.workspacetest.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class ChemtickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.ELECTRIC_SPARK, x, y, z, 10, 0.1, 0.1, 0.1, 0.1);
	}
}
