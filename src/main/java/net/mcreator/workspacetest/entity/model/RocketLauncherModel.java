package net.mcreator.workspacetest.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class RocketLauncherModel extends GeoModel<RocketLauncherEntity> {
	@Override
	public ResourceLocation getAnimationResource(RocketLauncherEntity entity) {
		return new ResourceLocation("workspace_test", "animations/rocketlauncher.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RocketLauncherEntity entity) {
		return new ResourceLocation("workspace_test", "geo/rocketlauncher.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RocketLauncherEntity entity) {
		return new ResourceLocation("workspace_test", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(RocketLauncherEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}