package net.mcreator.workspacetest.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.workspacetest.init.WorkspaceTestModBlockEntities;
import net.mcreator.workspacetest.WorkspaceTestMod;

@Mod.EventBusSubscriber(modid = WorkspaceTestMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(WorkspaceTestModBlockEntities.MINES.get(), context -> new MinesTileRenderer());
	}
}
