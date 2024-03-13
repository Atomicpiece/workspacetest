
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.workspacetest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.workspacetest.WorkspaceTestMod;

public class WorkspaceTestModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WorkspaceTestMod.MODID);
	public static final RegistryObject<CreativeModeTab> DEFENCE = REGISTRY.register("defence",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.workspace_test.defence")).icon(() -> new ItemStack(Items.BOW)).displayItems((parameters, tabData) -> {
				tabData.accept(WorkspaceTestModItems.MICROBOT_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModItems.TINYBOT_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModBlocks.NUKE.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.TOWER.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.WALLS.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.LANDMINE.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.ROBOTIC_ASSEMBLER.get().asItem());
				tabData.accept(WorkspaceTestModItems.IGNITER.get());
				tabData.accept(WorkspaceTestModItems.PERCENTAGE_CHECKER.get());
			})

					.build());
}
