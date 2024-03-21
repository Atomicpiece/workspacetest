package net.mcreator.workspacetest.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class TurretModel extends GeoModel<TurretEntity> {
	@Override
	public ResourceLocation getAnimationResource(TurretEntity entity) {
		return new ResourceLocation("workspace_test", "animations/turret.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TurretEntity entity) {
		return new ResourceLocation("workspace_test", "geo/turret.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TurretEntity entity) {
		return new ResourceLocation("workspace_test", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(TurretEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}