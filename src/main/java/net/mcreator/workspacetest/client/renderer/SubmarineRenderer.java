
package net.mcreator.workspacetest.client.renderer;

public class SubmarineRenderer extends GeoEntityRenderer<SubmarineEntity> {
	public SubmarineRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new SubmarineModel());
		this.shadowRadius = 1f;
	}

	@Override
	public RenderType getRenderType(SubmarineEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, SubmarineEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	protected float getDeathMaxRotation(SubmarineEntity entityLivingBaseIn) {
		return 0.0F;
	}
}