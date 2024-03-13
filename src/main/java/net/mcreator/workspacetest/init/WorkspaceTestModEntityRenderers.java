
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.workspacetest.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.workspacetest.client.renderer.TinybotRenderer;
import net.mcreator.workspacetest.client.renderer.MicrobotRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WorkspaceTestModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(WorkspaceTestModEntities.MICROBOT.get(), MicrobotRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.TINYBOT.get(), TinybotRenderer::new);
	}
}
