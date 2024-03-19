package net.mcreator.workspacetest.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class MissileWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		double dis = 0;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 20, 0.1, 0.1, 0.1, 0.01);
		if (immediatesourceentity.isInWaterOrBubble()) {
			immediatesourceentity.setDeltaMovement(new Vec3((immediatesourceentity.getDeltaMovement().x() * 1.6), (immediatesourceentity.getDeltaMovement().y()), (immediatesourceentity.getDeltaMovement().z() * 1.6)));
		}
	}
}
