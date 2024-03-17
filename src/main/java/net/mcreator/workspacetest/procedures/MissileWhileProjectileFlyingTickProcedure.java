package net.mcreator.workspacetest.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import java.util.List;
import java.util.Comparator;

public class MissileWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		double dis = 0;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 5, 0.1, 0.1, 0.1, 0.01);
		if (immediatesourceentity.isInWaterOrBubble()) {
			immediatesourceentity.setDeltaMovement(new Vec3((immediatesourceentity.getDeltaMovement().x() * 1.6), (immediatesourceentity.getDeltaMovement().y()), (immediatesourceentity.getDeltaMovement().z() * 1.6)));
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (immediatesourceentity instanceof Mob _entity)
					_entity.getNavigation().moveTo((entity.getX()), (entity.getY()), (entity.getZ()), 1);
			}
		}
	}
}
