
package net.mcreator.workspacetest.client.renderer;

public class WarplaneRenderer extends GeoEntityRenderer<WarplaneEntity> {
	public WarplaneRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new WarplaneModel());
		this.shadowRadius = 1f;
	}

	@Override
	public RenderType getRenderType(WarplaneEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, WarplaneEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

}