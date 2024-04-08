package net.mcreator.workspacetest.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class Firetester0OnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (Items.COAL == (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.COAL);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			world.setBlock(BlockPos.containing(x, y, z), WorkspaceTestModBlocks.FIRETESTER.get().defaultBlockState(), 3);
		}
	}
}
