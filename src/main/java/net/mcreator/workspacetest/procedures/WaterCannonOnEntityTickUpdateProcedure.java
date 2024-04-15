package net.mcreator.workspacetest.procedures;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.workspacetest.init.WorkspaceTestModItems;
import net.mcreator.workspacetest.init.WorkspaceTestModEntities;
import net.mcreator.workspacetest.entity.WaterEntity;

public class WaterCannonOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		boolean jik = false;
		if (entity.isVehicle()) {
			jik = true;
			if (true == jik) {
				{
					Entity _ent = entity;
					_ent.setYRot((entity.getFirstPassenger()).getYRot());
					_ent.setXRot((float) ((entity.getFirstPassenger()).getXRot() - 10));
					_ent.setYBodyRot(_ent.getYRot());
					_ent.setYHeadRot(_ent.getYRot());
					_ent.yRotO = _ent.getYRot();
					_ent.xRotO = _ent.getXRot();
					if (_ent instanceof LivingEntity _entity) {
						_entity.yBodyRotO = _entity.getYRot();
						_entity.yHeadRotO = _entity.getYRot();
					}
				}
				jik = false;
			}
		}
		if (entity.isVehicle() && ((entity.getFirstPassenger()) instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == WorkspaceTestModItems.FIREHOSE.get()) {
			{
				Entity _shootFrom = entity;
				Level projectileLevel = _shootFrom.level();
				if (!projectileLevel.isClientSide()) {
					Projectile _entityToSpawn = new Object() {
						public Projectile getArrow(Level level, Entity shooter, float damage, int knockback) {
							AbstractArrow entityToSpawn = new WaterEntity(WorkspaceTestModEntities.WATER.get(), level);
							entityToSpawn.setOwner(shooter);
							entityToSpawn.setBaseDamage(damage);
							entityToSpawn.setKnockback(knockback);
							entityToSpawn.setSilent(true);
							return entityToSpawn;
						}
					}.getArrow(projectileLevel, entity, 0, 1);
					_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
					_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 1, 10);
					projectileLevel.addFreshEntity(_entityToSpawn);
				}
			}
		}
	}
}
