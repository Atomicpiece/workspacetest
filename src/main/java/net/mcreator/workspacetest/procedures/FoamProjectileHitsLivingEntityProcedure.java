package net.mcreator.workspacetest.procedures;

import net.minecraft.world.entity.Entity;

public class FoamProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.clearFire();
	}
}
