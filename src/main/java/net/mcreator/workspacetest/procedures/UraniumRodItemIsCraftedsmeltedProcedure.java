package net.mcreator.workspacetest.procedures;

import net.minecraft.world.item.ItemStack;

public class UraniumRodItemIsCraftedsmeltedProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.getOrCreateTag().putString("item_function", "easy");
	}
}
