package net.mcreator.workspacetest.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class SpiderbotModel extends GeoModel<SpiderbotEntity> {
	@Override
	public ResourceLocation getAnimationResource(SpiderbotEntity entity) {
		return new ResourceLocation("workspace_test", "animations/spiderbot.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SpiderbotEntity entity) {
		return new ResourceLocation("workspace_test", "geo/spiderbot.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SpiderbotEntity entity) {
		return new ResourceLocation("workspace_test", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(SpiderbotEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}