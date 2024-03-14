
package net.mcreator.workspacetest.entity;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class RedstoneVoltEntity extends AbstractArrow implements ItemSupplier {
	public static final ItemStack PROJECTILE_ITEM = new ItemStack(Items.REDSTONE);

	public RedstoneVoltEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(WorkspaceTestModEntities.REDSTONE_VOLT.get(), world);
	}

	public RedstoneVoltEntity(EntityType<? extends RedstoneVoltEntity> type, Level world) {
		super(type, world);
	}

	public RedstoneVoltEntity(EntityType<? extends RedstoneVoltEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public RedstoneVoltEntity(EntityType<? extends RedstoneVoltEntity> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected ItemStack getPickupItem() {
		return PROJECTILE_ITEM;
	}

	@Override
	protected void doPostHurtEffects(LivingEntity entity) {
		super.doPostHurtEffects(entity);
		entity.setArrowCount(entity.getArrowCount() - 1);
	}

	@Override
	public void onHitEntity(EntityHitResult entityHitResult) {
		super.onHitEntity(entityHitResult);
		RedstoneVoltProjectileHitsLivingEntityProcedure.execute();
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		RedstoneVoltProjectileHitsBlockProcedure.execute(this.level(), blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult.getBlockPos().getZ());
	}

	@Override
	public void tick() {
		super.tick();
		RedstoneVoltWhileProjectileFlyingTickProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
		if (this.inGround)
			this.discard();
	}

	public static RedstoneVoltEntity shoot(Level world, LivingEntity entity, RandomSource source) {
		return shoot(world, entity, source, 10f, 10, 0);
	}

	public static RedstoneVoltEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		RedstoneVoltEntity entityarrow = new RedstoneVoltEntity(WorkspaceTestModEntities.REDSTONE_VOLT.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(true);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		entityarrow.setSecondsOnFire(100);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_portal_frame.fill")), SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static RedstoneVoltEntity shoot(LivingEntity entity, LivingEntity target) {
		RedstoneVoltEntity entityarrow = new RedstoneVoltEntity(WorkspaceTestModEntities.REDSTONE_VOLT.get(), entity, entity.level());
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 10f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(10);
		entityarrow.setKnockback(0);
		entityarrow.setCritArrow(true);
		entityarrow.setSecondsOnFire(100);
		entity.level().addFreshEntity(entityarrow);
		entity.level().playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.end_portal_frame.fill")), SoundSource.PLAYERS, 1,
				1f / (RandomSource.create().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
