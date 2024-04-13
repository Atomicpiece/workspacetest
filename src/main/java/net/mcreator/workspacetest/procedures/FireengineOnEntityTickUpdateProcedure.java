package net.mcreator.workspacetest.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class FireengineOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.onGround() && entity.isVehicle()) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() + entity.getDeltaMovement().x() * 0.7), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() + entity.getDeltaMovement().z() * 0.7)));
		}
	}
}
