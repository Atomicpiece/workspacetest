package net.mcreator.workspacetest.client.gui;

public class CoalguiScreen extends AbstractContainerScreen<CoalguiMenu> {

	private final static HashMap<String, Object> guistate = CoalguiMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public CoalguiScreen(CoalguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("workspace_test:textures/screens/coalgui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);

		super.render(guiGraphics, mouseX, mouseY, partialTicks);

		this.renderTooltip(guiGraphics, mouseX, mouseY);

	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}

		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.coalgui.label_coal_powerplant"), 47, 3, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.coalgui.label_time_remaining"), 18, 45, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.coalgui.label_status"), 18, 54, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.coalgui.label_energy"), 18, 63, -12829636, false);
		guiGraphics.drawString(this.font,

				RanProcedure.execute(), 57, 55, -12829636, false);
		guiGraphics.drawString(this.font,

				RemaincoalProcedure.execute(), 99, 45, -12829636, false);
		guiGraphics.drawString(this.font,

				CoalenProcedure.execute(), 57, 64, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();

	}

}
