package net.mcreator.workspacetest.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class MicrobotModel extends GeoModel<MicrobotEntity> {
	@Override
	public ResourceLocation getAnimationResource(MicrobotEntity entity) {
		return new ResourceLocation("workspace_test", "animations/endermite.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MicrobotEntity entity) {
		return new ResourceLocation("workspace_test", "geo/endermite.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MicrobotEntity entity) {
		return new ResourceLocation("workspace_test", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(MicrobotEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}