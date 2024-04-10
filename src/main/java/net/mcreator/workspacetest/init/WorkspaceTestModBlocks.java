
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
import net.mcreator.workspacetest.block.UrandeBlock;
import net.mcreator.workspacetest.block.TungstendeBlock;
import net.mcreator.workspacetest.block.TransporterBlock;
import net.mcreator.workspacetest.block.TowerBlock;
import net.mcreator.workspacetest.block.TitandeBlock;
import net.mcreator.workspacetest.block.TindeBlock;
import net.mcreator.workspacetest.block.ThordeBlock;
import net.mcreator.workspacetest.block.SulfurdeBlock;
import net.mcreator.workspacetest.block.SmelteryBlock;
import net.mcreator.workspacetest.block.RoboticAssemblerBlock;
import net.mcreator.workspacetest.block.RecyclerBlock;
import net.mcreator.workspacetest.block.ReactorBlock;
import net.mcreator.workspacetest.block.OilrigBlock;
import net.mcreator.workspacetest.block.OilplanksBlock;
import net.mcreator.workspacetest.block.OildirtBlock;
import net.mcreator.workspacetest.block.OilcobbleBlock;
import net.mcreator.workspacetest.block.NukeBlock;
import net.mcreator.workspacetest.block.NiterdeBlock;
import net.mcreator.workspacetest.block.LithdeBlock;
import net.mcreator.workspacetest.block.LeaddeBlock;
import net.mcreator.workspacetest.block.LandmineBlock;
import net.mcreator.workspacetest.block.IrondeBlock;
import net.mcreator.workspacetest.block.InfbatBlock;
import net.mcreator.workspacetest.block.GolddeBlock;
import net.mcreator.workspacetest.block.ForestBlock;
import net.mcreator.workspacetest.block.FiretesterBlock;
import net.mcreator.workspacetest.block.Firetester0Block;
import net.mcreator.workspacetest.block.FarmBlock;
import net.mcreator.workspacetest.block.DiamonddeBlock;
import net.mcreator.workspacetest.block.DestroyedmineBlock;
import net.mcreator.workspacetest.block.CrudeoildeBlock;
import net.mcreator.workspacetest.block.CrudeoilBlock;
import net.mcreator.workspacetest.block.CrudeOilBlockBlock;
import net.mcreator.workspacetest.block.CopperdeBlock;
import net.mcreator.workspacetest.block.CoalpowerBlock;
import net.mcreator.workspacetest.block.CoalplantBlock;
import net.mcreator.workspacetest.block.CoaldeBlock;
import net.mcreator.workspacetest.block.CccBlock;
import net.mcreator.workspacetest.block.ApatitedeBlock;
import net.mcreator.workspacetest.block.AncientSpawnerBlock;
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
	public static final RegistryObject<Block> ANCIENT_SPAWNER = REGISTRY.register("ancient_spawner", () -> new AncientSpawnerBlock());
	public static final RegistryObject<Block> TUNGSTENDE = REGISTRY.register("tungstende", () -> new TungstendeBlock());
	public static final RegistryObject<Block> SMELTERY = REGISTRY.register("smeltery", () -> new SmelteryBlock());
	public static final RegistryObject<Block> URANDE = REGISTRY.register("urande", () -> new UrandeBlock());
	public static final RegistryObject<Block> FOREST = REGISTRY.register("forest", () -> new ForestBlock());
	public static final RegistryObject<Block> NITERDE = REGISTRY.register("niterde", () -> new NiterdeBlock());
	public static final RegistryObject<Block> THORDE = REGISTRY.register("thorde", () -> new ThordeBlock());
	public static final RegistryObject<Block> LITHDE = REGISTRY.register("lithde", () -> new LithdeBlock());
	public static final RegistryObject<Block> COALPLANT = REGISTRY.register("coalplant", () -> new CoalplantBlock());
	public static final RegistryObject<Block> OILRIG = REGISTRY.register("oilrig", () -> new OilrigBlock());
	public static final RegistryObject<Block> FARM = REGISTRY.register("farm", () -> new FarmBlock());
	public static final RegistryObject<Block> CRUDEOILDE = REGISTRY.register("crudeoilde", () -> new CrudeoildeBlock());
	public static final RegistryObject<Block> CRUDEOIL = REGISTRY.register("crudeoil", () -> new CrudeoilBlock());
	public static final RegistryObject<Block> FIRETESTER = REGISTRY.register("firetester", () -> new FiretesterBlock());
	public static final RegistryObject<Block> FIRETESTER_0 = REGISTRY.register("firetester_0", () -> new Firetester0Block());
	public static final RegistryObject<Block> REACTOR = REGISTRY.register("reactor", () -> new ReactorBlock());
	public static final RegistryObject<Block> DESTROYEDMINE = REGISTRY.register("destroyedmine", () -> new DestroyedmineBlock());
	public static final RegistryObject<Block> CRUDE_OIL_BLOCK = REGISTRY.register("crude_oil_block", () -> new CrudeOilBlockBlock());
	public static final RegistryObject<Block> RECYCLER = REGISTRY.register("recycler", () -> new RecyclerBlock());
	public static final RegistryObject<Block> OILDIRT = REGISTRY.register("oildirt", () -> new OildirtBlock());
	public static final RegistryObject<Block> COALPOWER = REGISTRY.register("coalpower", () -> new CoalpowerBlock());
	public static final RegistryObject<Block> OILCOBBLE = REGISTRY.register("oilcobble", () -> new OilcobbleBlock());
	public static final RegistryObject<Block> OILPLANKS = REGISTRY.register("oilplanks", () -> new OilplanksBlock());
	public static final RegistryObject<Block> APATITEDE = REGISTRY.register("apatitede", () -> new ApatitedeBlock());
}
