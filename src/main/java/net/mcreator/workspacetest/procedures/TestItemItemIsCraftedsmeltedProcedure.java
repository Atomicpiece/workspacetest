package net.mcreator.workspacetest.procedures;

import net.minecraft.world.item.ItemStack;

public class TestItemItemIsCraftedsmeltedProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.getOrCreateTag().putBoolean("canprocess", true);
	}
}
