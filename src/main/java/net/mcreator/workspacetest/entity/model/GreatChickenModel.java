package net.mcreator.workspacetest.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class GreatChickenModel extends GeoModel<GreatChickenEntity> {
	@Override
	public ResourceLocation getAnimationResource(GreatChickenEntity entity) {
		return new ResourceLocation("workspace_test", "animations/chick.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GreatChickenEntity entity) {
		return new ResourceLocation("workspace_test", "geo/chick.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GreatChickenEntity entity) {
		return new ResourceLocation("workspace_test", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(GreatChickenEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}