package com.github.kingtorsten.NewEndlessAbyss.client.render;

import com.github.kingtorsten.NewEndlessAbyss.EndlessAbyss;
import com.github.kingtorsten.NewEndlessAbyss.client.model.HerbivorousSquidModel;
import com.github.kingtorsten.NewEndlessAbyss.entities.HerbivorousSquidEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class HerbivorousSquidRender extends MobRenderer<HerbivorousSquidEntity, HerbivorousSquidModel<HerbivorousSquidEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(EndlessAbyss.MOD_ID, "textures/entity/herbivorous_squid.png");

    public HerbivorousSquidRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new HerbivorousSquidModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(HerbivorousSquidEntity entity) {
        return null;
    }
}
