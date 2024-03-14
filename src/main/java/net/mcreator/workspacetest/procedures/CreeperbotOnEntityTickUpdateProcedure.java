package net.mcreator.workspacetest.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CreeperbotOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 5) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 5, Level.ExplosionInteraction.NONE);
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
