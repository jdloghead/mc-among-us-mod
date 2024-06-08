
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

import com.jdloghead.amongus.AmongusMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AmongusModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AmongusMod.MODID);
	public static final RegistryObject<CreativeModeTab> AMONG_US_MOD = REGISTRY.register("among_us_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.amongus.among_us_mod")).icon(() -> new ItemStack(AmongusModItems.IMPOSTERS_KNIFE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AmongusModItems.IMPOSTERS_KNIFE.get());
				tabData.accept(AmongusModBlocks.SUS_PORTAL_FRAME.get().asItem());
				tabData.accept(AmongusModItems.IMPOSTER_BOSS_SPAWN_EGG.get());
				tabData.accept(AmongusModBlocks.SUS_BLOCK.get().asItem());
				tabData.accept(AmongusModItems.SUS_PICKAXE.get());
				tabData.accept(AmongusModItems.SUS_GEM.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(AmongusModItems.CREWMATE_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(AmongusModItems.SUS_SHARD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(AmongusModItems.THE_SKELD.get());
			tabData.accept(AmongusModItems.THE_FINAL.get());
		}
	}
}
