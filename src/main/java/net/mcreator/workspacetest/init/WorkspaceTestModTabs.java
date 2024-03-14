
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.workspacetest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.workspacetest.WorkspaceTestMod;

public class WorkspaceTestModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WorkspaceTestMod.MODID);
	public static final RegistryObject<CreativeModeTab> TEST = REGISTRY.register("test",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.workspace_test.test")).icon(() -> new ItemStack(Blocks.GILDED_BLACKSTONE)).displayItems((parameters, tabData) -> {
				tabData.accept(WorkspaceTestModItems.BOMBS.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> DEFENCE = REGISTRY.register("defence",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.workspace_test.defence")).icon(() -> new ItemStack(WorkspaceTestModItems.BOMBS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(WorkspaceTestModItems.MICROBOT_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModItems.TINYBOT_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModBlocks.NUKE.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.TOWER.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.WALLS.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.LANDMINE.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.ROBOTIC_ASSEMBLER.get().asItem());
				tabData.accept(WorkspaceTestModItems.IGNITER.get());
				tabData.accept(WorkspaceTestModItems.PERCENTAGE_CHECKER.get());
				tabData.accept(WorkspaceTestModItems.TANK_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModItems.DESTROYER_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModItems.LEVITATION_ROBOT_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModItems.FIREBELT.get());
				tabData.accept(WorkspaceTestModItems.DRONE_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModItems.ION_SWORD.get());
				tabData.accept(WorkspaceTestModItems.CREEPERBOT_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModItems.SPIDERBOT_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModItems.ROBOTIC_PHANTOM_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModItems.BOMB_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModItems.WARPLANE_SPAWN_EGG.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> RESOURCES = REGISTRY.register("resources",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.workspace_test.resources")).icon(() -> new ItemStack(Items.RAW_IRON)).displayItems((parameters, tabData) -> {
				tabData.accept(WorkspaceTestModBlocks.CCC.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.COALDE.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.IRONDE.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.GOLDDE.get().asItem());
			})

					.build());
}
