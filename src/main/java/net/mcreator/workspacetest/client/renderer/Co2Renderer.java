package net.mcreator.workspacetest.client.renderer;

import com.mojang.math.Axis;

public class Co2Renderer extends EntityRenderer<Co2Entity> {

	private static final ResourceLocation texture = new ResourceLocation("workspace_test:textures/entities/missiled.png");

	private final Modelmissile model;

	public Co2Renderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelmissile(context.bakeLayer(Modelmissile.LAYER_LOCATION));
	}

	@Override
	public void render(Co2Entity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();

		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(Co2Entity entity) {
		return texture;
	}

}
