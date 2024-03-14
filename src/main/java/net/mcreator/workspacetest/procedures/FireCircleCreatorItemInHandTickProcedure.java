package net.mcreator.workspacetest.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FireCircleCreatorItemInHandTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double particleRadius = 0;
		double particleAmount = 0;
		particleAmount = 10;
		particleRadius = 6;
		for (int index0 = 0; index0 < (int) particleAmount; index0++) {
			world.addParticle(ParticleTypes.FLAME, (x + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius), (y + 0 + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)),
					(z + 0 + Mth.nextDouble(RandomSource.create(), -1, 1) * particleRadius), 0, 0, 0);
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(13 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Monster) {
					entityiterator.setSecondsOnFire(15);
					entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 2);
				}
			}
		}
	}
}
