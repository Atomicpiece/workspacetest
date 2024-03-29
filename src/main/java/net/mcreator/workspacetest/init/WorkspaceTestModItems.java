
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.workspacetest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.workspacetest.item.ZincchunkItem;
import net.mcreator.workspacetest.item.WandItem;
import net.mcreator.workspacetest.item.TungstenchunkItem;
import net.mcreator.workspacetest.item.TitanchunkItem;
import net.mcreator.workspacetest.item.TinchunkItem;
import net.mcreator.workspacetest.item.SulfurItem;
import net.mcreator.workspacetest.item.RedstroneBlasterItem;
import net.mcreator.workspacetest.item.PercentageCheckerItem;
import net.mcreator.workspacetest.item.MultimeterItem;
import net.mcreator.workspacetest.item.LeadchunkItem;
import net.mcreator.workspacetest.item.IronchunkItem;
import net.mcreator.workspacetest.item.IonSwordItem;
import net.mcreator.workspacetest.item.IgniterItem;
import net.mcreator.workspacetest.item.HealtIndicatorItem;
import net.mcreator.workspacetest.item.GoldchunkItem;
import net.mcreator.workspacetest.item.FirebeltItem;
import net.mcreator.workspacetest.item.FireCircleCreatorItem;
import net.mcreator.workspacetest.item.DiamondsItem;
import net.mcreator.workspacetest.item.CopperchunkItem;
import net.mcreator.workspacetest.item.CoalchunkItem;
import net.mcreator.workspacetest.item.BombsItem;
import net.mcreator.workspacetest.item.BasookaItem;
import net.mcreator.workspacetest.WorkspaceTestMod;

public class WorkspaceTestModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WorkspaceTestMod.MODID);
	public static final RegistryObject<Item> MICROBOT_SPAWN_EGG = REGISTRY.register("microbot_spawn_egg", () -> new ForgeSpawnEggItem(WorkspaceTestModEntities.MICROBOT, -6710887, -26368, new Item.Properties()));
	public static final RegistryObject<Item> TINYBOT_SPAWN_EGG = REGISTRY.register("tinybot_spawn_egg", () -> new ForgeSpawnEggItem(WorkspaceTestModEntities.TINYBOT, -6710887, -256, new Item.Properties()));
	public static final RegistryObject<Item> NUKE = block(WorkspaceTestModBlocks.NUKE);
	public static final RegistryObject<Item> TOWER = block(WorkspaceTestModBlocks.TOWER);
	public static final RegistryObject<Item> WALLS = block(WorkspaceTestModBlocks.WALLS);
	public static final RegistryObject<Item> LANDMINE = block(WorkspaceTestModBlocks.LANDMINE);
	public static final RegistryObject<Item> ROBOTIC_ASSEMBLER = block(WorkspaceTestModBlocks.ROBOTIC_ASSEMBLER);
	public static final RegistryObject<Item> IGNITER = REGISTRY.register("igniter", () -> new IgniterItem());
	public static final RegistryObject<Item> PERCENTAGE_CHECKER = REGISTRY.register("percentage_checker", () -> new PercentageCheckerItem());
	public static final RegistryObject<Item> TANK_SPAWN_EGG = REGISTRY.register("tank_spawn_egg", () -> new ForgeSpawnEggItem(WorkspaceTestModEntities.TANK, -16738048, -10066330, new Item.Properties()));
	public static final RegistryObject<Item> DESTROYER_SPAWN_EGG = REGISTRY.register("destroyer_spawn_egg", () -> new ForgeSpawnEggItem(WorkspaceTestModEntities.DESTROYER, -10066330, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> BOMBS = REGISTRY.register("bombs", () -> new BombsItem());
	public static final RegistryObject<Item> LEVITATION_ROBOT_SPAWN_EGG = REGISTRY.register("levitation_robot_spawn_egg", () -> new ForgeSpawnEggItem(WorkspaceTestModEntities.LEVITATION_ROBOT, -6710887, -1, new Item.Properties()));
	public static final RegistryObject<Item> FIREBELT = REGISTRY.register("firebelt", () -> new FirebeltItem());
	public static final RegistryObject<Item> DRONE_SPAWN_EGG = REGISTRY.register("drone_spawn_egg", () -> new ForgeSpawnEggItem(WorkspaceTestModEntities.DRONE, -13312, -6710887, new Item.Properties()));
	public static final RegistryObject<Item> ION_SWORD = REGISTRY.register("ion_sword", () -> new IonSwordItem());
	public static final RegistryObject<Item> CREEPERBOT_SPAWN_EGG = REGISTRY.register("creeperbot_spawn_egg", () -> new ForgeSpawnEggItem(WorkspaceTestModEntities.CREEPERBOT, -1, -26368, new Item.Properties()));
	public static final RegistryObject<Item> SPIDERBOT_SPAWN_EGG = REGISTRY.register("spiderbot_spawn_egg", () -> new ForgeSpawnEggItem(WorkspaceTestModEntities.SPIDERBOT, -26368, -16777216, new Item.Properties()));
	public static final RegistryObject<Item> CCC = block(WorkspaceTestModBlocks.CCC);
	public static final RegistryObject<Item> ROBOTIC_PHANTOM_SPAWN_EGG = REGISTRY.register("robotic_phantom_spawn_egg", () -> new ForgeSpawnEggItem(WorkspaceTestModEntities.ROBOTIC_PHANTOM, -6710887, -16763905, new Item.Properties()));
	public static final RegistryObject<Item> BOMB_SPAWN_EGG = REGISTRY.register("bomb_spawn_egg", () -> new ForgeSpawnEggItem(WorkspaceTestModEntities.BOMB, -26368, -256, new Item.Properties()));
	public static final RegistryObject<Item> WARPLANE_SPAWN_EGG = REGISTRY.register("warplane_spawn_egg", () -> new ForgeSpawnEggItem(WorkspaceTestModEntities.WARPLANE, -13312, -26368, new Item.Properties()));
	public static final RegistryObject<Item> COALDE = block(WorkspaceTestModBlocks.COALDE);
	public static final RegistryObject<Item> FIRE_CIRCLE_CREATOR = REGISTRY.register("fire_circle_creator", () -> new FireCircleCreatorItem());
	public static final RegistryObject<Item> SKELETER_SPAWN_EGG = REGISTRY.register("skeleter_spawn_egg", () -> new ForgeSpawnEggItem(WorkspaceTestModEntities.SKELETER, -6710887, -10066330, new Item.Properties()));
	public static final RegistryObject<Item> IRONDE = block(WorkspaceTestModBlocks.IRONDE);
	public static final RegistryObject<Item> MOSSY_GOLEM_SPAWN_EGG = REGISTRY.register("mossy_golem_spawn_egg", () -> new ForgeSpawnEggItem(WorkspaceTestModEntities.MOSSY_GOLEM, -6710887, -16724992, new Item.Properties()));
	public static final RegistryObject<Item> GOLDDE = block(WorkspaceTestModBlocks.GOLDDE);
	public static final RegistryObject<Item> GREAT_CHICKEN_SPAWN_EGG = REGISTRY.register("great_chicken_spawn_egg", () -> new ForgeSpawnEggItem(WorkspaceTestModEntities.GREAT_CHICKEN, -1, -65536, new Item.Properties()));
	public static final RegistryObject<Item> FROST_BLAZE_SPAWN_EGG = REGISTRY.register("frost_blaze_spawn_egg", () -> new ForgeSpawnEggItem(WorkspaceTestModEntities.FROST_BLAZE, -13369345, -1, new Item.Properties()));
	public static final RegistryObject<Item> FURNACE_POWERED_GOLEM_SPAWN_EGG = REGISTRY.register("furnace_powered_golem_spawn_egg", () -> new ForgeSpawnEggItem(WorkspaceTestModEntities.FURNACE_POWERED_GOLEM, -6710887, -39424, new Item.Properties()));
	public static final RegistryObject<Item> DEFENDER_SPAWN_EGG = REGISTRY.register("defender_spawn_egg", () -> new ForgeSpawnEggItem(WorkspaceTestModEntities.DEFENDER, -10066330, -6710887, new Item.Properties()));
	public static final RegistryObject<Item> REDSTRONE_BLASTER = REGISTRY.register("redstrone_blaster", () -> new RedstroneBlasterItem());
	public static final RegistryObject<Item> WAND = REGISTRY.register("wand", () -> new WandItem());
	public static final RegistryObject<Item> BATTLESHIP_SPAWN_EGG = REGISTRY.register("battleship_spawn_egg", () -> new ForgeSpawnEggItem(WorkspaceTestModEntities.BATTLESHIP, -10066330, -65536, new Item.Properties()));
	public static final RegistryObject<Item> COPPERDE = block(WorkspaceTestModBlocks.COPPERDE);
	public static final RegistryObject<Item> TURRET_SPAWN_EGG = REGISTRY.register("turret_spawn_egg", () -> new ForgeSpawnEggItem(WorkspaceTestModEntities.TURRET, -1, -3355444, new Item.Properties()));
	public static final RegistryObject<Item> HEALT_INDICATOR = REGISTRY.register("healt_indicator", () -> new HealtIndicatorItem());
	public static final RegistryObject<Item> SUBMARINE_SPAWN_EGG = REGISTRY.register("submarine_spawn_egg", () -> new ForgeSpawnEggItem(WorkspaceTestModEntities.SUBMARINE, -16724737, -6710887, new Item.Properties()));
	public static final RegistryObject<Item> IRONCHUNK = REGISTRY.register("ironchunk", () -> new IronchunkItem());
	public static final RegistryObject<Item> INFBAT = block(WorkspaceTestModBlocks.INFBAT);
	public static final RegistryObject<Item> BAZOOKA = REGISTRY.register("bazooka", () -> new BasookaItem());
	public static final RegistryObject<Item> MULTIMETER = REGISTRY.register("multimeter", () -> new MultimeterItem());
	public static final RegistryObject<Item> ROCKET_LAUNCHER_SPAWN_EGG = REGISTRY.register("rocket_launcher_spawn_egg", () -> new ForgeSpawnEggItem(WorkspaceTestModEntities.ROCKET_LAUNCHER, -65536, -1, new Item.Properties()));
	public static final RegistryObject<Item> COALCHUNK = REGISTRY.register("coalchunk", () -> new CoalchunkItem());
	public static final RegistryObject<Item> GOLDCHUNK = REGISTRY.register("goldchunk", () -> new GoldchunkItem());
	public static final RegistryObject<Item> COPPERCHUNK = REGISTRY.register("copperchunk", () -> new CopperchunkItem());
	public static final RegistryObject<Item> TITANDE = block(WorkspaceTestModBlocks.TITANDE);
	public static final RegistryObject<Item> DPS_ORB_SPAWN_EGG = REGISTRY.register("dps_orb_spawn_egg", () -> new ForgeSpawnEggItem(WorkspaceTestModEntities.DPS_ORB, -26368, -26368, new Item.Properties()));
	public static final RegistryObject<Item> TITANCHUNK = REGISTRY.register("titanchunk", () -> new TitanchunkItem());
	public static final RegistryObject<Item> SULFURDE = block(WorkspaceTestModBlocks.SULFURDE);
	public static final RegistryObject<Item> SULFUR = REGISTRY.register("sulfur", () -> new SulfurItem());
	public static final RegistryObject<Item> LEADDE = block(WorkspaceTestModBlocks.LEADDE);
	public static final RegistryObject<Item> LEADCHUNK = REGISTRY.register("leadchunk", () -> new LeadchunkItem());
	public static final RegistryObject<Item> ZINCDE = block(WorkspaceTestModBlocks.ZINCDE);
	public static final RegistryObject<Item> ZINCCHUNK = REGISTRY.register("zincchunk", () -> new ZincchunkItem());
	public static final RegistryObject<Item> TINDE = block(WorkspaceTestModBlocks.TINDE);
	public static final RegistryObject<Item> TINCHUNK = REGISTRY.register("tinchunk", () -> new TinchunkItem());
	public static final RegistryObject<Item> DIAMONDDE = block(WorkspaceTestModBlocks.DIAMONDDE);
	public static final RegistryObject<Item> DIAMONDS = REGISTRY.register("diamonds", () -> new DiamondsItem());
	public static final RegistryObject<Item> TRANSPORTER = block(WorkspaceTestModBlocks.TRANSPORTER);
	public static final RegistryObject<Item> ANCIENT_SPAWNER = block(WorkspaceTestModBlocks.ANCIENT_SPAWNER);
	public static final RegistryObject<Item> TUNGSTENDE = block(WorkspaceTestModBlocks.TUNGSTENDE);
	public static final RegistryObject<Item> TUNGSTENCHUNK = REGISTRY.register("tungstenchunk", () -> new TungstenchunkItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
