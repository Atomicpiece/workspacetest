package net.mcreator.workspacetest.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.workspacetest.entity.SubmarineEntity;

public class SubmarineModel extends GeoModel<SubmarineEntity> {
	@Override
	public ResourceLocation getAnimationResource(SubmarineEntity entity) {
		return new ResourceLocation("workspace_test", "animations/submarine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SubmarineEntity entity) {
		return new ResourceLocation("workspace_test", "geo/submarine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SubmarineEntity entity) {
		return new ResourceLocation("workspace_test", "textures/entities/" + entity.getTexture() + ".png");
	}

}
