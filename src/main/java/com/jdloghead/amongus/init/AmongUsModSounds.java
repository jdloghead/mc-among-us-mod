
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.jdloghead.amongus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import com.jdloghead.amongus.AmongUsMod;

public class AmongUsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, AmongUsMod.MODID);
	public static final RegistryObject<SoundEvent> SUS_IMPOSTER_DEATH = REGISTRY.register("sus.imposter.death", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("among_us", "sus.imposter.death")));
}
