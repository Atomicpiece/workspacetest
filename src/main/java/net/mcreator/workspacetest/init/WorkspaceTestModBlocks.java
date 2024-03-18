
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.workspacetest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.workspacetest.block.ZincdeBlock;
import net.mcreator.workspacetest.block.WallsBlock;
import net.mcreator.workspacetest.block.TransporterBlock;
import net.mcreator.workspacetest.block.TowerBlock;
import net.mcreator.workspacetest.block.TitandeBlock;
import net.mcreator.workspacetest.block.TindeBlock;
import net.mcreator.workspacetest.block.SulfurdeBlock;
import net.mcreator.workspacetest.block.RoboticAssemblerBlock;
import net.mcreator.workspacetest.block.NukeBlock;
import net.mcreator.workspacetest.block.LeaddeBlock;
import net.mcreator.workspacetest.block.LandmineBlock;
import net.mcreator.workspacetest.block.IrondeBlock;
import net.mcreator.workspacetest.block.InfbatBlock;
import net.mcreator.workspacetest.block.GolddeBlock;
import net.mcreator.workspacetest.block.DiamonddeBlock;
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
	public static final RegistryObject<Block> INFBAT = REGISTRY.register("infbat", () -> new InfbatBlock());
	public static final RegistryObject<Block> TITANDE = REGISTRY.register("titande", () -> new TitandeBlock());
	public static final RegistryObject<Block> SULFURDE = REGISTRY.register("sulfurde", () -> new SulfurdeBlock());
	public static final RegistryObject<Block> LEADDE = REGISTRY.register("leadde", () -> new LeaddeBlock());
	public static final RegistryObject<Block> ZINCDE = REGISTRY.register("zincde", () -> new ZincdeBlock());
	public static final RegistryObject<Block> TINDE = REGISTRY.register("tinde", () -> new TindeBlock());
	public static final RegistryObject<Block> DIAMONDDE = REGISTRY.register("diamondde", () -> new DiamonddeBlock());
	public static final RegistryObject<Block> TRANSPORTER = REGISTRY.register("transporter", () -> new TransporterBlock());
}
