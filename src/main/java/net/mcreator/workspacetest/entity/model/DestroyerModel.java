package net.mcreator.workspacetest.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class DestroyerModel extends GeoModel<DestroyerEntity> {
	@Override
	public ResourceLocation getAnimationResource(DestroyerEntity entity) {
		return new ResourceLocation("workspace_test", "animations/destroyer.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(DestroyerEntity entity) {
		return new ResourceLocation("workspace_test", "geo/destroyer.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DestroyerEntity entity) {
		return new ResourceLocation("workspace_test", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(DestroyerEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}