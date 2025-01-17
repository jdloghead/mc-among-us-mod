
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.jdloghead.among_us.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import com.jdloghead.among_us.AmongUsMod;

public class AmongUsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, AmongUsMod.MODID);
	public static final RegistryObject<SoundEvent> SUS_IMPOSTER_DEATH = REGISTRY.register("sus.imposter.death", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("among_us", "sus.imposter.death")));
	public static final RegistryObject<SoundEvent> CHEATER = REGISTRY.register("cheater", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("among_us", "cheater")));
	public static final RegistryObject<SoundEvent> CREEPYMUSIC = REGISTRY.register("creepymusic", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("among_us", "creepymusic")));
}
