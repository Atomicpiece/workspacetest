package net.mcreator.workspacetest.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.workspacetest.init.WorkspaceTestModBlocks;
import net.mcreator.workspacetest.WorkspaceTestMod;

import java.util.Map;

public class CrudeoilUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		boolean found = false;
		sx = -1;
		found = false;
		for (int index0 = 0; index0 < 3; index0++) {
			sy = -1;
			for (int index1 = 0; index1 < 3; index1++) {
				sz = -1;
				for (int index2 = 0; index2 < 3; index2++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.FIRE) {
						found = true;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (found == true) {
			if (50 <= Mth.nextInt(RandomSource.create(), 1, 50)) {
				WorkspaceTestMod.queueServerWork(5, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FLAME, (x + 0.5), (y + 0.5), (z + 0.5), 1, 0.2, 0.2, 0.2, 0.01);
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
				});
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.STONE) {
			world.setBlock(BlockPos.containing(x, y - 1, z), WorkspaceTestModBlocks.CRUDE_OIL_BLOCK.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.OAK_PLANKS) {
			world.setBlock(BlockPos.containing(x, y - 1, z), WorkspaceTestModBlocks.OILPLANKS.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.COBBLESTONE) {
			world.setBlock(BlockPos.containing(x, y - 1, z), WorkspaceTestModBlocks.OILCOBBLE.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == (ForgeRegistries.BLOCKS.tags().getTag(BlockTags.create(new ResourceLocation("forge:dirt"))).getRandomElement(RandomSource.create()).orElseGet(() -> Blocks.AIR))) {
			world.setBlock(BlockPos.containing(x, y - 1, z), WorkspaceTestModBlocks.OILDIRT.get().defaultBlockState(), 3);
		}
	}
}
