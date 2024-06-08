
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.amongusmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.amongusmod.block.TheSkeldPortalBlock;
import net.mcreator.amongusmod.block.TheFinalPortalBlock;
import net.mcreator.amongusmod.block.SusPortalFrameBlock;
import net.mcreator.amongusmod.AmongUsModMod;

public class AmongUsModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AmongUsModMod.MODID);
	public static final RegistryObject<Block> THE_SKELD_PORTAL = REGISTRY.register("the_skeld_portal", () -> new TheSkeldPortalBlock());
	public static final RegistryObject<Block> SUS_PORTAL_FRAME = REGISTRY.register("sus_portal_frame", () -> new SusPortalFrameBlock());
	public static final RegistryObject<Block> THE_FINAL_PORTAL = REGISTRY.register("the_final_portal", () -> new TheFinalPortalBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
