package net.mcreator.workspacetest.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class AntioxidProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FALLING_OBSIDIAN_TEAR, x, y, z, 5, 0.3, 0.3, 0.3, 0.01);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.DRIPPING_OBSIDIAN_TEAR, x, y, z, 5, 0.3, 0.3, 0.3, 0.01);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.LANDING_OBSIDIAN_TEAR, x, y, z, 5, 0.3, 0.3, 0.3, 0.01);
	}
}
