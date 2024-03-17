
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.workspacetest.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.workspacetest.client.model.Modelredstonevolt;
import net.mcreator.workspacetest.client.model.Modelmagicalbolt_Converted;
import net.mcreator.workspacetest.client.model.Modelironsword;
import net.mcreator.workspacetest.client.model.Modelfurnacegolem;
import net.mcreator.workspacetest.client.model.Modelfirebolt;
import net.mcreator.workspacetest.client.model.Modelfallbomb;
import net.mcreator.workspacetest.client.model.ModelDrone;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class WorkspaceTestModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelfirebolt.LAYER_LOCATION, Modelfirebolt::createBodyLayer);
		event.registerLayerDefinition(Modelfallbomb.LAYER_LOCATION, Modelfallbomb::createBodyLayer);
		event.registerLayerDefinition(Modelmagicalbolt_Converted.LAYER_LOCATION, Modelmagicalbolt_Converted::createBodyLayer);
		event.registerLayerDefinition(Modelironsword.LAYER_LOCATION, Modelironsword::createBodyLayer);
		event.registerLayerDefinition(Modelfurnacegolem.LAYER_LOCATION, Modelfurnacegolem::createBodyLayer);
		event.registerLayerDefinition(Modelredstonevolt.LAYER_LOCATION, Modelredstonevolt::createBodyLayer);
		event.registerLayerDefinition(ModelDrone.LAYER_LOCATION, ModelDrone::createBodyLayer);
	}
}
