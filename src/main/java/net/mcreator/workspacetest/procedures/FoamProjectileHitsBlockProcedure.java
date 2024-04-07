package net.mcreator.workspacetest.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import net.mcreator.workspacetest.init.WorkspaceTestModParticleTypes;

public class FoamProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (WorkspaceTestModParticleTypes.FOAMS.get()), x, y, z, 5, 0.5, 0.5, 0.5, 1);
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.FIRE) {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
		}
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.FIRE) {
			world.destroyBlock(BlockPos.containing(x, y + 1, z), false);
		}
		if ((new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getPersistentData().getBoolean(tag);
				return false;
			}
		}.getValue(world, BlockPos.containing(x, y, z), "hasfire")) == true) {
			if (!world.isClientSide()) {
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockEntity _blockEntity = world.getBlockEntity(_bp);
				BlockState _bs = world.getBlockState(_bp);
				if (_blockEntity != null)
					_blockEntity.getPersistentData().putBoolean("hasfire", false);
				if (world instanceof Level _level)
					_level.sendBlockUpdated(_bp, _bs, _bs, 3);
			}
			RandombuildingfireProcedure.execute(world, x, y, z);
		}
	}
}
