package net.mcreator.workspacetest.block.model;

public class MinesDisplayModel extends GeoModel<MinesDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(MinesDisplayItem animatable) {
		return new ResourceLocation("workspace_test", "animations/mine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MinesDisplayItem animatable) {
		return new ResourceLocation("workspace_test", "geo/mine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MinesDisplayItem entity) {
		return new ResourceLocation("workspace_test", "textures/block/minestext.png");
	}
}