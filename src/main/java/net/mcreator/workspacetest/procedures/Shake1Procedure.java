package net.mcreator.workspacetest.procedures;

import net.minecraft.world.entity.Entity;

public class Shake1Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("Time") <= 10) {
			return true;
		}
		return false;
	}
}
