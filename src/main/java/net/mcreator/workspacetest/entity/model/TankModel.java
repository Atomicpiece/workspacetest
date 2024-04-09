package net.mcreator.workspacetest.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class TankModel extends GeoModel<TankEntity> {
	@Override
	public ResourceLocation getAnimationResource(TankEntity entity) {
		return new ResourceLocation("workspace_test", "animations/tank.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TankEntity entity) {
		return new ResourceLocation("workspace_test", "geo/tank.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TankEntity entity) {
		return new ResourceLocation("workspace_test", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(TankEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}