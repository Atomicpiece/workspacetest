
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.workspacetest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.workspacetest.WorkspaceTestMod;

public class WorkspaceTestModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, WorkspaceTestMod.MODID);
	public static final RegistryObject<SimpleParticleType> CRUDEDRIP = REGISTRY.register("crudedrip", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> FOAMS = REGISTRY.register("foams", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> WASSER = REGISTRY.register("wasser", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> SMOKE = REGISTRY.register("smoke", () -> new SimpleParticleType(true));
}
