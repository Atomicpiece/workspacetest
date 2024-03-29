package net.mcreator.workspacetest.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.workspacetest.WorkspaceTestMod;

public class TurretEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity == entity) {
			if (entity instanceof Player _player) {
				_player.getAbilities().invulnerable = false;
				_player.onUpdateAbilities();
			}
		}
		WorkspaceTestMod.queueServerWork(2, () -> {
			if (entity instanceof Player _player) {
				_player.getAbilities().invulnerable = true;
				_player.onUpdateAbilities();
			}
		});
	}
}
