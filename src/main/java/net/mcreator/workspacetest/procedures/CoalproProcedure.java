package net.mcreator.workspacetest.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CoalproProcedure {
	public static String execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == WorkspaceTestModItems.DELETED_MOD_ELEMENT.get()) {
			return "coal";
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == WorkspaceTestModItems.DELETED_MOD_ELEMENT.get()) {
			return "iron";
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == WorkspaceTestModItems.DELETED_MOD_ELEMENT.get()) {
			return "gold";
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == WorkspaceTestModItems.DELETED_MOD_ELEMENT.get()) {
			return "copper";
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.DIAMOND_ORE) {
			return "diamond";
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.EMERALD_ORE) {
			return "emerald";
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.REDSTONE_ORE) {
			return "redstone";
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.LAPIS_ORE) {
			return "lapis";
		}
		return "";
	}
}
