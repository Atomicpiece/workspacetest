
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.workspacetest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.workspacetest.block.WallsBlock;
import net.mcreator.workspacetest.block.TowerBlock;
import net.mcreator.workspacetest.block.RoboticAssemblerBlock;
import net.mcreator.workspacetest.block.NukeBlock;
import net.mcreator.workspacetest.block.LandmineBlock;
import net.mcreator.workspacetest.block.IrondeBlock;
import net.mcreator.workspacetest.block.GolddeBlock;
import net.mcreator.workspacetest.block.CopperdeBlock;
import net.mcreator.workspacetest.block.CoaldeBlock;
import net.mcreator.workspacetest.block.CccBlock;
import net.mcreator.workspacetest.WorkspaceTestMod;

public class WorkspaceTestModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, WorkspaceTestMod.MODID);
	public static final RegistryObject<Block> NUKE = REGISTRY.register("nuke", () -> new NukeBlock());
	public static final RegistryObject<Block> TOWER = REGISTRY.register("tower", () -> new TowerBlock());
	public static final RegistryObject<Block> WALLS = REGISTRY.register("walls", () -> new WallsBlock());
	public static final RegistryObject<Block> LANDMINE = REGISTRY.register("landmine", () -> new LandmineBlock());
	public static final RegistryObject<Block> ROBOTIC_ASSEMBLER = REGISTRY.register("robotic_assembler", () -> new RoboticAssemblerBlock());
	public static final RegistryObject<Block> CCC = REGISTRY.register("ccc", () -> new CccBlock());
	public static final RegistryObject<Block> COALDE = REGISTRY.register("coalde", () -> new CoaldeBlock());
	public static final RegistryObject<Block> IRONDE = REGISTRY.register("ironde", () -> new IrondeBlock());
	public static final RegistryObject<Block> GOLDDE = REGISTRY.register("goldde", () -> new GolddeBlock());
	public static final RegistryObject<Block> COPPERDE = REGISTRY.register("copperde", () -> new CopperdeBlock());
}
