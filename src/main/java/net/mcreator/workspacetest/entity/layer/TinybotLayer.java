package net.mcreator.workspacetest.entity.layer;

public class TinybotLayer extends GeoRenderLayer<TinybotEntity> {
	private static final ResourceLocation LAYER = new ResourceLocation("workspace_test", "textures/entities/robot.png");

	public TinybotLayer(GeoRenderer<TinybotEntity> entityRenderer) {
		super(entityRenderer);
	}

	@Override
	public void render(PoseStack poseStack, TinybotEntity animatable, BakedGeoModel bakedModel, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay) {
		RenderType glowRenderType = RenderType.eyes(LAYER);
		getRenderer().reRender(getDefaultBakedModel(animatable), poseStack, bufferSource, animatable, glowRenderType, bufferSource.getBuffer(glowRenderType), partialTick, packedLight, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
	}
}