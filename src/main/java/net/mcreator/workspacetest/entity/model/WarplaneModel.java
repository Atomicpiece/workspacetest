package net.mcreator.workspacetest.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.workspacetest.entity.WarplaneEntity;

public class WarplaneModel extends GeoModel<WarplaneEntity> {
	@Override
	public ResourceLocation getAnimationResource(WarplaneEntity entity) {
		return new ResourceLocation("workspace_test", "animations/warplane.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WarplaneEntity entity) {
		return new ResourceLocation("workspace_test", "geo/warplane.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WarplaneEntity entity) {
		return new ResourceLocation("workspace_test", "textures/entities/" + entity.getTexture() + ".png");
	}

}
