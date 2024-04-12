
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
import net.mcreator.workspacetest.block.entity.TransporterBlockEntity;
import net.mcreator.workspacetest.block.entity.TowerBlockEntity;
import net.mcreator.workspacetest.block.entity.SmelteryBlockEntity;
import net.mcreator.workspacetest.block.entity.RoboticAssemblerBlockEntity;
import net.mcreator.workspacetest.block.entity.RecyclerBlockEntity;
import net.mcreator.workspacetest.block.entity.ReactorBlockEntity;
import net.mcreator.workspacetest.block.entity.OilrigBlockEntity;
import net.mcreator.workspacetest.block.entity.NukeBlockEntity;
import net.mcreator.workspacetest.block.entity.LandmineBlockEntity;
import net.mcreator.workspacetest.block.entity.InfbatBlockEntity;
import net.mcreator.workspacetest.block.entity.InfWatStorBlockEntity;
import net.mcreator.workspacetest.block.entity.FiretesterBlockEntity;
import net.mcreator.workspacetest.block.entity.FarmBlockEntity;
import net.mcreator.workspacetest.block.entity.DestroyedmineBlockEntity;
import net.mcreator.workspacetest.block.entity.CoalpowerBlockEntity;
import net.mcreator.workspacetest.block.entity.CoalplantBlockEntity;
import net.mcreator.workspacetest.block.entity.CccBlockEntity;
import net.mcreator.workspacetest.block.entity.AncientSpawnerBlockEntity;
import net.mcreator.workspacetest.WorkspaceTestMod;

public class WorkspaceTestModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, WorkspaceTestMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> NUKE = register("nuke", WorkspaceTestModBlocks.NUKE, NukeBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TOWER = register("tower", WorkspaceTestModBlocks.TOWER, TowerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> WALLS = register("walls", WorkspaceTestModBlocks.WALLS, WallsBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> LANDMINE = register("landmine", WorkspaceTestModBlocks.LANDMINE, LandmineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ROBOTIC_ASSEMBLER = register("robotic_assembler", WorkspaceTestModBlocks.ROBOTIC_ASSEMBLER, RoboticAssemblerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CCC = register("ccc", WorkspaceTestModBlocks.CCC, CccBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> INFBAT = register("infbat", WorkspaceTestModBlocks.INFBAT, InfbatBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> TRANSPORTER = register("transporter", WorkspaceTestModBlocks.TRANSPORTER, TransporterBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> ANCIENT_SPAWNER = register("ancient_spawner", WorkspaceTestModBlocks.ANCIENT_SPAWNER, AncientSpawnerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SMELTERY = register("smeltery", WorkspaceTestModBlocks.SMELTERY, SmelteryBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COALPLANT = register("coalplant", WorkspaceTestModBlocks.COALPLANT, CoalplantBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> OILRIG = register("oilrig", WorkspaceTestModBlocks.OILRIG, OilrigBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FARM = register("farm", WorkspaceTestModBlocks.FARM, FarmBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> FIRETESTER = register("firetester", WorkspaceTestModBlocks.FIRETESTER, FiretesterBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> REACTOR = register("reactor", WorkspaceTestModBlocks.REACTOR, ReactorBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> DESTROYEDMINE = register("destroyedmine", WorkspaceTestModBlocks.DESTROYEDMINE, DestroyedmineBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> RECYCLER = register("recycler", WorkspaceTestModBlocks.RECYCLER, RecyclerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> COALPOWER = register("coalpower", WorkspaceTestModBlocks.COALPOWER, CoalpowerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> INF_WAT_STOR = register("inf_wat_stor", WorkspaceTestModBlocks.INF_WAT_STOR, InfWatStorBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
