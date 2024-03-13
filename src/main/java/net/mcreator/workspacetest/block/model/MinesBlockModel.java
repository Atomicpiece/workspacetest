package net.mcreator.workspacetest.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.workspacetest.block.entity.MinesTileEntity;

public class MinesBlockModel extends GeoModel<MinesTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(MinesTileEntity animatable) {
		return new ResourceLocation("workspace_test", "animations/mine.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MinesTileEntity animatable) {
		return new ResourceLocation("workspace_test", "geo/mine.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MinesTileEntity entity) {
		return new ResourceLocation("workspace_test", "textures/block/minestext.png");
	}
}
