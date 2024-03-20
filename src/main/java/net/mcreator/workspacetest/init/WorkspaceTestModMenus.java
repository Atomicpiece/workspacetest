
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.workspacetest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.workspacetest.world.inventory.TransportguiMenu;
import net.mcreator.workspacetest.world.inventory.MineguiMenu;
import net.mcreator.workspacetest.world.inventory.BotMenuMenu;
import net.mcreator.workspacetest.WorkspaceTestMod;

public class WorkspaceTestModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, WorkspaceTestMod.MODID);
	public static final RegistryObject<MenuType<BotMenuMenu>> BOT_MENU = REGISTRY.register("bot_menu", () -> IForgeMenuType.create(BotMenuMenu::new));
	public static final RegistryObject<MenuType<MineguiMenu>> MINEGUI = REGISTRY.register("minegui", () -> IForgeMenuType.create(MineguiMenu::new));
	public static final RegistryObject<MenuType<TransportguiMenu>> TRANSPORTGUI = REGISTRY.register("transportgui", () -> IForgeMenuType.create(TransportguiMenu::new));
}
