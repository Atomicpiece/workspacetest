
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.workspacetest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.workspacetest.fluid.types.CrudeoilFluidType;
import net.mcreator.workspacetest.WorkspaceTestMod;

public class WorkspaceTestModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, WorkspaceTestMod.MODID);
	public static final RegistryObject<FluidType> CRUDEOIL_TYPE = REGISTRY.register("crudeoil", () -> new CrudeoilFluidType());
}
