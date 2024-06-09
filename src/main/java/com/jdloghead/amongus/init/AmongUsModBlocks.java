
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.jdloghead.amongus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import com.jdloghead.amongus.block.TheSkeldPortalBlock;
import com.jdloghead.amongus.block.SusPortalFrameBlock;
import com.jdloghead.amongus.block.SusBlockBlock;
import com.jdloghead.amongus.AmongUsMod;

public class AmongUsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AmongUsMod.MODID);
	public static final RegistryObject<Block> THE_SKELD_PORTAL = REGISTRY.register("the_skeld_portal", () -> new TheSkeldPortalBlock());
	public static final RegistryObject<Block> SUS_PORTAL_FRAME = REGISTRY.register("sus_portal_frame", () -> new SusPortalFrameBlock());
	public static final RegistryObject<Block> SUS_BLOCK = REGISTRY.register("sus_block", () -> new SusBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
