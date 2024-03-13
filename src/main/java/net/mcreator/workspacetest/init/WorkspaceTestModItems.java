
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

import net.mcreator.workspacetest.item.PercentageCheckerItem;
import net.mcreator.workspacetest.item.IgniterItem;
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

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
