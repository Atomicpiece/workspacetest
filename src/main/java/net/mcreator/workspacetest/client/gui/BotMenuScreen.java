package net.mcreator.workspacetest.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.workspacetest.world.inventory.BotMenuMenu;
import net.mcreator.workspacetest.procedures.TbProcedure;
import net.mcreator.workspacetest.procedures.MbProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BotMenuScreen extends AbstractContainerScreen<BotMenuMenu> {
	private final static HashMap<String, Object> guistate = BotMenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_screemn;

	public BotMenuScreen(BotMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("workspace_test:textures/screens/bot_menu.png");

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

		guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/monitor.png"), this.leftPos + 161, this.topPos + 2, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/monitor.png"), this.leftPos + 8, this.topPos + 2, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/monitor.png"), this.leftPos + 8, this.topPos + 74, 0, 0, 8, 8, 8, 8);

		guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/monitor.png"), this.leftPos + 161, this.topPos + 74, 0, 0, 8, 8, 8, 8);

		if (MbProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/myte.png"), this.leftPos + 89, this.topPos + 11, 0, 0, 64, 64, 64, 64);
		}
		if (TbProcedure.execute(entity)) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/bot.png"), this.leftPos + 89, this.topPos + 11, 0, 0, 64, 64, 64, 64);
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
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_screemn = new ImageButton(this.leftPos + 89, this.topPos + 11, 64, 64, 0, 0, 64, new ResourceLocation("workspace_test:textures/screens/atlas/imagebutton_screemn.png"), 64, 128, e -> {
		});
		guistate.put("button:imagebutton_screemn", imagebutton_screemn);
		this.addRenderableWidget(imagebutton_screemn);
	}
}
