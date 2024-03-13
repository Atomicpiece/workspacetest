package net.mcreator.workspacetest.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.workspacetest.block.model.MinesDisplayModel;
import net.mcreator.workspacetest.block.display.MinesDisplayItem;

public class MinesDisplayItemRenderer extends GeoItemRenderer<MinesDisplayItem> {
	public MinesDisplayItemRenderer() {
		super(new MinesDisplayModel());
	}

	@Override
	public RenderType getRenderType(MinesDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
