
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.jdloghead.amongus.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import com.jdloghead.amongus.entity.ImposterSkeldEntity;
import com.jdloghead.amongus.entity.ImposterEntity;
import com.jdloghead.amongus.entity.ImposterBossEntity;
import com.jdloghead.amongus.entity.CrewmateEntity;
import com.jdloghead.amongus.AmongUsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AmongUsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AmongUsMod.MODID);
	public static final RegistryObject<EntityType<CrewmateEntity>> CREWMATE = register("crewmate",
			EntityType.Builder.<CrewmateEntity>of(CrewmateEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrewmateEntity::new)

					.sized(0.6f, 1.7f));
	public static final RegistryObject<EntityType<ImposterEntity>> IMPOSTER_CHEATER = register("imposter_cheater",
			EntityType.Builder.<ImposterEntity>of(ImposterEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ImposterEntity::new)

					.sized(0.6f, 1.7f));
	public static final RegistryObject<EntityType<ImposterSkeldEntity>> IMPOSTER_SKELD = register("imposter_skeld",
			EntityType.Builder.<ImposterSkeldEntity>of(ImposterSkeldEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ImposterSkeldEntity::new)

					.sized(0.6f, 1.7f));
	public static final RegistryObject<EntityType<ImposterBossEntity>> IMPOSTER_BOSS = register("imposter_boss",
			EntityType.Builder.<ImposterBossEntity>of(ImposterBossEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ImposterBossEntity::new)

					.sized(0.6f, 1.7f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CrewmateEntity.init();
			ImposterEntity.init();
			ImposterSkeldEntity.init();
			ImposterBossEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CREWMATE.get(), CrewmateEntity.createAttributes().build());
		event.put(IMPOSTER_CHEATER.get(), ImposterEntity.createAttributes().build());
		event.put(IMPOSTER_SKELD.get(), ImposterSkeldEntity.createAttributes().build());
		event.put(IMPOSTER_BOSS.get(), ImposterBossEntity.createAttributes().build());
	}
}
