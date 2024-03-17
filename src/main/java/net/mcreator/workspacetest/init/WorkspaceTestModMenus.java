
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.workspacetest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.workspacetest.world.inventory.MinesguiMenu;
import net.mcreator.workspacetest.world.inventory.BotMenuMenu;
import net.mcreator.workspacetest.WorkspaceTestMod;

public class WorkspaceTestModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, WorkspaceTestMod.MODID);
	public static final RegistryObject<MenuType<MinesguiMenu>> MINESGUI = REGISTRY.register("minesgui", () -> IForgeMenuType.create(MinesguiMenu::new));
	public static final RegistryObject<MenuType<BotMenuMenu>> BOT_MENU = REGISTRY.register("bot_menu", () -> IForgeMenuType.create(BotMenuMenu::new));
}
