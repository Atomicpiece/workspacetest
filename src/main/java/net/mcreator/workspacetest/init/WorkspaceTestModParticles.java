
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.workspacetest.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.workspacetest.client.particle.WasserParticle;
import net.mcreator.workspacetest.client.particle.SmokeParticle;
import net.mcreator.workspacetest.client.particle.FoamsParticle;
import net.mcreator.workspacetest.client.particle.CrudedripParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WorkspaceTestModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(WorkspaceTestModParticleTypes.CRUDEDRIP.get(), CrudedripParticle::provider);
		event.registerSpriteSet(WorkspaceTestModParticleTypes.FOAMS.get(), FoamsParticle::provider);
		event.registerSpriteSet(WorkspaceTestModParticleTypes.WASSER.get(), WasserParticle::provider);
		event.registerSpriteSet(WorkspaceTestModParticleTypes.SMOKE.get(), SmokeParticle::provider);
	}
}
