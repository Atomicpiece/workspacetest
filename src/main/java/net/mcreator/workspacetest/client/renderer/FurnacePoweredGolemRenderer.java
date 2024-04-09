
package net.mcreator.workspacetest.client.renderer;

public class FurnacePoweredGolemRenderer extends MobRenderer<FurnacePoweredGolemEntity, Modelfurnacegolem<FurnacePoweredGolemEntity>> {

	public FurnacePoweredGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfurnacegolem(context.bakeLayer(Modelfurnacegolem.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(FurnacePoweredGolemEntity entity) {
		return new ResourceLocation("workspace_test:textures/entities/furnacegolemcomplete.png");
	}

}
