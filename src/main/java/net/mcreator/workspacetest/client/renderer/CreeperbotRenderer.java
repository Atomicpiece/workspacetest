
package net.mcreator.workspacetest.client.renderer;

public class CreeperbotRenderer extends GeoEntityRenderer<CreeperbotEntity> {
	public CreeperbotRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new CreeperbotModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new CreeperbotLayer(this));
	}

	@Override
	public RenderType getRenderType(CreeperbotEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, CreeperbotEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	protected float getDeathMaxRotation(CreeperbotEntity entityLivingBaseIn) {
		return 0.0F;
	}
}