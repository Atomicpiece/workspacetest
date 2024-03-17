package net.mcreator.workspacetest.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class TinybotModel extends GeoModel<TinybotEntity> {
	@Override
	public ResourceLocation getAnimationResource(TinybotEntity entity) {
		return new ResourceLocation("workspace_test", "animations/robot.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TinybotEntity entity) {
		return new ResourceLocation("workspace_test", "geo/robot.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TinybotEntity entity) {
		return new ResourceLocation("workspace_test", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(TinybotEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}