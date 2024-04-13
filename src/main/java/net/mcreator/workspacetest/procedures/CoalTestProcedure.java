package net.mcreator.workspacetest.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.network.chat.Component;

import net.mcreator.workspacetest.init.WorkspaceTestModItems;
import net.mcreator.workspacetest.WorkspaceTestMod;

public class CoalTestProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WorkspaceTestModItems.TEST_ITEM.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == WorkspaceTestModItems.TEST_ITEM.get()) {
			if (itemstack.getOrCreateTag().getDouble("timer") < 33) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("Status: Processing (" + Math.round(itemstack.getOrCreateTag().getDouble("timer")) + "/33 Tick)")), true);
				WorkspaceTestMod.queueServerWork(1, () -> {
					itemstack.getOrCreateTag().putDouble("timer", (itemstack.getOrCreateTag().getDouble("timer") + 1));
					CoalTestProcedure.execute(world, x, y, z, entity, itemstack);
				});
			} else if (itemstack.getOrCreateTag().getDouble("timer") >= 33) {
				itemstack.getOrCreateTag().putBoolean("canprocess", true);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Status: Success"), true);
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WorkspaceTestModItems.TEST_ITEM.get()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(WorkspaceTestModItems.TEST_ITEM_2.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					CoalTest2Procedure.execute(world, x, y, z, entity, itemstack);
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == WorkspaceTestModItems.TEST_ITEM.get()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(WorkspaceTestModItems.TEST_ITEM_2.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					CoalTest2Procedure.execute(world, x, y, z, entity, itemstack);
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WorkspaceTestModItems.TEST_ITEM_2.get()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(WorkspaceTestModItems.TEST_ITEM_3.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					CoalTest2Procedure.execute(world, x, y, z, entity, itemstack);
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == WorkspaceTestModItems.TEST_ITEM_2.get()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(WorkspaceTestModItems.TEST_ITEM_3.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					CoalTest2Procedure.execute(world, x, y, z, entity, itemstack);
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WorkspaceTestModItems.TEST_ITEM_3.get()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.AIR);
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == WorkspaceTestModItems.TEST_ITEM_3.get()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.AIR);
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WorkspaceTestModItems.TEST_ITEM_2.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == WorkspaceTestModItems.TEST_ITEM_2.get()) {
			if (itemstack.getOrCreateTag().getDouble("timer") < 33) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("Status: Processing (" + Math.round(itemstack.getOrCreateTag().getDouble("timer")) + "/33 Tick)")), true);
				WorkspaceTestMod.queueServerWork(1, () -> {
					itemstack.getOrCreateTag().putDouble("timer", (itemstack.getOrCreateTag().getDouble("timer") + 1));
					CoalTestProcedure.execute(world, x, y, z, entity, itemstack);
				});
			} else if (itemstack.getOrCreateTag().getDouble("timer") >= 33) {
				itemstack.getOrCreateTag().putBoolean("canprocess", true);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Status: Success"), true);
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WorkspaceTestModItems.TEST_ITEM.get()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(WorkspaceTestModItems.TEST_ITEM_2.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					CoalTest2Procedure.execute(world, x, y, z, entity, itemstack);
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == WorkspaceTestModItems.TEST_ITEM.get()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(WorkspaceTestModItems.TEST_ITEM_2.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					CoalTest2Procedure.execute(world, x, y, z, entity, itemstack);
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WorkspaceTestModItems.TEST_ITEM_2.get()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(WorkspaceTestModItems.TEST_ITEM_3.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					CoalTest2Procedure.execute(world, x, y, z, entity, itemstack);
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == WorkspaceTestModItems.TEST_ITEM_2.get()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(WorkspaceTestModItems.TEST_ITEM_3.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					CoalTest2Procedure.execute(world, x, y, z, entity, itemstack);
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WorkspaceTestModItems.TEST_ITEM_3.get()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.AIR);
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == WorkspaceTestModItems.TEST_ITEM_3.get()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.AIR);
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
			}
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WorkspaceTestModItems.TEST_ITEM_3.get()
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == WorkspaceTestModItems.TEST_ITEM_3.get()) {
			if (itemstack.getOrCreateTag().getDouble("timer") < 34) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal(("Status: Processing (" + Math.round(itemstack.getOrCreateTag().getDouble("timer")) + "/34 Tick)")), true);
				WorkspaceTestMod.queueServerWork(1, () -> {
					itemstack.getOrCreateTag().putDouble("timer", (itemstack.getOrCreateTag().getDouble("timer") + 1));
					CoalTestProcedure.execute(world, x, y, z, entity, itemstack);
				});
			} else if (itemstack.getOrCreateTag().getDouble("timer") >= 34) {
				itemstack.getOrCreateTag().putBoolean("canprocess", true);
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Status: Success"), true);
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WorkspaceTestModItems.TEST_ITEM.get()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(WorkspaceTestModItems.TEST_ITEM_2.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					CoalTest2Procedure.execute(world, x, y, z, entity, itemstack);
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == WorkspaceTestModItems.TEST_ITEM.get()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(WorkspaceTestModItems.TEST_ITEM_2.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					CoalTest2Procedure.execute(world, x, y, z, entity, itemstack);
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WorkspaceTestModItems.TEST_ITEM_2.get()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(WorkspaceTestModItems.TEST_ITEM_3.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					CoalTest2Procedure.execute(world, x, y, z, entity, itemstack);
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == WorkspaceTestModItems.TEST_ITEM_2.get()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(WorkspaceTestModItems.TEST_ITEM_3.get());
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
					CoalTest2Procedure.execute(world, x, y, z, entity, itemstack);
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WorkspaceTestModItems.TEST_ITEM_3.get()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.AIR);
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == WorkspaceTestModItems.TEST_ITEM_3.get()) {
					if (entity instanceof LivingEntity _entity) {
						ItemStack _setstack = new ItemStack(Blocks.AIR);
						_setstack.setCount(1);
						_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
						if (_entity instanceof Player _player)
							_player.getInventory().setChanged();
					}
				}
			}
		}
	}
}
