package net.mcreator.workspacetest.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

public class CoalTest2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getOrCreateTag().getBoolean("canprocess") == true) {
			itemstack.getOrCreateTag().putBoolean("canprocess", false);
			itemstack.getOrCreateTag().putDouble("timer", 0);
			CoalTestProcedure.execute(world, x, y, z, entity, itemstack);
		}
	}
}
