package net.mcreator.workspacetest.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class BattleshipModel extends GeoModel<BattleshipEntity> {
	@Override
	public ResourceLocation getAnimationResource(BattleshipEntity entity) {
		return new ResourceLocation("workspace_test", "animations/battleship.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BattleshipEntity entity) {
		return new ResourceLocation("workspace_test", "geo/battleship.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BattleshipEntity entity) {
		return new ResourceLocation("workspace_test", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(BattleshipEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}