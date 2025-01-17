
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.jdloghead.among_us.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import com.jdloghead.among_us.client.renderer.ImposterRenderer;
import com.jdloghead.among_us.client.renderer.ImposterCheaterRenderer;
import com.jdloghead.among_us.client.renderer.ImposterBossRenderer;
import com.jdloghead.among_us.client.renderer.CrewmateRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AmongUsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(AmongUsModEntities.CREWMATE.get(), CrewmateRenderer::new);
		event.registerEntityRenderer(AmongUsModEntities.IMPOSTER_BOSS.get(), ImposterBossRenderer::new);
		event.registerEntityRenderer(AmongUsModEntities.IMPOSTER_CHEATER.get(), ImposterCheaterRenderer::new);
		event.registerEntityRenderer(AmongUsModEntities.IMPOSTER.get(), ImposterRenderer::new);
	}
}
