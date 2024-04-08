
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
import net.mcreator.workspacetest.client.particle.RadfireParticle;
import net.mcreator.workspacetest.client.particle.MetafireParticle;
import net.mcreator.workspacetest.client.particle.GasfireParticle;
import net.mcreator.workspacetest.client.particle.FoamsParticle;
import net.mcreator.workspacetest.client.particle.CrudedripParticle;
import net.mcreator.workspacetest.client.particle.CreafireParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WorkspaceTestModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(WorkspaceTestModParticleTypes.CRUDEDRIP.get(), CrudedripParticle::provider);
		event.registerSpriteSet(WorkspaceTestModParticleTypes.FOAMS.get(), FoamsParticle::provider);
		event.registerSpriteSet(WorkspaceTestModParticleTypes.WASSER.get(), WasserParticle::provider);
		event.registerSpriteSet(WorkspaceTestModParticleTypes.CREAFIRE.get(), CreafireParticle::provider);
		event.registerSpriteSet(WorkspaceTestModParticleTypes.RADFIRE.get(), RadfireParticle::provider);
		event.registerSpriteSet(WorkspaceTestModParticleTypes.METAFIRE.get(), MetafireParticle::provider);
		event.registerSpriteSet(WorkspaceTestModParticleTypes.GASFIRE.get(), GasfireParticle::provider);
		event.registerSpriteSet(WorkspaceTestModParticleTypes.SMOKE.get(), SmokeParticle::provider);
	}
}
