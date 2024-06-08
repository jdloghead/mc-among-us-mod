
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.amongusmod.init;

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

import net.mcreator.amongusmod.AmongUsModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AmongUsModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AmongUsModMod.MODID);
	public static final RegistryObject<CreativeModeTab> AMONG_US_MOD = REGISTRY.register("among_us_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.among_us_mod.among_us_mod")).icon(() -> new ItemStack(AmongUsModModItems.IMPOSTERS_KNIFE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AmongUsModModItems.IMPOSTERS_KNIFE.get());
				tabData.accept(AmongUsModModBlocks.SUS_PORTAL_FRAME.get().asItem());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(AmongUsModModItems.CREWMATE_SPAWN_EGG.get());
			tabData.accept(AmongUsModModItems.IMPOSTER_SPAWN_EGG.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(AmongUsModModItems.SUS_SHARD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(AmongUsModModItems.THE_SKELD.get());
			tabData.accept(AmongUsModModItems.THE_FINAL.get());
		}
	}
}
