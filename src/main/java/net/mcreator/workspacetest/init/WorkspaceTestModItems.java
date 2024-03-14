
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

import net.mcreator.workspacetest.item.WandItem;
import net.mcreator.workspacetest.item.RedstroneBlasterItem;
import net.mcreator.workspacetest.item.PercentageCheckerItem;
import net.mcreator.workspacetest.item.IonSwordItem;
import net.mcreator.workspacetest.item.IgniterItem;
import net.mcreator.workspacetest.item.FirebeltItem;
import net.mcreator.workspacetest.item.FireCircleCreatorItem;
import net.mcreator.workspacetest.item.BombsItem;
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
	public static final RegistryObject<Item> FIRE_CIRCLE_CREATOR = REGISTRY.register("fire_circle_creator", () -> new FireCircleCreatorItem());
	public static final RegistryObject<Item> SKELETER_SPAWN_EGG = REGISTRY.register("skeleter_spawn_egg", () -> new ForgeSpawnEggItem(WorkspaceTestModEntities.SKELETER, -6710887, -10066330, new Item.Properties()));
	public static final RegistryObject<Item> MOSSY_GOLEM_SPAWN_EGG = REGISTRY.register("mossy_golem_spawn_egg", () -> new ForgeSpawnEggItem(WorkspaceTestModEntities.MOSSY_GOLEM, -6710887, -16724992, new Item.Properties()));
	public static final RegistryObject<Item> GREAT_CHICKEN_SPAWN_EGG = REGISTRY.register("great_chicken_spawn_egg", () -> new ForgeSpawnEggItem(WorkspaceTestModEntities.GREAT_CHICKEN, -1, -65536, new Item.Properties()));
	public static final RegistryObject<Item> FROST_BLAZE_SPAWN_EGG = REGISTRY.register("frost_blaze_spawn_egg", () -> new ForgeSpawnEggItem(WorkspaceTestModEntities.FROST_BLAZE, -13369345, -1, new Item.Properties()));
	public static final RegistryObject<Item> FURNACE_POWERED_GOLEM_SPAWN_EGG = REGISTRY.register("furnace_powered_golem_spawn_egg",
			() -> new ForgeSpawnEggItem(WorkspaceTestModEntities.FURNACE_POWERED_GOLEM, -13421773, -39424, new Item.Properties()));
	public static final RegistryObject<Item> DEFENDER_SPAWN_EGG = REGISTRY.register("defender_spawn_egg", () -> new ForgeSpawnEggItem(WorkspaceTestModEntities.DEFENDER, -10066330, -6710887, new Item.Properties()));
	public static final RegistryObject<Item> REDSTRONE_BLASTER = REGISTRY.register("redstrone_blaster", () -> new RedstroneBlasterItem());
	public static final RegistryObject<Item> WAND = REGISTRY.register("wand", () -> new WandItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
