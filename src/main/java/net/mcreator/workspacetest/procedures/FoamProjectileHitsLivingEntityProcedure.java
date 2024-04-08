package net.mcreator.workspacetest.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FoamProjectileHitsLivingEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (WorkspaceTestModParticleTypes.FOAMS.get()), x, y, z, 5, 0.2, 0.2, 0.2, 0.1);
		entity.clearFire();
	}
}
