package com.jdloghead.amongus.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

import com.jdloghead.amongus.AmongusMod;

@Mod.EventBusSubscriber
public class ModStartProcedure {
	@SubscribeEvent
	public static void onWorldLoad(net.minecraftforge.event.level.LevelEvent.Load event) {
		execute(event);
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		AmongusMod.LOGGER.info("things are gonna get a BIT sussy here if you know what i mean ;)");
	}
}
