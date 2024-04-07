package net.mcreator.workspacetest.client.gui;

public class SmelteryguiScreen extends AbstractContainerScreen<SmelteryguiMenu> {

	private final static HashMap<String, Object> guistate = SmelteryguiMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public SmelteryguiScreen(SmelteryguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("workspace_test:textures/screens/smelterygui.png");

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

		guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/x.png"), this.leftPos + 20, this.topPos + 29, 0, 0, 16, 16, 16, 16);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.smelterygui.label_smeltery"), 62, 3, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.smelterygui.label_speed"), 58, 13, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.smelterygui.label_product"), 81, 69, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.smelterygui.label_requirements"), 61, 49, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.smelterygui.label_status"), 61, 24, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.smelterygui.label_recipe"), 58, 35, -12829636, false);
		guiGraphics.drawString(this.font,

				Smeltinp1Procedure.execute(), 97, 35, -12829636, false);
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
