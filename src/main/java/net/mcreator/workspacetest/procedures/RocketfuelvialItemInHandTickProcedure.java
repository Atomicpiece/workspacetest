package net.mcreator.workspacetest.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.workspacetest.init.WorkspaceTestModParticleTypes;
import net.mcreator.workspacetest.init.WorkspaceTestModItems;

public class RocketfuelvialItemInHandTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entUseItem0 ? _entUseItem0.getUseItem() : ItemStack.EMPTY).getItem() == WorkspaceTestModItems.ROCKETFUELVIAL.get() && !(200 <= entity.getY()) && !(entity.getDeltaMovement().x() >= 1.5)
				&& !(entity.getDeltaMovement().y() >= 1.5) && !(entity.getDeltaMovement().z() >= 1.5)) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() * 1.03), (entity.getDeltaMovement().y() * 1.03), (entity.getDeltaMovement().z() * 1.03)));
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (WorkspaceTestModParticleTypes.GASFIRE.get()), x, y, z, 2, 0.2, 0.2, 0.2, 0.1);
		}
	}
}
