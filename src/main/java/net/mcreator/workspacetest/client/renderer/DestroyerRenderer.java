
package net.mcreator.workspacetest.client.renderer;

public class DestroyerRenderer extends GeoEntityRenderer<DestroyerEntity> {
	public DestroyerRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new DestroyerModel());
		this.shadowRadius = 0.6f;
	}

	@Override
	public RenderType getRenderType(DestroyerEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, DestroyerEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

}