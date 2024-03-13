package net.mcreator.workspacetest.block.renderer;

public class MinesDisplayItemRenderer extends GeoItemRenderer<MinesDisplayItem> {
	public MinesDisplayItemRenderer() {
		super(new MinesDisplayModel());
	}

	@Override
	public RenderType getRenderType(MinesDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}