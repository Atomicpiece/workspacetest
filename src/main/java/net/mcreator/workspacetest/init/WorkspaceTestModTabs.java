
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.workspacetest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.workspacetest.WorkspaceTestMod;

public class WorkspaceTestModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WorkspaceTestMod.MODID);
	public static final RegistryObject<CreativeModeTab> TEST = REGISTRY.register("test",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.workspace_test.test")).icon(() -> new ItemStack(Blocks.GILDED_BLACKSTONE)).displayItems((parameters, tabData) -> {
				tabData.accept(WorkspaceTestModItems.BOMBS.get());
				tabData.accept(WorkspaceTestModItems.HEALT_INDICATOR.get());
				tabData.accept(WorkspaceTestModBlocks.OILDIRT.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.OILCOBBLE.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.OILPLANKS.get().asItem());
				tabData.accept(WorkspaceTestModItems.OAT.get());
				tabData.accept(WorkspaceTestModBlocks.BAOBAB.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> DEFENCE = REGISTRY.register("defence",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.workspace_test.defence")).icon(() -> new ItemStack(WorkspaceTestModItems.BOMBS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(WorkspaceTestModItems.MICROBOT_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModItems.TINYBOT_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModBlocks.NUKE.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.TOWER.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.WALLS.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.LANDMINE.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.ROBOTIC_ASSEMBLER.get().asItem());
				tabData.accept(WorkspaceTestModItems.IGNITER.get());
				tabData.accept(WorkspaceTestModItems.PERCENTAGE_CHECKER.get());
				tabData.accept(WorkspaceTestModItems.TANK_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModItems.DESTROYER_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModItems.LEVITATION_ROBOT_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModItems.FIREBELT.get());
				tabData.accept(WorkspaceTestModItems.DRONE_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModItems.ION_SWORD.get());
				tabData.accept(WorkspaceTestModItems.CREEPERBOT_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModItems.SPIDERBOT_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModItems.ROBOTIC_PHANTOM_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModItems.BOMB_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModItems.WARPLANE_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModItems.FIRE_CIRCLE_CREATOR.get());
				tabData.accept(WorkspaceTestModItems.SKELETER_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModItems.MOSSY_GOLEM_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModItems.GREAT_CHICKEN_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModItems.FROST_BLAZE_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModItems.FURNACE_POWERED_GOLEM_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModItems.DEFENDER_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModItems.REDSTRONE_BLASTER.get());
				tabData.accept(WorkspaceTestModItems.WAND.get());
				tabData.accept(WorkspaceTestModItems.BATTLESHIP_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModItems.TURRET_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModItems.SUBMARINE_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModItems.BAZOOKA.get());
				tabData.accept(WorkspaceTestModItems.ROCKET_LAUNCHER_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModItems.DPS_ORB_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModBlocks.ANCIENT_SPAWNER.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> RESOURCES = REGISTRY.register("resources",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.workspace_test.resources")).icon(() -> new ItemStack(Items.RAW_IRON)).displayItems((parameters, tabData) -> {
				tabData.accept(WorkspaceTestModBlocks.CCC.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.COALDE.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.IRONDE.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.GOLDDE.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.COPPERDE.get().asItem());
				tabData.accept(WorkspaceTestModItems.IRONCHUNK.get());
				tabData.accept(WorkspaceTestModItems.COALCHUNK.get());
				tabData.accept(WorkspaceTestModItems.GOLDCHUNK.get());
				tabData.accept(WorkspaceTestModItems.COPPERCHUNK.get());
				tabData.accept(WorkspaceTestModBlocks.TITANDE.get().asItem());
				tabData.accept(WorkspaceTestModItems.TITANCHUNK.get());
				tabData.accept(WorkspaceTestModBlocks.SULFURDE.get().asItem());
				tabData.accept(WorkspaceTestModItems.SULFUR.get());
				tabData.accept(WorkspaceTestModBlocks.LEADDE.get().asItem());
				tabData.accept(WorkspaceTestModItems.LEADCHUNK.get());
				tabData.accept(WorkspaceTestModBlocks.ZINCDE.get().asItem());
				tabData.accept(WorkspaceTestModItems.ZINCCHUNK.get());
				tabData.accept(WorkspaceTestModBlocks.TINDE.get().asItem());
				tabData.accept(WorkspaceTestModItems.TINCHUNK.get());
				tabData.accept(WorkspaceTestModBlocks.DIAMONDDE.get().asItem());
				tabData.accept(WorkspaceTestModItems.DIAMONDS.get());
				tabData.accept(WorkspaceTestModBlocks.TUNGSTENDE.get().asItem());
				tabData.accept(WorkspaceTestModItems.TUNGSTENCHUNK.get());
				tabData.accept(WorkspaceTestModBlocks.URANDE.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.FOREST.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.NITERDE.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.THORDE.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.LITHDE.get().asItem());
				tabData.accept(WorkspaceTestModItems.URANCHUNK.get());
				tabData.accept(WorkspaceTestModItems.NITERCHUNK.get());
				tabData.accept(WorkspaceTestModItems.THORCHUNK.get());
				tabData.accept(WorkspaceTestModItems.LITHCHUNK.get());
				tabData.accept(WorkspaceTestModBlocks.OILRIG.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.FARM.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.CRUDEOILDE.get().asItem());
				tabData.accept(WorkspaceTestModItems.CRUDEOIL_BUCKET.get());
				tabData.accept(WorkspaceTestModItems.CRUDEOILBARREL.get());
				tabData.accept(WorkspaceTestModItems.METALSCRAP.get());
				tabData.accept(WorkspaceTestModBlocks.DESTROYEDMINE.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.RECYCLER.get().asItem());
				tabData.accept(WorkspaceTestModItems.ASH.get());
				tabData.accept(WorkspaceTestModItems.SULPHUR.get());
				tabData.accept(WorkspaceTestModItems.NITER.get());
				tabData.accept(WorkspaceTestModItems.LITHIUM.get());
				tabData.accept(WorkspaceTestModBlocks.APATITEDE.get().asItem());
				tabData.accept(WorkspaceTestModItems.WHITEPHOSPORUS.get());
				tabData.accept(WorkspaceTestModItems.REDPHOSPORUS.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> MACHINES = REGISTRY.register("machines",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.workspace_test.machines")).icon(() -> new ItemStack(Blocks.OBSERVER)).displayItems((parameters, tabData) -> {
				tabData.accept(WorkspaceTestModBlocks.TRANSPORTER.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.SMELTERY.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> TOOLS = REGISTRY.register("tools",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.workspace_test.tools")).icon(() -> new ItemStack(Blocks.TRIPWIRE_HOOK)).displayItems((parameters, tabData) -> {
				tabData.accept(WorkspaceTestModBlocks.INFBAT.get().asItem());
				tabData.accept(WorkspaceTestModItems.MULTIMETER.get());
				tabData.accept(WorkspaceTestModItems.MATCHES.get());
				tabData.accept(WorkspaceTestModItems.EXTINGUISHER.get());
				tabData.accept(WorkspaceTestModItems.FIREOFF.get());
				tabData.accept(WorkspaceTestModItems.FIREHOSE.get());
				tabData.accept(WorkspaceTestModItems.FIREFIGHTER_SUIT_HELMET.get());
				tabData.accept(WorkspaceTestModItems.FIREFIGHTER_SUIT_CHESTPLATE.get());
				tabData.accept(WorkspaceTestModItems.FIREFIGHTER_SUIT_LEGGINGS.get());
				tabData.accept(WorkspaceTestModItems.FIREFIGHTER_SUIT_BOOTS.get());
				tabData.accept(WorkspaceTestModBlocks.FIRETESTER.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.FIRETESTER_0.get().asItem());
				tabData.accept(WorkspaceTestModItems.CHEMICALEXTINGUISHER.get());
				tabData.accept(WorkspaceTestModItems.SMOKER.get());
				tabData.accept(WorkspaceTestModItems.DETOXIFICATOR.get());
				tabData.accept(WorkspaceTestModItems.FIREENGINE_SPAWN_EGG.get());
				tabData.accept(WorkspaceTestModBlocks.CRUDE_OIL_BLOCK.get().asItem());
				tabData.accept(WorkspaceTestModItems.CUTTERS.get());
				tabData.accept(WorkspaceTestModItems.CRYOMATTER.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ELECTRICITY = REGISTRY.register("electricity",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.workspace_test.electricity")).icon(() -> new ItemStack(Blocks.LIGHT)).displayItems((parameters, tabData) -> {
				tabData.accept(WorkspaceTestModBlocks.COALPLANT.get().asItem());
				tabData.accept(WorkspaceTestModBlocks.COALPOWER.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> MY_TAB = REGISTRY.register("my_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.workspace_test.my_tab")).icon(() -> new ItemStack(WorkspaceTestModItems.THORIUM_ROD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(WorkspaceTestModBlocks.REACTOR.get().asItem());
				tabData.accept(WorkspaceTestModItems.URANIUM_ROD.get());
				tabData.accept(WorkspaceTestModItems.EMPTY_ROD.get());
				tabData.accept(WorkspaceTestModItems.THORIUM_ROD.get());
				tabData.accept(WorkspaceTestModBlocks.INF_WAT_STOR.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> PRODUCTS = REGISTRY.register("products",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.workspace_test.products")).icon(() -> new ItemStack(WorkspaceTestModItems.ZINCINGOT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(WorkspaceTestModItems.ZINCINGOT.get());
				tabData.accept(WorkspaceTestModItems.TITANIUMINGOT.get());
				tabData.accept(WorkspaceTestModItems.LEADINGOT.get());
				tabData.accept(WorkspaceTestModItems.TININGOT.get());
				tabData.accept(WorkspaceTestModItems.TUNGSTENINGOT.get());
				tabData.accept(WorkspaceTestModItems.IRONINGOT.get());
				tabData.accept(WorkspaceTestModItems.URANINGOT.get());
				tabData.accept(WorkspaceTestModItems.LITHIUMCUBE.get());
				tabData.accept(WorkspaceTestModItems.THORIUMINGOT.get());
				tabData.accept(WorkspaceTestModItems.BRONZEINGOT.get());
				tabData.accept(WorkspaceTestModItems.STEELINGOT.get());
				tabData.accept(WorkspaceTestModItems.GOLDCUBE.get());
				tabData.accept(WorkspaceTestModItems.COPPERCUBE.get());
				tabData.accept(WorkspaceTestModItems.GLASSPANE.get());
			})

					.build());
}
