
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.jdloghead.amongus.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.jdloghead.amongus.client.renderer.ImposterSkeldRenderer;
import com.jdloghead.amongus.client.renderer.ImposterRenderer;
import com.jdloghead.amongus.client.renderer.ImposterBossRenderer;
import com.jdloghead.amongus.client.renderer.CrewmateRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AmongusModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AmongusModEntities.CREWMATE.get(), CrewmateRenderer::new);
		event.registerEntityRenderer(AmongusModEntities.IMPOSTER_TEST.get(), ImposterRenderer::new);
		event.registerEntityRenderer(AmongusModEntities.IMPOSTER_SKELD.get(), ImposterSkeldRenderer::new);
		event.registerEntityRenderer(AmongusModEntities.IMPOSTER_BOSS.get(), ImposterBossRenderer::new);
	}
}
