package com.github.kingtorsten.NewEndlessAbyss.client.model;

import com.github.kingtorsten.NewEndlessAbyss.entities.HerbivorousSquidEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.QuadrupedModel;
import net.minecraft.client.renderer.entity.model.SquidModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class HerbivorousSquidModel<T extends HerbivorousSquidEntity> extends EntityModel<T> {

        private final ModelRenderer head;
        private final ModelRenderer leg1;
        private final ModelRenderer leg2;
        private final ModelRenderer leg3;
        private final ModelRenderer leg4;
        private final ModelRenderer leg5;
        private final ModelRenderer leg6;
        private final ModelRenderer leg7;
        private final ModelRenderer leg8;
        private final ModelRenderer jaw1;
        private final ModelRenderer jaw2;

        public HerbivorousSquidModel() {
            textureWidth = 32;
            textureHeight = 32;

            head = new ModelRenderer(this);
            head.setRotationPoint(0.0F, 17.0F, 0.0F);
            head.setTextureOffset(0, 0).addBox(-2.0F, -8.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

            leg1 = new ModelRenderer(this);
            leg1.setRotationPoint(-2.0F, 16.0F, 1.0F);
            leg1.setTextureOffset(0, 20).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);

            leg2 = new ModelRenderer(this);
            leg2.setRotationPoint(-1.0F, 16.0F, 2.0F);
            leg2.setTextureOffset(16, 8).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);

            leg3 = new ModelRenderer(this);
            leg3.setRotationPoint(1.0F, 16.0F, 2.0F);
            leg3.setTextureOffset(16, 0).addBox(0.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);

            leg4 = new ModelRenderer(this);
            leg4.setRotationPoint(-2.0F, 16.0F, -1.0F);
            leg4.setTextureOffset(16, 16).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);

            leg5 = new ModelRenderer(this);
            leg5.setRotationPoint(-1.0F, 16.0F, -2.0F);
            leg5.setTextureOffset(12, 12).addBox(-1.0F, 0.0F, -1.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);

            leg6 = new ModelRenderer(this);
            leg6.setRotationPoint(1.0F, 16.0F, -2.0F);
            leg6.setTextureOffset(8, 12).addBox(0.0F, 0.0F, -1.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);

            leg7 = new ModelRenderer(this);
            leg7.setRotationPoint(2.0F, 16.0F, -1.0F);
            leg7.setTextureOffset(4, 12).addBox(0.0F, 0.0F, -1.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);

            leg8 = new ModelRenderer(this);
            leg8.setRotationPoint(2.0F, 16.0F, 1.0F);
            leg8.setTextureOffset(0, 12).addBox(0.0F, 0.0F, 0.0F, 1.0F, 7.0F, 1.0F, 0.0F, false);

            jaw1 = new ModelRenderer(this);
            jaw1.setRotationPoint(0.0F, 17.0F, 1.0F);
            jaw1.setTextureOffset(10, 20).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);

            jaw2 = new ModelRenderer(this);
            jaw2.setRotationPoint(0.0F, 17.0F, -1.0F);
            jaw2.setTextureOffset(4, 20).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }


    @Override
        public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
            head.render(matrixStack, buffer, packedLight, packedOverlay);
            leg1.render(matrixStack, buffer, packedLight, packedOverlay);
            leg2.render(matrixStack, buffer, packedLight, packedOverlay);
            leg3.render(matrixStack, buffer, packedLight, packedOverlay);
            leg4.render(matrixStack, buffer, packedLight, packedOverlay);
            leg5.render(matrixStack, buffer, packedLight, packedOverlay);
            leg6.render(matrixStack, buffer, packedLight, packedOverlay);
            leg7.render(matrixStack, buffer, packedLight, packedOverlay);
            leg8.render(matrixStack, buffer, packedLight, packedOverlay);
            jaw1.render(matrixStack, buffer, packedLight, packedOverlay);
            jaw2.render(matrixStack, buffer, packedLight, packedOverlay);
        }

        public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
            modelRenderer.rotateAngleX = x;
            modelRenderer.rotateAngleY = y;
            modelRenderer.rotateAngleZ = z;
        }
    }
