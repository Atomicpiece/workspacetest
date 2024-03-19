package net.mcreator.workspacetest.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.workspacetest.init.WorkspaceTestModItems;

import java.util.function.Supplier;
import java.util.Map;

public class SBProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (WorkspaceTestModItems.SPIDERBOT_SPAWN_EGG.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
				.getItem()) {
			return true;
		}
		return false;
	}
}
