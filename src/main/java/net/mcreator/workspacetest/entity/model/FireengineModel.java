package net.mcreator.workspacetest.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.workspacetest.entity.FireengineEntity;

public class FireengineModel extends GeoModel<FireengineEntity> {
	@Override
	public ResourceLocation getAnimationResource(FireengineEntity entity) {
		return new ResourceLocation("workspace_test", "animations/fire_engine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FireengineEntity entity) {
		return new ResourceLocation("workspace_test", "geo/fire_engine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FireengineEntity entity) {
		return new ResourceLocation("workspace_test", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(FireengineEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
