package net.mcreator.workspacetest.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.ParticleTypes;

public class MagicalBoltProjectileHitsPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle(ParticleTypes.ENCHANTED_HIT, x, y, z, 0, 1, 0);
	}
}
