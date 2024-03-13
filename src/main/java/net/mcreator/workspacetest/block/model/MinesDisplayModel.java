package net.mcreator.workspacetest.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.workspacetest.block.display.MinesDisplayItem;

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
