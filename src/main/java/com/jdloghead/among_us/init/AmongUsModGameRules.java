
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.jdloghead.among_us.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AmongUsModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> CHEATING_ALLOWED = GameRules.register("cheatingAllowed", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
}
