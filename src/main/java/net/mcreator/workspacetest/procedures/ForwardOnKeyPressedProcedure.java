package net.mcreator.workspacetest.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ForwardOnKeyPressedProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.isVehicle()) {
			if (entity instanceof FireengineEntity) {
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() * 0.1), (entity.getDeltaMovement().y() * 0.1), (entity.getDeltaMovement().z() * 0.1)));
			}
		}
	}
}
