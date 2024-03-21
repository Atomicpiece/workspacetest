package net.mcreator.workspacetest.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelOrb<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("workspace_test", "model_orb"), "main");
	public final ModelPart All;

	public ModelOrb(ModelPart root) {
		this.All = root.getChild("All");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition All = partdefinition.addOrReplaceChild("All", CubeListBuilder.create().texOffs(36, 34).addBox(-3.0F, -11.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = All.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -13.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(0, 16).addBox(5.0F, -13.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(18, 0)
						.addBox(-1.0F, -13.0F, 5.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 18).addBox(-1.0F, -13.0F, -7.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 0)
						.addBox(-1.0F, -15.0F, -7.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.1F)).texOffs(18, 18).addBox(-1.0F, -3.0F, -7.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.1F)).texOffs(18, 2)
						.addBox(5.0F, -9.0F, -7.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(36, 16).addBox(-7.0F, -9.0F, -7.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r2 = All.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -7.0F, -7.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.1F)).texOffs(0, 16).addBox(5.0F, -7.0F, -7.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.1F)).texOffs(0, 32)
						.addBox(-1.0F, -1.0F, -7.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(18, 34).addBox(-1.0F, -13.0F, -7.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		All.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.All.yRot = ageInTicks / 20.f;
	}
}
