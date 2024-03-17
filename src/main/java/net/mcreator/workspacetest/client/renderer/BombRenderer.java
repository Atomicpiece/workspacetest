
package net.mcreator.workspacetest.client.renderer;

public class BombRenderer extends GeoEntityRenderer<BombEntity> {
	public BombRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new BombModel());
		this.shadowRadius = 0.6f;
		this.addRenderLayer(new BombLayer(this));
	}

	@Override
	public RenderType getRenderType(BombEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, BombEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	protected float getDeathMaxRotation(BombEntity entityLivingBaseIn) {
		return 0.0F;
	}
}