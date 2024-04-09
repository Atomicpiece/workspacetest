
package net.mcreator.workspacetest.client.renderer;

public class BattleshipRenderer extends GeoEntityRenderer<BattleshipEntity> {
	public BattleshipRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new BattleshipModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(BattleshipEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, BattleshipEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	protected float getDeathMaxRotation(BattleshipEntity entityLivingBaseIn) {
		return 0.0F;
	}
}