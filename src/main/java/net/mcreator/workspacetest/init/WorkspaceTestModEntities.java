
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

import net.mcreator.workspacetest.entity.WarplaneEntity;
import net.mcreator.workspacetest.entity.TinybotEntity;
import net.mcreator.workspacetest.entity.TankEntity;
import net.mcreator.workspacetest.entity.SpiderbotEntity;
import net.mcreator.workspacetest.entity.SkeleterEntity;
import net.mcreator.workspacetest.entity.RoboticPhantomEntity;
import net.mcreator.workspacetest.entity.RedstoneVoltEntity;
import net.mcreator.workspacetest.entity.MossyGolemEntity;
import net.mcreator.workspacetest.entity.MicrobotEntity;
import net.mcreator.workspacetest.entity.MagicalBoltEntity;
import net.mcreator.workspacetest.entity.LevitationRobotEntity;
import net.mcreator.workspacetest.entity.IronSwordEntity;
import net.mcreator.workspacetest.entity.GreatChickenEntity;
import net.mcreator.workspacetest.entity.FurnacePoweredGolemEntity;
import net.mcreator.workspacetest.entity.FrostBlazeEntityProjectile;
import net.mcreator.workspacetest.entity.FrostBlazeEntity;
import net.mcreator.workspacetest.entity.FireboltEntity;
import net.mcreator.workspacetest.entity.FallingbombEntity;
import net.mcreator.workspacetest.entity.DroneEntity;
import net.mcreator.workspacetest.entity.DestroyerEntity;
import net.mcreator.workspacetest.entity.DefenderEntity;
import net.mcreator.workspacetest.entity.CreeperbotEntity;
import net.mcreator.workspacetest.entity.BombEntity;
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
	public static final RegistryObject<EntityType<FallingbombEntity>> FALLINGBOMB = register("projectile_fallingbomb",
			EntityType.Builder.<FallingbombEntity>of(FallingbombEntity::new, MobCategory.MISC).setCustomClientFactory(FallingbombEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RoboticPhantomEntity>> ROBOTIC_PHANTOM = register("robotic_phantom",
			EntityType.Builder.<RoboticPhantomEntity>of(RoboticPhantomEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RoboticPhantomEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BombEntity>> BOMB = register("bomb",
			EntityType.Builder.<BombEntity>of(BombEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BombEntity::new)

					.sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<WarplaneEntity>> WARPLANE = register("warplane",
			EntityType.Builder.<WarplaneEntity>of(WarplaneEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WarplaneEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<SkeleterEntity>> SKELETER = register("skeleter",
			EntityType.Builder.<SkeleterEntity>of(SkeleterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SkeleterEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MossyGolemEntity>> MOSSY_GOLEM = register("mossy_golem",
			EntityType.Builder.<MossyGolemEntity>of(MossyGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MossyGolemEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GreatChickenEntity>> GREAT_CHICKEN = register("great_chicken",
			EntityType.Builder.<GreatChickenEntity>of(GreatChickenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GreatChickenEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<FrostBlazeEntity>> FROST_BLAZE = register("frost_blaze",
			EntityType.Builder.<FrostBlazeEntity>of(FrostBlazeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FrostBlazeEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FrostBlazeEntityProjectile>> FROST_BLAZE_PROJECTILE = register("projectile_frost_blaze", EntityType.Builder.<FrostBlazeEntityProjectile>of(FrostBlazeEntityProjectile::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(FrostBlazeEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FurnacePoweredGolemEntity>> FURNACE_POWERED_GOLEM = register("furnace_powered_golem",
			EntityType.Builder.<FurnacePoweredGolemEntity>of(FurnacePoweredGolemEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FurnacePoweredGolemEntity::new)

					.sized(1f, 2f));
	public static final RegistryObject<EntityType<DefenderEntity>> DEFENDER = register("defender",
			EntityType.Builder.<DefenderEntity>of(DefenderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DefenderEntity::new)

					.sized(1f, 2f));
	public static final RegistryObject<EntityType<MagicalBoltEntity>> MAGICAL_BOLT = register("projectile_magical_bolt",
			EntityType.Builder.<MagicalBoltEntity>of(MagicalBoltEntity::new, MobCategory.MISC).setCustomClientFactory(MagicalBoltEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RedstoneVoltEntity>> REDSTONE_VOLT = register("projectile_redstone_volt",
			EntityType.Builder.<RedstoneVoltEntity>of(RedstoneVoltEntity::new, MobCategory.MISC).setCustomClientFactory(RedstoneVoltEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

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
			RoboticPhantomEntity.init();
			BombEntity.init();
			WarplaneEntity.init();
			SkeleterEntity.init();
			MossyGolemEntity.init();
			GreatChickenEntity.init();
			FrostBlazeEntity.init();
			FurnacePoweredGolemEntity.init();
			DefenderEntity.init();
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
		event.put(ROBOTIC_PHANTOM.get(), RoboticPhantomEntity.createAttributes().build());
		event.put(BOMB.get(), BombEntity.createAttributes().build());
		event.put(WARPLANE.get(), WarplaneEntity.createAttributes().build());
		event.put(SKELETER.get(), SkeleterEntity.createAttributes().build());
		event.put(MOSSY_GOLEM.get(), MossyGolemEntity.createAttributes().build());
		event.put(GREAT_CHICKEN.get(), GreatChickenEntity.createAttributes().build());
		event.put(FROST_BLAZE.get(), FrostBlazeEntity.createAttributes().build());
		event.put(FURNACE_POWERED_GOLEM.get(), FurnacePoweredGolemEntity.createAttributes().build());
		event.put(DEFENDER.get(), DefenderEntity.createAttributes().build());
	}
}
