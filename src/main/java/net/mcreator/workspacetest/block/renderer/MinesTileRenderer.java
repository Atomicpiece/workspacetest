package net.mcreator.workspacetest.block.renderer;

public class MinesTileRenderer extends GeoBlockRenderer<MinesTileEntity> {
	public MinesTileRenderer() {
		super(new MinesBlockModel());
	}

	@Override
	public RenderType getRenderType(MinesTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}