
package net.mcreator.workspacetest.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.workspacetest.procedures.Shake1Procedure;
import net.mcreator.workspacetest.entity.DPSOrbEntity;
import net.mcreator.workspacetest.client.model.ModelOrb;

public class DPSOrbRenderer extends MobRenderer<DPSOrbEntity, ModelOrb<DPSOrbEntity>> {
	public DPSOrbRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelOrb(context.bakeLayer(ModelOrb.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(DPSOrbEntity entity) {
		return new ResourceLocation("workspace_test:textures/entities/orb.png");
	}

	@Override
	protected boolean isShaking(DPSOrbEntity entity) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		return Shake1Procedure.execute(entity);
	}
}
