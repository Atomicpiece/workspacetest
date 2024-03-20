
package net.mcreator.workspacetest.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.workspacetest.entity.FurnacePoweredGolemEntity;
import net.mcreator.workspacetest.client.model.Modelfurnacegolem;

public class FurnacePoweredGolemRenderer extends MobRenderer<FurnacePoweredGolemEntity, Modelfurnacegolem<FurnacePoweredGolemEntity>> {
	public FurnacePoweredGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelfurnacegolem(context.bakeLayer(Modelfurnacegolem.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FurnacePoweredGolemEntity entity) {
		return new ResourceLocation("workspace_test:textures/entities/furnacegolemcomplete.png");
	}
}
