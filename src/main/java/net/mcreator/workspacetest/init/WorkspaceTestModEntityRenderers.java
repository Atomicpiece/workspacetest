
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.workspacetest.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.workspacetest.client.renderer.WarplaneRenderer;
import net.mcreator.workspacetest.client.renderer.TurretRenderer;
import net.mcreator.workspacetest.client.renderer.TinybotRenderer;
import net.mcreator.workspacetest.client.renderer.TankRenderer;
import net.mcreator.workspacetest.client.renderer.SubmarineRenderer;
import net.mcreator.workspacetest.client.renderer.SpiderbotRenderer;
import net.mcreator.workspacetest.client.renderer.SkeleterRenderer;
import net.mcreator.workspacetest.client.renderer.RoboticPhantomRenderer;
import net.mcreator.workspacetest.client.renderer.RedstoneVoltRenderer;
import net.mcreator.workspacetest.client.renderer.MossyGolemRenderer;
import net.mcreator.workspacetest.client.renderer.MissileRenderer;
import net.mcreator.workspacetest.client.renderer.MicrobotRenderer;
import net.mcreator.workspacetest.client.renderer.MagicalBoltRenderer;
import net.mcreator.workspacetest.client.renderer.LevitationRobotRenderer;
import net.mcreator.workspacetest.client.renderer.IronSwordRenderer;
import net.mcreator.workspacetest.client.renderer.GreatChickenRenderer;
import net.mcreator.workspacetest.client.renderer.FurnacePoweredGolemRenderer;
import net.mcreator.workspacetest.client.renderer.FrostBlazeRenderer;
import net.mcreator.workspacetest.client.renderer.FireboltRenderer;
import net.mcreator.workspacetest.client.renderer.FallingbombRenderer;
import net.mcreator.workspacetest.client.renderer.DroneRenderer;
import net.mcreator.workspacetest.client.renderer.DestroyerRenderer;
import net.mcreator.workspacetest.client.renderer.DefenderRenderer;
import net.mcreator.workspacetest.client.renderer.CreeperbotRenderer;
import net.mcreator.workspacetest.client.renderer.BombRenderer;
import net.mcreator.workspacetest.client.renderer.BattleshipRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WorkspaceTestModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(WorkspaceTestModEntities.MICROBOT.get(), MicrobotRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.TINYBOT.get(), TinybotRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.TANK.get(), TankRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.TANK_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.DESTROYER.get(), DestroyerRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.FIREBOLT.get(), FireboltRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.LEVITATION_ROBOT.get(), LevitationRobotRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.DRONE.get(), DroneRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.IRON_SWORD.get(), IronSwordRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.CREEPERBOT.get(), CreeperbotRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.SPIDERBOT.get(), SpiderbotRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.FALLINGBOMB.get(), FallingbombRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.ROBOTIC_PHANTOM.get(), RoboticPhantomRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.BOMB.get(), BombRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.WARPLANE.get(), WarplaneRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.SKELETER.get(), SkeleterRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.MOSSY_GOLEM.get(), MossyGolemRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.GREAT_CHICKEN.get(), GreatChickenRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.FROST_BLAZE.get(), FrostBlazeRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.FROST_BLAZE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.FURNACE_POWERED_GOLEM.get(), FurnacePoweredGolemRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.DEFENDER.get(), DefenderRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.MAGICAL_BOLT.get(), MagicalBoltRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.REDSTONE_VOLT.get(), RedstoneVoltRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.BATTLESHIP.get(), BattleshipRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.TURRET.get(), TurretRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.TURRET_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.SUBMARINE.get(), SubmarineRenderer::new);
		event.registerEntityRenderer(WorkspaceTestModEntities.MISSILE.get(), MissileRenderer::new);
	}
}
