
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.workspacetest.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.workspacetest.client.gui.TransportguiScreen;
import net.mcreator.workspacetest.client.gui.SmelteryguiScreen;
import net.mcreator.workspacetest.client.gui.RigguiScreen;
import net.mcreator.workspacetest.client.gui.ReactorGUIScreen;
import net.mcreator.workspacetest.client.gui.MineguiScreen;
import net.mcreator.workspacetest.client.gui.BotMenuScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WorkspaceTestModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(WorkspaceTestModMenus.BOT_MENU.get(), BotMenuScreen::new);
			MenuScreens.register(WorkspaceTestModMenus.MINEGUI.get(), MineguiScreen::new);
			MenuScreens.register(WorkspaceTestModMenus.TRANSPORTGUI.get(), TransportguiScreen::new);
			MenuScreens.register(WorkspaceTestModMenus.SMELTERYGUI.get(), SmelteryguiScreen::new);
			MenuScreens.register(WorkspaceTestModMenus.RIGGUI.get(), RigguiScreen::new);
			MenuScreens.register(WorkspaceTestModMenus.REACTOR_GUI.get(), ReactorGUIScreen::new);
		});
	}
}
