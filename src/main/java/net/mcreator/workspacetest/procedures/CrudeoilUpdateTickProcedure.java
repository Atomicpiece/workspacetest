package net.mcreator.workspacetest.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CrudeoilUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.FIRE) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.LARGE_SMOKE, x, (y + 0.5), z, 3, 1, 1, 1, 0.1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.LAVA, x, (y + 0.5), z, 2, 1, 1, 1, 0.1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FLAME, x, (y + 0.5), z, 3, 1, 1, 1, 0.1);
		}
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.FIRE && (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == WorkspaceTestModBlocks.CRUDEOIL.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = Blocks.FIRE.defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				BlockEntity _be = world.getBlockEntity(_bp);
				CompoundTag _bnbt = null;
				if (_be != null) {
					_bnbt = _be.saveWithFullMetadata();
					_be.setRemoved();
				}
				world.setBlock(_bp, _bs, 3);
				if (_bnbt != null) {
					_be = world.getBlockEntity(_bp);
					if (_be != null) {
						try {
							_be.load(_bnbt);
						} catch (Exception ignored) {
						}
					}
				}
			}
		}
	}
}
