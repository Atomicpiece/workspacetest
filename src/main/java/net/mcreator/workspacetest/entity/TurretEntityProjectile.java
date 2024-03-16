
package net.mcreator.workspacetest.entity;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class TurretEntityProjectile extends AbstractArrow implements ItemSupplier {

	public TurretEntityProjectile(PlayMessages.SpawnEntity packet, Level world) {
		super(WorkspaceTestModEntities.TURRET_PROJECTILE.get(), world);
	}

	public TurretEntityProjectile(EntityType<? extends TurretEntityProjectile> type, Level world) {
		super(type, world);
	}

	public TurretEntityProjectile(EntityType<? extends TurretEntityProjectile> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public TurretEntityProjectile(EntityType<? extends TurretEntityProjectile> type, LivingEntity entity, Level world) {
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
		return new ItemStack(Blocks.BAMBOO_BUTTON);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(Blocks.BAMBOO_BUTTON);
	}
}
