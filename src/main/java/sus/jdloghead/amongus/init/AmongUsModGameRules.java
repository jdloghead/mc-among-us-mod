
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package sus.jdloghead.amongus.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AmongUsModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> CHEATING_ALLOWED = GameRules.register("cheatingAllowed", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
}
