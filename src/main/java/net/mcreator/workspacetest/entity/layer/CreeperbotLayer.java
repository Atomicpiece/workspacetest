package net.mcreator.workspacetest.entity.layer;

public class CreeperbotLayer extends GeoRenderLayer<CreeperbotEntity> {
	private static final ResourceLocation LAYER = new ResourceLocation("workspace_test", "textures/entities/robocrepersystems.png");

	public CreeperbotLayer(GeoRenderer<CreeperbotEntity> entityRenderer) {
		super(entityRenderer);
	}

	@Override
	public void render(PoseStack poseStack, CreeperbotEntity animatable, BakedGeoModel bakedModel, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay) {
		RenderType glowRenderType = RenderType.eyes(LAYER);
		getRenderer().reRender(getDefaultBakedModel(animatable), poseStack, bufferSource, animatable, glowRenderType, bufferSource.getBuffer(glowRenderType), partialTick, packedLight, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
	}
}