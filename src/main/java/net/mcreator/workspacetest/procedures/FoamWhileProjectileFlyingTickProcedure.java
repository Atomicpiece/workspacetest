package net.mcreator.workspacetest.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.workspacetest.init.WorkspaceTestModParticleTypes;

public class FoamWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (WorkspaceTestModParticleTypes.FOAMS.get()), x, y, z, 5, 0.1, 0.1, 0.1, 0.01);
	}
}
