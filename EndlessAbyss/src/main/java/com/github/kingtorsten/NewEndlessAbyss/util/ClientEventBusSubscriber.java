package com.github.kingtorsten.NewEndlessAbyss.util;

import com.github.kingtorsten.NewEndlessAbyss.EndlessAbyss;
import com.github.kingtorsten.NewEndlessAbyss.client.render.HerbivorousSquidRender;
import com.github.kingtorsten.NewEndlessAbyss.init.ModEntityTypes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = EndlessAbyss.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.HERBIVOROUS_SQUID.get(), HerbivorousSquidRender::new);
    }
}
