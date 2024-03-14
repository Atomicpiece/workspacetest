
package net.mcreator.workspacetest.client.renderer;

public class TankRenderer extends GeoEntityRenderer<TankEntity> {
	public TankRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new TankModel());
		this.shadowRadius = 0.6f;
	}

	@Override
	public RenderType getRenderType(TankEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, TankEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

}