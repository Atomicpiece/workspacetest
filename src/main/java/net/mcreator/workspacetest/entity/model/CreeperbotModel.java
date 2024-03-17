package net.mcreator.workspacetest.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class CreeperbotModel extends GeoModel<CreeperbotEntity> {
	@Override
	public ResourceLocation getAnimationResource(CreeperbotEntity entity) {
		return new ResourceLocation("workspace_test", "animations/robocreeper.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CreeperbotEntity entity) {
		return new ResourceLocation("workspace_test", "geo/robocreeper.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CreeperbotEntity entity) {
		return new ResourceLocation("workspace_test", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(CreeperbotEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}