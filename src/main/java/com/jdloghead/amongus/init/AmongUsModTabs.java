
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.jdloghead.amongus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import com.jdloghead.amongus.AmongUsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AmongUsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AmongUsMod.MODID);
	public static final RegistryObject<CreativeModeTab> AMONG_US_MOD = REGISTRY.register("among_us_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.among_us.among_us_mod")).icon(() -> new ItemStack(AmongUsModItems.IMPOSTERS_KNIFE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AmongUsModItems.CREWMATE_SPAWN_EGG.get());
				tabData.accept(AmongUsModItems.IMPOSTERS_KNIFE.get());
				tabData.accept(AmongUsModItems.SUS_SHARD.get());
				tabData.accept(AmongUsModBlocks.SUS_PORTAL_FRAME.get().asItem());
				tabData.accept(AmongUsModItems.IMPOSTER_BOSS_SPAWN_EGG.get());
				tabData.accept(AmongUsModBlocks.SUS_BLOCK.get().asItem());
				tabData.accept(AmongUsModItems.SUS_PICKAXE.get());
				tabData.accept(AmongUsModItems.SUS_GEM.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(AmongUsModItems.THE_SKELD.get());
		}
	}
}
