package net.mcreator.workspacetest.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.workspacetest.world.inventory.MineguiMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MineguiScreen extends AbstractContainerScreen<MineguiMenu> {
	private final static HashMap<String, Object> guistate = MineguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_start;

	public MineguiScreen(MineguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("workspace_test:textures/screens/minegui.png");

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

		guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/monitor.png"), this.leftPos + 7, this.topPos + 13, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/monitor.png"), this.leftPos + 7, this.topPos + 27, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/monitor.png"), this.leftPos + 7, this.topPos + 41, 0, 0, 16, 16, 16, 16);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.minegui.label_mine"), 75, 3, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.minegui.label_resource"), 23, 16, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.minegui.label_mining_rate"), 23, 44, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.minegui.label_status"), 23, 30, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.minegui.label_output"), 125, 21, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_start = Button.builder(Component.translatable("gui.workspace_test.minegui.button_start"), e -> {
		}).bounds(this.leftPos + 8, this.topPos + 57, 77, 20).build();
		guistate.put("button:button_start", button_start);
		this.addRenderableWidget(button_start);
	}
}
