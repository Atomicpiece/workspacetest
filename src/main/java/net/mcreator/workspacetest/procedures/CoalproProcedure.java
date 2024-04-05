package net.mcreator.workspacetest.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.workspacetest.init.WorkspaceTestModBlocks;

public class CoalproProcedure {
	public static String execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == WorkspaceTestModBlocks.COALDE.get()) {
			return "coal";
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == WorkspaceTestModBlocks.IRONDE.get()) {
			return "iron";
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == WorkspaceTestModBlocks.GOLDDE.get()) {
			return "gold";
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == WorkspaceTestModBlocks.COPPERDE.get()) {
			return "copper";
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == WorkspaceTestModBlocks.DIAMONDDE.get()) {
			return "diamonds";
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.LAPIS_ORE) {
			return "lapis";
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.EMERALD_ORE) {
			return "emerald";
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == WorkspaceTestModBlocks.TITANDE.get()) {
			return "titanium";
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == WorkspaceTestModBlocks.SULFURDE.get()) {
			return "sulfur";
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == WorkspaceTestModBlocks.LEADDE.get()) {
			return "lead";
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == WorkspaceTestModBlocks.ZINCDE.get()) {
			return "zinc";
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == WorkspaceTestModBlocks.TINDE.get()) {
			return "tin";
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == WorkspaceTestModBlocks.TUNGSTENDE.get()) {
			return "tungsten";
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == WorkspaceTestModBlocks.NITERDE.get()) {
			return "niter";
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == WorkspaceTestModBlocks.URANDE.get()) {
			return "uranium";
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == WorkspaceTestModBlocks.THORDE.get()) {
			return "thorium";
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == WorkspaceTestModBlocks.LITHDE.get()) {
			return "lithium";
		}
		return "";
	}
}
