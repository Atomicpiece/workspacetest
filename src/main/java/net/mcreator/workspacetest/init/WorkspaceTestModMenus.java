
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
import net.mcreator.workspacetest.world.inventory.SmelteryguiMenu;
import net.mcreator.workspacetest.world.inventory.RigguiMenu;
import net.mcreator.workspacetest.world.inventory.RecyclguiMenu;
import net.mcreator.workspacetest.world.inventory.ReactorGUIMenu;
import net.mcreator.workspacetest.world.inventory.MineguiMenu;
import net.mcreator.workspacetest.world.inventory.BotMenuMenu;
import net.mcreator.workspacetest.WorkspaceTestMod;

public class WorkspaceTestModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, WorkspaceTestMod.MODID);
	public static final RegistryObject<MenuType<BotMenuMenu>> BOT_MENU = REGISTRY.register("bot_menu", () -> IForgeMenuType.create(BotMenuMenu::new));
	public static final RegistryObject<MenuType<MineguiMenu>> MINEGUI = REGISTRY.register("minegui", () -> IForgeMenuType.create(MineguiMenu::new));
	public static final RegistryObject<MenuType<TransportguiMenu>> TRANSPORTGUI = REGISTRY.register("transportgui", () -> IForgeMenuType.create(TransportguiMenu::new));
	public static final RegistryObject<MenuType<SmelteryguiMenu>> SMELTERYGUI = REGISTRY.register("smelterygui", () -> IForgeMenuType.create(SmelteryguiMenu::new));
	public static final RegistryObject<MenuType<RigguiMenu>> RIGGUI = REGISTRY.register("riggui", () -> IForgeMenuType.create(RigguiMenu::new));
	public static final RegistryObject<MenuType<ReactorGUIMenu>> REACTOR_GUI = REGISTRY.register("reactor_gui", () -> IForgeMenuType.create(ReactorGUIMenu::new));
	public static final RegistryObject<MenuType<RecyclguiMenu>> RECYCLGUI = REGISTRY.register("recyclgui", () -> IForgeMenuType.create(RecyclguiMenu::new));
}
