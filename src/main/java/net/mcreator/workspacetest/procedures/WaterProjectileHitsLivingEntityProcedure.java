package net.mcreator.workspacetest.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class WaterProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FALLING_DRIPSTONE_WATER, x, y, z, 5, 0.2, 0.2, 0.2, 1);
		entity.clearFire();
	}
}
