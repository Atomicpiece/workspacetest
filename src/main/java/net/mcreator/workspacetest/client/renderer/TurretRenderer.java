
package net.mcreator.workspacetest.client.renderer;

public class TurretRenderer extends GeoEntityRenderer<TurretEntity> {
	public TurretRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new TurretModel());
		this.shadowRadius = 0.8f;
	}

	@Override
	public RenderType getRenderType(TurretEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, TurretEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

}