package net.mcreator.workspacetest.client.renderer;

import com.mojang.math.Axis;

public class MagicalBoltRenderer extends EntityRenderer<MagicalBoltEntity> {

	private static final ResourceLocation texture = new ResourceLocation("workspace_test:textures/entities/magicalbolt.png");

	private final Modelmagicalbolt_Converted model;

	public MagicalBoltRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelmagicalbolt_Converted(context.bakeLayer(Modelmagicalbolt_Converted.LAYER_LOCATION));
	}

	@Override
	public void render(MagicalBoltEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();

		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(MagicalBoltEntity entity) {
		return texture;
	}

}
