package net.mcreator.workspacetest.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class FrostBlazeModel extends GeoModel<FrostBlazeEntity> {
	@Override
	public ResourceLocation getAnimationResource(FrostBlazeEntity entity) {
		return new ResourceLocation("workspace_test", "animations/blaze.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FrostBlazeEntity entity) {
		return new ResourceLocation("workspace_test", "geo/blaze.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FrostBlazeEntity entity) {
		return new ResourceLocation("workspace_test", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(FrostBlazeEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}