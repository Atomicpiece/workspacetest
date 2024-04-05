package net.mcreator.workspacetest.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class OilproProcedure {
	public static String execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == WorkspaceTestModItems.DELETED_MOD_ELEMENT.get()) {
			return "Crude oil";
		}
		return "";
	}
}
