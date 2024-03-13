
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.workspacetest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.workspacetest.block.entity.WallsBlockEntity;
import net.mcreator.workspacetest.block.entity.TowerBlockEntity;
import net.mcreator.workspacetest.block.entity.RoboticAssemblerBlockEntity;
import net.mcreator.workspacetest.block.entity.NukeBlockEntity;
import net.mcreator.workspacetest.block.entity.LandmineBlockEntity;
import net.mcreator.workspacetest.WorkspaceTestMod;

public class WorkspaceTestModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, WorkspaceTestMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> NUKE = register("nuke", WorkspaceTestModBlocks.NUKE, NukeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TOWER = register("tower", WorkspaceTestModBlocks.TOWER, TowerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WALLS = register("walls", WorkspaceTestModBlocks.WALLS, WallsBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LANDMINE = register("landmine", WorkspaceTestModBlocks.LANDMINE, LandmineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ROBOTIC_ASSEMBLER = register("robotic_assembler", WorkspaceTestModBlocks.ROBOTIC_ASSEMBLER, RoboticAssemblerBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
