package net.mcreator.workspacetest.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.workspacetest.network.WorkspaceTestModVariables;
import net.mcreator.workspacetest.WorkspaceTestMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class NBTRestartProcProcedure {
	@SubscribeEvent
	public static void onWorldLoad(net.minecraftforge.event.level.LevelEvent.Load event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		WorkspaceTestModVariables.MapVariables.get(world).NbtRestart = true;
		WorkspaceTestModVariables.MapVariables.get(world).syncData(world);
		WorkspaceTestMod.queueServerWork(1, () -> {
			WorkspaceTestModVariables.MapVariables.get(world).NbtRestart = false;
			WorkspaceTestModVariables.MapVariables.get(world).syncData(world);
		});
	}
}
