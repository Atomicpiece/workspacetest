
package net.mcreator.workspacetest.client.renderer;

public class DroneRenderer extends MobRenderer<DroneEntity, ModelDrone<DroneEntity>> {

	public DroneRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelDrone(context.bakeLayer(ModelDrone.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(DroneEntity entity) {
		return new ResourceLocation("workspace_test:textures/entities/drone_texture.png");
	}

}
