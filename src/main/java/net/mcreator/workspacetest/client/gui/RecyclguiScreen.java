package net.mcreator.workspacetest.client.gui;

public class RecyclguiScreen extends AbstractContainerScreen<RecyclguiMenu> {

	private final static HashMap<String, Object> guistate = RecyclguiMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	Button button_process;

	ImageButton imagebutton_preocess1;

	public RecyclguiScreen(RecyclguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("workspace_test:textures/screens/recyclgui.png");

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

		if (

		Process2Procedure.execute()

		) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/process2.png"), this.leftPos + 41, this.topPos + 43, 0, 0, 16, 16, 16, 16);
		}
		if (

		Process3Procedure.execute()

		) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/process3.png"), this.leftPos + 41, this.topPos + 43, 0, 0, 16, 16, 16, 16);
		}
		if (

		Process4Procedure.execute()

		) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/process4.png"), this.leftPos + 41, this.topPos + 43, 0, 0, 16, 16, 16, 16);
		}
		if (

		Process5Procedure.execute()

		) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/process5.png"), this.leftPos + 41, this.topPos + 43, 0, 0, 16, 16, 16, 16);
		}
		if (

		Process6Procedure.execute()

		) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/process6.png"), this.leftPos + 41, this.topPos + 43, 0, 0, 16, 16, 16, 16);
		}
		if (

		Process7Procedure.execute()

		) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/process7.png"), this.leftPos + 41, this.topPos + 43, 0, 0, 16, 16, 16, 16);
		}
		if (

		Process8Procedure.execute()

		) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/process8.png"), this.leftPos + 41, this.topPos + 43, 0, 0, 16, 16, 16, 16);
		}
		if (

		Process0Procedure.execute()

		) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/preocess1.png"), this.leftPos + 41, this.topPos + 43, 0, 0, 16, 16, 16, 16);
		}

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
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.recyclgui.label_recycler"), 61, 3, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();

		button_process = Button.builder(Component.translatable("gui.workspace_test.recyclgui.button_process"), e -> {
			if (true) {
				WorkspaceTestMod.PACKET_HANDLER.sendToServer(new RecyclguiButtonMessage(0, x, y, z));
				RecyclguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 13, this.topPos + 17, 41, 20).build();

		guistate.put("button:button_process", button_process);
		this.addRenderableWidget(button_process);

		imagebutton_preocess1 = new ImageButton(this.leftPos + 41, this.topPos + 43, 16, 16, 0, 0, 16, new ResourceLocation("workspace_test:textures/screens/atlas/imagebutton_preocess1.png"), 16, 32, e -> {
		}) {
			@Override
			public void render(GuiGraphics guiGraphics, int gx, int gy, float ticks) {
				if (

				Process1Procedure.execute()

				)
					super.render(guiGraphics, gx, gy, ticks);
			}
		};

		guistate.put("button:imagebutton_preocess1", imagebutton_preocess1);
		this.addRenderableWidget(imagebutton_preocess1);

	}

}
