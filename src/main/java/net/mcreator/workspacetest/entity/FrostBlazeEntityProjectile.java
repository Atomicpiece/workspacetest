
package net.mcreator.workspacetest.entity;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class FrostBlazeEntityProjectile extends AbstractArrow implements ItemSupplier {

	public FrostBlazeEntityProjectile(PlayMessages.SpawnEntity packet, Level world) {
		super(WorkspaceTestModEntities.FROST_BLAZE_PROJECTILE.get(), world);
	}

	public FrostBlazeEntityProjectile(EntityType<? extends FrostBlazeEntityProjectile> type, Level world) {
		super(type, world);
	}

	public FrostBlazeEntityProjectile(EntityType<? extends FrostBlazeEntityProjectile> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public FrostBlazeEntityProjectile(EntityType<? extends FrostBlazeEntityProjectile> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity livingEntity) {
		super.doPostHurtEffects(livingEntity);
		livingEntity.setArrowCount(livingEntity.getArrowCount() - 1);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Blocks.BLUE_ICE);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(Blocks.BLUE_ICE);
	}
}
