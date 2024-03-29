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
public class Modelironsword<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("workspace_test", "modelironsword"), "main");
	public final ModelPart all;

	public Modelironsword(ModelPart root) {
		this.all = root.getChild("all");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition all = partdefinition.addOrReplaceChild("all", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 13.319F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r1 = all.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(17, 20).addBox(-1.0F, -4.0F, -10.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.04F)).texOffs(21, 7).addBox(-1.0F, -10.0F, -4.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.04F)).texOffs(21, 13)
						.addBox(-1.0F, -5.0F, -5.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.01F)).texOffs(21, 18).addBox(-1.0F, -4.0F, -4.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 0)
						.addBox(-1.0F, -6.0F, -8.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.06F)).texOffs(0, 0).addBox(-1.0F, -16.0F, -16.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(5, 3)
						.addBox(-1.0F, -15.0F, -15.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.01F)).texOffs(0, 6).addBox(-1.0F, -14.0F, -14.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.02F)).texOffs(5, 9)
						.addBox(-1.0F, -12.0F, -12.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.04F)).texOffs(10, 0).addBox(-1.0F, -13.0F, -13.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.03F)).texOffs(10, 6)
						.addBox(-1.0F, -10.0F, -10.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.06F)).texOffs(0, 12).addBox(-1.0F, -11.0F, -11.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.05F)).texOffs(10, 12)
						.addBox(-1.0F, -9.0F, -9.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.07F)).texOffs(15, 3).addBox(-1.0F, -8.0F, -8.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.08F)).texOffs(5, 15)
						.addBox(-1.0F, -7.0F, -7.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.07F)).texOffs(15, 9).addBox(-1.0F, -3.0F, -3.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.08F)),
				PartPose.offsetAndRotation(0.5F, 10.681F, 0.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition cube_r2 = all.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(15, 15).addBox(-1.0F, -5.0F, 6.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.05F)).texOffs(0, 19)
				.addBox(-1.0F, -9.0F, 3.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.05F)).texOffs(11, 19).addBox(-1.0F, -6.0F, 6.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.06F)), PartPose.offsetAndRotation(0.5F, 10.681F, 0.0F, 0.7854F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		all.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.all.xRot = ageInTicks;
	}
}
