package net.mcreator.workspacetest.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.workspacetest.world.inventory.MineguiMenu;
import net.mcreator.workspacetest.procedures.MinepowerusageProcedure;
import net.mcreator.workspacetest.procedures.IronproProcedure;
import net.mcreator.workspacetest.procedures.GoldproProcedure;
import net.mcreator.workspacetest.procedures.CoalproProcedure;
import net.mcreator.workspacetest.network.MineguiButtonMessage;
import net.mcreator.workspacetest.WorkspaceTestMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class MineguiScreen extends AbstractContainerScreen<MineguiMenu> {
	private final static HashMap<String, Object> guistate = MineguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox minespeed;
	Button button_start;
	Button button_save;

	public MineguiScreen(MineguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 214;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("workspace_test:textures/screens/minegui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		minespeed.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/monitor.png"), this.leftPos + 3, this.topPos + 13, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/monitor.png"), this.leftPos + 3, this.topPos + 27, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/monitor.png"), this.leftPos + 3, this.topPos + 41, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		if (minespeed.isFocused())
			return minespeed.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		minespeed.tick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.minegui.label_mine"), 5, 4, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.minegui.label_resource"), 18, 16, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.minegui.label_mining_rate"), 18, 44, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.minegui.label_status"), 18, 30, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.minegui.label_output"), 124, 61, -12829636, false);
		if (CoalproProcedure.execute(world, x, y, z))
			guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.minegui.label_coal"), 68, 16, -12829636, false);
		if (IronproProcedure.execute(world, x, y, z))
			guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.minegui.label_iron"), 67, 16, -12829636, false);
		if (GoldproProcedure.execute(world, x, y, z))
			guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.minegui.label_gold"), 67, 16, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.minegui.label_power_usage"), 101, 42, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.minegui.label_mining_speed"), 107, 6, -12829636, false);
		guiGraphics.drawString(this.font,

				MinepowerusageProcedure.execute(world, x, y, z, guistate), 163, 42, -12829636, false);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		minespeed = new EditBox(this.font, this.leftPos + 179, this.topPos + 7, 21, 18, Component.translatable("gui.workspace_test.minegui.minespeed"));
		minespeed.setMaxLength(32767);
		guistate.put("text:minespeed", minespeed);
		this.addWidget(this.minespeed);
		button_start = Button.builder(Component.translatable("gui.workspace_test.minegui.button_start"), e -> {
		}).bounds(this.leftPos + 4, this.topPos + 56, 77, 20).build();
		guistate.put("button:button_start", button_start);
		this.addRenderableWidget(button_start);
		button_save = Button.builder(Component.translatable("gui.workspace_test.minegui.button_save"), e -> {
			if (true) {
				WorkspaceTestMod.PACKET_HANDLER.sendToServer(new MineguiButtonMessage(1, x, y, z));
				MineguiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 121, this.topPos + 17, 46, 20).build();
		guistate.put("button:button_save", button_save);
		this.addRenderableWidget(button_save);
	}
}
