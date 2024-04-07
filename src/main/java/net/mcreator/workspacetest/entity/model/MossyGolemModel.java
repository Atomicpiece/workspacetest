package net.mcreator.workspacetest.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class MossyGolemModel extends GeoModel<MossyGolemEntity> {
	@Override
	public ResourceLocation getAnimationResource(MossyGolemEntity entity) {
		return new ResourceLocation("workspace_test", "animations/stonegolem.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MossyGolemEntity entity) {
		return new ResourceLocation("workspace_test", "geo/stonegolem.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MossyGolemEntity entity) {
		return new ResourceLocation("workspace_test", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(MossyGolemEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}