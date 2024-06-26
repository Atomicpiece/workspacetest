package net.mcreator.workspacetest.block.entity;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.workspacetest.init.WorkspaceTestModBlockEntities;

public class BaobabBlockEntity extends BlockEntity {
	public BaobabBlockEntity(BlockPos pos, BlockState state) {
		super(WorkspaceTestModBlockEntities.BAOBAB.get(), pos, state);
	}

	@Override
	public ClientboundBlockEntityDataPacket getUpdatePacket() {
		return ClientboundBlockEntityDataPacket.create(this);
	}

	@Override
	public CompoundTag getUpdateTag() {
		return this.saveWithFullMetadata();
	}
}
