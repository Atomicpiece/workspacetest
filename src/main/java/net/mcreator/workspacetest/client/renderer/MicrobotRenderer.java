
package net.mcreator.workspacetest.client.renderer;

public class MicrobotRenderer extends GeoEntityRenderer<MicrobotEntity> {
	public MicrobotRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new MicrobotModel());
		this.shadowRadius = 0.6f;
		this.addRenderLayer(new MicrobotLayer(this));
	}

	@Override
	public RenderType getRenderType(MicrobotEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, MicrobotEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

}