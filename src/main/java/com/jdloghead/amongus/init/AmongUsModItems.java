
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.jdloghead.amongus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import com.jdloghead.amongus.item.TheSkeldItem;
import com.jdloghead.amongus.item.SusShardItem;
import com.jdloghead.amongus.item.SusPickaxeItem;
import com.jdloghead.amongus.item.SusGemItem;
import com.jdloghead.amongus.item.ImpostersKnifeItem;
import com.jdloghead.amongus.AmongUsMod;

public class AmongUsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AmongUsMod.MODID);
	public static final RegistryObject<Item> CREWMATE_SPAWN_EGG = REGISTRY.register("crewmate_spawn_egg", () -> new ForgeSpawnEggItem(AmongUsModEntities.CREWMATE, -65485, -16711732, new Item.Properties()));
	public static final RegistryObject<Item> THE_SKELD = REGISTRY.register("the_skeld", () -> new TheSkeldItem());
	public static final RegistryObject<Item> IMPOSTERS_KNIFE = REGISTRY.register("imposters_knife", () -> new ImpostersKnifeItem());
	public static final RegistryObject<Item> SUS_SHARD = REGISTRY.register("sus_shard", () -> new SusShardItem());
	public static final RegistryObject<Item> SUS_PORTAL_FRAME = block(AmongUsModBlocks.SUS_PORTAL_FRAME);
	public static final RegistryObject<Item> IMPOSTER_BOSS_SPAWN_EGG = REGISTRY.register("imposter_boss_spawn_egg", () -> new ForgeSpawnEggItem(AmongUsModEntities.IMPOSTER_BOSS, -65536, -13369396, new Item.Properties()));
	public static final RegistryObject<Item> SUS_BLOCK = block(AmongUsModBlocks.SUS_BLOCK);
	public static final RegistryObject<Item> SUS_PICKAXE = REGISTRY.register("sus_pickaxe", () -> new SusPickaxeItem());
	public static final RegistryObject<Item> SUS_GEM = REGISTRY.register("sus_gem", () -> new SusGemItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
