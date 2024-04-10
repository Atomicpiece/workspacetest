
package net.mcreator.workspacetest.entity;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class TankEntityProjectile extends AbstractArrow implements ItemSupplier {

	public TankEntityProjectile(PlayMessages.SpawnEntity packet, Level world) {
		super(WorkspaceTestModEntities.TANK_PROJECTILE.get(), world);
	}

	public TankEntityProjectile(EntityType<? extends TankEntityProjectile> type, Level world) {
		super(type, world);
	}

	public TankEntityProjectile(EntityType<? extends TankEntityProjectile> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public TankEntityProjectile(EntityType<? extends TankEntityProjectile> type, LivingEntity entity, Level world) {
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
		return new ItemStack(Blocks.STONE_BUTTON);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(Blocks.STONE_BUTTON);
	}
}
