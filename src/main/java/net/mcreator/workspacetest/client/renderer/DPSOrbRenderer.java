
package net.mcreator.workspacetest.client.renderer;

public class DPSOrbRenderer extends MobRenderer<DPSOrbEntity, ModelOrb<DPSOrbEntity>> {

	public DPSOrbRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelOrb(context.bakeLayer(ModelOrb.LAYER_LOCATION)), 1f);

	}

	@Override
	public ResourceLocation getTextureLocation(DPSOrbEntity entity) {
		return new ResourceLocation("workspace_test:textures/entities/orb.png");
	}

	@Override
	protected boolean isShaking(DPSOrbEntity entity) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		return

		Shake1Procedure.execute(entity)

		;
	}

}
