
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.workspacetest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.workspacetest.entity.TinybotEntity;
import net.mcreator.workspacetest.entity.TankEntity;
import net.mcreator.workspacetest.entity.SpiderbotEntity;
import net.mcreator.workspacetest.entity.MicrobotEntity;
import net.mcreator.workspacetest.entity.LevitationRobotEntity;
import net.mcreator.workspacetest.entity.IronSwordEntity;
import net.mcreator.workspacetest.entity.FireboltEntity;
import net.mcreator.workspacetest.entity.DroneEntity;
import net.mcreator.workspacetest.entity.DestroyerEntity;
import net.mcreator.workspacetest.entity.CreeperbotEntity;
import net.mcreator.workspacetest.WorkspaceTestMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WorkspaceTestModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, WorkspaceTestMod.MODID);
	public static final RegistryObject<EntityType<MicrobotEntity>> MICROBOT = register("microbot",
			EntityType.Builder.<MicrobotEntity>of(MicrobotEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MicrobotEntity::new)

					.sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<TinybotEntity>> TINYBOT = register("tinybot",
			EntityType.Builder.<TinybotEntity>of(TinybotEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TinybotEntity::new)

					.sized(0.6f, 0.5f));
	public static final RegistryObject<EntityType<TankEntity>> TANK = register("tank",
			EntityType.Builder.<TankEntity>of(TankEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TankEntity::new)

					.sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<DestroyerEntity>> DESTROYER = register("destroyer",
			EntityType.Builder.<DestroyerEntity>of(DestroyerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DestroyerEntity::new)

					.sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<FireboltEntity>> FIREBOLT = register("projectile_firebolt",
			EntityType.Builder.<FireboltEntity>of(FireboltEntity::new, MobCategory.MISC).setCustomClientFactory(FireboltEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<LevitationRobotEntity>> LEVITATION_ROBOT = register("levitation_robot",
			EntityType.Builder.<LevitationRobotEntity>of(LevitationRobotEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(LevitationRobotEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<DroneEntity>> DRONE = register("drone",
			EntityType.Builder.<DroneEntity>of(DroneEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DroneEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<IronSwordEntity>> IRON_SWORD = register("projectile_iron_sword",
			EntityType.Builder.<IronSwordEntity>of(IronSwordEntity::new, MobCategory.MISC).setCustomClientFactory(IronSwordEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<CreeperbotEntity>> CREEPERBOT = register("creeperbot",
			EntityType.Builder.<CreeperbotEntity>of(CreeperbotEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CreeperbotEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SpiderbotEntity>> SPIDERBOT = register("spiderbot",
			EntityType.Builder.<SpiderbotEntity>of(SpiderbotEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SpiderbotEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MicrobotEntity.init();
			TinybotEntity.init();
			TankEntity.init();
			DestroyerEntity.init();
			LevitationRobotEntity.init();
			DroneEntity.init();
			CreeperbotEntity.init();
			SpiderbotEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MICROBOT.get(), MicrobotEntity.createAttributes().build());
		event.put(TINYBOT.get(), TinybotEntity.createAttributes().build());
		event.put(TANK.get(), TankEntity.createAttributes().build());
		event.put(DESTROYER.get(), DestroyerEntity.createAttributes().build());
		event.put(LEVITATION_ROBOT.get(), LevitationRobotEntity.createAttributes().build());
		event.put(DRONE.get(), DroneEntity.createAttributes().build());
		event.put(CREEPERBOT.get(), CreeperbotEntity.createAttributes().build());
		event.put(SPIDERBOT.get(), SpiderbotEntity.createAttributes().build());
	}
}
