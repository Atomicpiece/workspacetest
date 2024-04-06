package net.mcreator.workspacetest.client.gui;

public class RigguiScreen extends AbstractContainerScreen<RigguiMenu> {

	private final static HashMap<String, Object> guistate = RigguiMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	EditBox minespend;

	Button button_start;
	Button button_save;

	public RigguiScreen(RigguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 214;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("workspace_test:textures/screens/riggui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);

		super.render(guiGraphics, mouseX, mouseY, partialTicks);

		minespend.render(guiGraphics, mouseX, mouseY, partialTicks);

		this.renderTooltip(guiGraphics, mouseX, mouseY);

	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/monitor.png"), this.leftPos + 7, this.topPos + 17, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/monitor.png"), this.leftPos + 7, this.topPos + 31, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/monitor.png"), this.leftPos + 7, this.topPos + 45, 0, 0, 8, 8, 8, 8);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}

		if (minespend.isFocused())
			return minespend.keyPressed(key, b, c);

		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		minespend.tick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.riggui.label_mine"), 5, 4, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.riggui.label_resource"), 18, 16, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.riggui.label_mining_rate"), 18, 44, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.riggui.label_status"), 18, 30, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.riggui.label_output"), 150, 60, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.riggui.label_power_usage"), 81, 73, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.riggui.label_mining_speed"), 107, 6, -12829636, false);
		guiGraphics.drawString(this.font,

				MinepowerusageProcedure.execute(world, x, y, z, guistate), 150, 73, -12829636, false);
		guiGraphics.drawString(this.font,

				MiningrateProcedure.execute(world, x, y, z), 84, 43, -12829636, false);
		guiGraphics.drawString(this.font,

				OilproProcedure.execute(world, x, y, z), 70, 16, -12829636, false);
		guiGraphics.drawString(this.font,

				RunProcedure.execute(world, x, y, z), 58, 29, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();

		minespend = new EditBox(this.font, this.leftPos + 179, this.topPos + 7, 21, 18, Component.translatable("gui.workspace_test.riggui.minespend"));
		minespend.setMaxLength(32767);

		guistate.put("text:minespend", minespend);
		this.addWidget(this.minespend);

		button_start = Button.builder(Component.translatable("gui.workspace_test.riggui.button_start"), e -> {
			if (true) {
				WorkspaceTestMod.PACKET_HANDLER.sendToServer(new RigguiButtonMessage(0, x, y, z));
				RigguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 4, this.topPos + 56, 77, 20).build();

		guistate.put("button:button_start", button_start);
		this.addRenderableWidget(button_start);

		button_save = Button.builder(Component.translatable("gui.workspace_test.riggui.button_save"), e -> {
			if (true) {
				WorkspaceTestMod.PACKET_HANDLER.sendToServer(new RigguiButtonMessage(1, x, y, z));
				RigguiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 116, this.topPos + 17, 46, 20).build();

		guistate.put("button:button_save", button_save);
		this.addRenderableWidget(button_save);

	}

}
