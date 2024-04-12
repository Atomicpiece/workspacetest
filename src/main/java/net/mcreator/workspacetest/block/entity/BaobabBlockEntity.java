package net.mcreator.workspacetest.block.entity;

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
