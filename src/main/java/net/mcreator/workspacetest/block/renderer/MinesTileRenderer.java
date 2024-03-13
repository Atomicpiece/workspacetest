package net.mcreator.workspacetest.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.workspacetest.block.model.MinesBlockModel;
import net.mcreator.workspacetest.block.entity.MinesTileEntity;

public class MinesTileRenderer extends GeoBlockRenderer<MinesTileEntity> {
	public MinesTileRenderer() {
		super(new MinesBlockModel());
	}

	@Override
	public RenderType getRenderType(MinesTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
