
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.amongusmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.amongusmod.item.TheSkeldItem;
import net.mcreator.amongusmod.item.TheFinalItem;
import net.mcreator.amongusmod.item.SusShardItem;
import net.mcreator.amongusmod.item.ImpostersKnifeItem;
import net.mcreator.amongusmod.AmongUsModMod;

public class AmongUsModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AmongUsModMod.MODID);
	public static final RegistryObject<Item> CREWMATE_SPAWN_EGG = REGISTRY.register("crewmate_spawn_egg", () -> new ForgeSpawnEggItem(AmongUsModModEntities.CREWMATE, -65485, -16711732, new Item.Properties()));
	public static final RegistryObject<Item> IMPOSTER_SPAWN_EGG = REGISTRY.register("imposter_spawn_egg", () -> new ForgeSpawnEggItem(AmongUsModModEntities.IMPOSTER, -65536, -13369396, new Item.Properties()));
	public static final RegistryObject<Item> THE_SKELD = REGISTRY.register("the_skeld", () -> new TheSkeldItem());
	public static final RegistryObject<Item> IMPOSTERS_KNIFE = REGISTRY.register("imposters_knife", () -> new ImpostersKnifeItem());
	public static final RegistryObject<Item> SUS_SHARD = REGISTRY.register("sus_shard", () -> new SusShardItem());
	public static final RegistryObject<Item> SUS_PORTAL_FRAME = block(AmongUsModModBlocks.SUS_PORTAL_FRAME);
	public static final RegistryObject<Item> THE_FINAL = REGISTRY.register("the_final", () -> new TheFinalItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
