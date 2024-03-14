package net.mcreator.workspacetest.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class TbProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (WorkspaceTestModItems.TINYBOT_SPAWN_EGG.get() == (entity instanceof Player _plrSlotItem && _plrSlotItem.containerMenu instanceof Supplier _splr && _splr.get() instanceof Map _slt ? ((Slot) _slt.get(0)).getItem() : ItemStack.EMPTY)
				.getItem()) {
			return true;
		}
		return false;
	}
}
