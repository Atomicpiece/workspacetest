package net.mcreator.workspacetest.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class BombModel extends GeoModel<BombEntity> {
	@Override
	public ResourceLocation getAnimationResource(BombEntity entity) {
		return new ResourceLocation("workspace_test", "animations/movingbomb.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BombEntity entity) {
		return new ResourceLocation("workspace_test", "geo/movingbomb.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BombEntity entity) {
		return new ResourceLocation("workspace_test", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(BombEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}