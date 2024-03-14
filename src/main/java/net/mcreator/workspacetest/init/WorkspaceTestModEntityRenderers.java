
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.workspacetest.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.workspacetest.client.renderer.TinybotRenderer;
import net.mcreator.workspacetest.client.renderer.TankRenderer;
import net.mcreator.workspacetest.client.renderer.SpiderbotRenderer;
import net.mcreator.workspacetest.client.renderer.MicrobotRenderer;
import net.mcreator.workspacetest.client.renderer.LevitationRobotRenderer;
import net.mcreator.workspacetest.client.renderer.IronSwordRenderer;
import net.mcreator.workspacetest.client.renderer.FireboltRenderer;
import net.mcreator.workspacetest.client.renderer.DroneRenderer;
import net.mcreator.workspacetest.client.renderer.DestroyerRenderer;
import net.mcreator.workspacetest.client.renderer.CreeperbotRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WorkspaceTestModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(WorkspaceTestModEntities.MICROBOT.get(), MicrobotRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.TINYBOT.get(), TinybotRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.TANK.get(), TankRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.DESTROYER.get(), DestroyerRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.FIREBOLT.get(), FireboltRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.LEVITATION_ROBOT.get(), LevitationRobotRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.DRONE.get(), DroneRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.IRON_SWORD.get(), IronSwordRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.CREEPERBOT.get(), CreeperbotRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.SPIDERBOT.get(), SpiderbotRenderer::new);
	}
}
