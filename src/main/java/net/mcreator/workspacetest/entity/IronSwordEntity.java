
package net.mcreator.workspacetest.entity;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class IronSwordEntity extends AbstractArrow implements ItemSupplier {
	public static final ItemStack PROJECTILE_ITEM = new ItemStack(Items.IRON_SWORD);

	public IronSwordEntity(PlayMessages.SpawnEntity packet, Level world) {
		super(WorkspaceTestModEntities.IRON_SWORD.get(), world);
	}

	public IronSwordEntity(EntityType<? extends IronSwordEntity> type, Level world) {
		super(type, world);
	}

	public IronSwordEntity(EntityType<? extends IronSwordEntity> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public IronSwordEntity(EntityType<? extends IronSwordEntity> type, LivingEntity entity, Level world) {
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
		IronSwordProjectileHitsLivingEntityProcedure.execute(this.level(), this.getX(), this.getY(), this.getZ());
	}

	@Override
	public void onHitBlock(BlockHitResult blockHitResult) {
		super.onHitBlock(blockHitResult);
		IronSwordProjectileHitsBlockProcedure.execute();
	}

	@Override
	public void tick() {
		super.tick();
		IronSwordWhileProjectileFlyingTickProcedure.execute();
		if (this.inGround)
			this.discard();
	}

	public static IronSwordEntity shoot(Level world, LivingEntity entity, RandomSource source) {
		return shoot(world, entity, source, 1f, 5, 5);
	}

	public static IronSwordEntity shoot(Level world, LivingEntity entity, RandomSource random, float power, double damage, int knockback) {
		IronSwordEntity entityarrow = new IronSwordEntity(WorkspaceTestModEntities.IRON_SWORD.get(), entity, world);
		entityarrow.shoot(entity.getViewVector(1).x, entity.getViewVector(1).y, entity.getViewVector(1).z, power * 2, 0);
		entityarrow.setSilent(true);
		entityarrow.setCritArrow(true);
		entityarrow.setBaseDamage(damage);
		entityarrow.setKnockback(knockback);
		world.addFreshEntity(entityarrow);
		world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.iron_xylophone")), SoundSource.PLAYERS, 1, 1f / (random.nextFloat() * 0.5f + 1) + (power / 2));
		return entityarrow;
	}

	public static IronSwordEntity shoot(LivingEntity entity, LivingEntity target) {
		IronSwordEntity entityarrow = new IronSwordEntity(WorkspaceTestModEntities.IRON_SWORD.get(), entity, entity.level());
		double dx = target.getX() - entity.getX();
		double dy = target.getY() + target.getEyeHeight() - 1.1;
		double dz = target.getZ() - entity.getZ();
		entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.2F, dz, 1f * 2, 12.0F);
		entityarrow.setSilent(true);
		entityarrow.setBaseDamage(5);
		entityarrow.setKnockback(5);
		entityarrow.setCritArrow(true);
		entity.level().addFreshEntity(entityarrow);
		entity.level().playSound(null, entity.getX(), entity.getY(), entity.getZ(), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.note_block.iron_xylophone")), SoundSource.PLAYERS, 1,
				1f / (RandomSource.create().nextFloat() * 0.5f + 1));
		return entityarrow;
	}
}
