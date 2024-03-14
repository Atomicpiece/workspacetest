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
public class ModelDrone<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("workspace_test", "model_drone"), "main");
	public final ModelPart fan1;
	public final ModelPart fan2;
	public final ModelPart fan3;
	public final ModelPart fan4;
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart systems;

	public ModelDrone(ModelPart root) {
		this.fan1 = root.getChild("fan1");
		this.fan2 = root.getChild("fan2");
		this.fan3 = root.getChild("fan3");
		this.fan4 = root.getChild("fan4");
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.systems = root.getChild("systems");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition fan1 = partdefinition.addOrReplaceChild("fan1",
				CubeListBuilder.create().texOffs(56, 14).addBox(1.0F, -1.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 56).addBox(-1.0F, -1.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 50)
						.addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 26).addBox(-5.0F, -1.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 56)
						.addBox(-5.0F, -1.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 0).addBox(-3.0F, -1.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 58)
						.addBox(1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 58).addBox(3.0F, -1.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 58)
						.addBox(3.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 58).addBox(3.0F, -1.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 30)
						.addBox(-1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 54).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 56)
						.addBox(1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 45).addBox(-3.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 58)
						.addBox(-1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 40).addBox(-5.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 56)
						.addBox(-3.0F, -1.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.0F, 8.0F, 13.0F));
		PartDefinition fan2 = partdefinition.addOrReplaceChild("fan2",
				CubeListBuilder.create().texOffs(8, 46).addBox(-3.0F, -1.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 46).addBox(-1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 30)
						.addBox(1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 44).addBox(3.0F, -1.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 26)
						.addBox(3.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 37).addBox(-1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 22)
						.addBox(3.0F, -1.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 37).addBox(1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 8)
						.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 24).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(-3.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 2).addBox(-5.0F, -1.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 6)
						.addBox(-5.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 42).addBox(-5.0F, -1.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 42)
						.addBox(-3.0F, -1.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 44).addBox(-1.0F, -1.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 44)
						.addBox(1.0F, -1.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(13.0F, 8.0F, 13.0F));
		PartDefinition fan3 = partdefinition.addOrReplaceChild("fan3",
				CubeListBuilder.create().texOffs(50, 24).addBox(1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 46).addBox(-1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 28)
						.addBox(-3.0F, -1.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 8).addBox(-5.0F, -1.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 48)
						.addBox(-5.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 4).addBox(-5.0F, -1.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 50)
						.addBox(-3.0F, -1.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 35).addBox(-1.0F, -1.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 46)
						.addBox(1.0F, -1.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 12).addBox(3.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 16)
						.addBox(3.0F, -1.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 50).addBox(3.0F, -1.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 48)
						.addBox(1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 0).addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 39)
						.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 48).addBox(-3.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 50)
						.addBox(-1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(13.0F, 8.0F, -13.0F));
		PartDefinition fan4 = partdefinition.addOrReplaceChild("fan4",
				CubeListBuilder.create().texOffs(36, 54).addBox(3.0F, -1.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 6).addBox(-1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 54)
						.addBox(1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 52).addBox(-3.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 52)
						.addBox(-1.0F, -1.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 36).addBox(1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 50)
						.addBox(-1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 54).addBox(-3.0F, -1.0F, 3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(30, 52)
						.addBox(-5.0F, -1.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(22, 52).addBox(-5.0F, -1.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 10)
						.addBox(-3.0F, -1.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 43).addBox(-1.0F, -1.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 48)
						.addBox(1.0F, -1.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 54).addBox(3.0F, -1.0F, -3.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 20)
						.addBox(3.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(54, 2).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 32)
						.addBox(-5.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-13.0F, 8.0F, -13.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -14.0F, -6.0F, 12.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(32, 14).addBox(-3.0F, -16.0F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 32)
						.addBox(12.0F, -15.0F, -14.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(16, 30).addBox(-14.0F, -15.0F, -14.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(0, 28)
						.addBox(-14.0F, -15.0F, 12.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(0, 0).addBox(12.0F, -15.0F, 12.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(0, 18)
						.addBox(2.0F, -12.0F, 2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 18).addBox(2.0F, -12.0F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(-4.0F, -12.0F, 2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 22).addBox(-4.0F, -12.0F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 14).addBox(-1.0F, -15.0F, 7.5F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(16, 16).addBox(-1.0F, -15.0F, -19.5F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 28).addBox(-1.0F, -15.0F, 7.5F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(16, 30).addBox(-1.0F, -15.0F, -19.5F, 2.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(32, 30).addBox(-2.0F, -15.0F, -8.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.4F)).texOffs(6, 4)
				.addBox(-2.0F, -14.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 0).addBox(1.0F, -14.0F, -9.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition systems = partdefinition.addOrReplaceChild("systems",
				CubeListBuilder.create().texOffs(36, 4).addBox(-1.0F, -17.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 0).addBox(-6.0F, -16.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 14)
						.addBox(-4.0F, -16.0F, 2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(0, 4).addBox(2.0F, -16.0F, 2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(0, 14)
						.addBox(-4.0F, -16.0F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(0, 8).addBox(2.0F, -16.0F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.1F)).texOffs(0, 36)
						.addBox(4.0F, -16.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 34).addBox(-6.0F, -16.0F, -6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 22)
						.addBox(4.0F, -16.0F, -6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fan1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		fan2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		fan3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		fan4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		systems.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.fan2.yRot = ageInTicks;
		this.fan1.yRot = ageInTicks;
		this.fan4.yRot = ageInTicks;
		this.fan3.yRot = ageInTicks;
	}
}
