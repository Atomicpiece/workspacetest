package net.mcreator.workspacetest.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

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