
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.amongusmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.amongusmod.AmongUsModMod;

public class AmongUsModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, AmongUsModMod.MODID);
	public static final RegistryObject<SoundEvent> SUS_IMPOSTER_DEATH = REGISTRY.register("sus.imposter.death", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("among_us_mod", "sus.imposter.death")));
}
