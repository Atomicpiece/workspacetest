package net.mcreator.workspacetest.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.workspacetest.world.inventory.ReactorGUIMenu;
import net.mcreator.workspacetest.procedures.HeatProcedTestProcedure;
import net.mcreator.workspacetest.procedures.FunctionProcProcedure;
import net.mcreator.workspacetest.procedures.FluidTypeProcedure;
import net.mcreator.workspacetest.procedures.FluidP9Procedure;
import net.mcreator.workspacetest.procedures.FluidP8Procedure;
import net.mcreator.workspacetest.procedures.FluidP7Procedure;
import net.mcreator.workspacetest.procedures.FluidP6Procedure;
import net.mcreator.workspacetest.procedures.FluidP5Procedure;
import net.mcreator.workspacetest.procedures.FluidP4Procedure;
import net.mcreator.workspacetest.procedures.FluidP3Procedure;
import net.mcreator.workspacetest.procedures.FluidP2Procedure;
import net.mcreator.workspacetest.procedures.FluidP20Procedure;
import net.mcreator.workspacetest.procedures.FluidP1Procedure;
import net.mcreator.workspacetest.procedures.FluidP19Procedure;
import net.mcreator.workspacetest.procedures.FluidP18Procedure;
import net.mcreator.workspacetest.procedures.FluidP17Procedure;
import net.mcreator.workspacetest.procedures.FluidP16Procedure;
import net.mcreator.workspacetest.procedures.FluidP15Procedure;
import net.mcreator.workspacetest.procedures.FluidP14Procedure;
import net.mcreator.workspacetest.procedures.FluidP13Procedure;
import net.mcreator.workspacetest.procedures.FluidP12Procedure;
import net.mcreator.workspacetest.procedures.FluidP11Procedure;
import net.mcreator.workspacetest.procedures.FluidP10Procedure;
import net.mcreator.workspacetest.procedures.FluidP0Procedure;
import net.mcreator.workspacetest.procedures.EnergyProcProcedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ReactorGUIScreen extends AbstractContainerScreen<ReactorGUIMenu> {
	private final static HashMap<String, Object> guistate = ReactorGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ReactorGUIScreen(ReactorGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 208;
		this.imageHeight = 186;
	}

	private static final ResourceLocation texture = new ResourceLocation("workspace_test:textures/screens/reactor_gui.png");

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
		if (FluidP0Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/tank0.png"), this.leftPos + 184, this.topPos + 26, 0, 0, 16, 40, 16, 40);
		}
		if (FluidP1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/tank1.png"), this.leftPos + 184, this.topPos + 26, 0, 0, 16, 40, 16, 40);
		}
		if (FluidP2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/tank2.png"), this.leftPos + 184, this.topPos + 26, 0, 0, 16, 40, 16, 40);
		}
		if (FluidP3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/tank3.png"), this.leftPos + 184, this.topPos + 26, 0, 0, 16, 40, 16, 40);
		}
		if (FluidP4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/tank4.png"), this.leftPos + 184, this.topPos + 26, 0, 0, 16, 40, 16, 40);
		}
		if (FluidP5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/tank5.png"), this.leftPos + 184, this.topPos + 26, 0, 0, 16, 40, 16, 40);
		}
		if (FluidP6Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/tank6.png"), this.leftPos + 184, this.topPos + 26, 0, 0, 16, 40, 16, 40);
		}
		if (FluidP7Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/tank7.png"), this.leftPos + 184, this.topPos + 26, 0, 0, 16, 40, 16, 40);
		}
		if (FluidP8Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/tank8.png"), this.leftPos + 184, this.topPos + 26, 0, 0, 16, 40, 16, 40);
		}
		if (FluidP9Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/tank9.png"), this.leftPos + 184, this.topPos + 26, 0, 0, 16, 40, 16, 40);
		}
		if (FluidP10Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/tank10.png"), this.leftPos + 184, this.topPos + 26, 0, 0, 16, 40, 16, 40);
		}
		if (FluidP11Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/tank11.png"), this.leftPos + 184, this.topPos + 26, 0, 0, 16, 40, 16, 40);
		}
		if (FluidP12Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/tank12.png"), this.leftPos + 184, this.topPos + 26, 0, 0, 16, 40, 16, 40);
		}
		if (FluidP13Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/tank13.png"), this.leftPos + 184, this.topPos + 26, 0, 0, 16, 40, 16, 40);
		}
		if (FluidP14Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/tank14.png"), this.leftPos + 184, this.topPos + 26, 0, 0, 16, 40, 16, 40);
		}
		if (FluidP15Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/tank15.png"), this.leftPos + 184, this.topPos + 26, 0, 0, 16, 40, 16, 40);
		}
		if (FluidP16Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/tank16.png"), this.leftPos + 184, this.topPos + 26, 0, 0, 16, 40, 16, 40);
		}
		if (FluidP17Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/tank17.png"), this.leftPos + 184, this.topPos + 26, 0, 0, 16, 40, 16, 40);
		}
		if (FluidP18Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/tank18.png"), this.leftPos + 184, this.topPos + 26, 0, 0, 16, 40, 16, 40);
		}
		if (FluidP19Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/tank19.png"), this.leftPos + 184, this.topPos + 26, 0, 0, 16, 40, 16, 40);
		}
		if (FluidP20Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("workspace_test:textures/screens/tank20.png"), this.leftPos + 184, this.topPos + 26, 0, 0, 16, 40, 16, 40);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.reactor_gui.label_reactor"), 85, 8, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.reactor_gui.label_energy"), 4, 26, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.reactor_gui.label_water"), 148, 44, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.reactor_gui.label_rod"), 4, 80, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.reactor_gui.label_output_rod"), 121, 80, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.reactor_gui.label_heat"), 4, 44, -12829636, false);
		guiGraphics.drawString(this.font,

				EnergyProcProcedure.execute(world, x, y, z), 49, 26, -12829636, false);
		guiGraphics.drawString(this.font,

				HeatProcedTestProcedure.execute(world, x, y, z), 31, 44, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.reactor_gui.label_fluid_type"), 49, 62, -12829636, false);
		guiGraphics.drawString(this.font,

				FluidTypeProcedure.execute(world, x, y, z), 112, 62, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.workspace_test.reactor_gui.label_function"), 4, 170, -12829636, false);
		guiGraphics.drawString(this.font,

				FunctionProcProcedure.execute(world, x, y, z), 49, 170, -12829636, false);
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
