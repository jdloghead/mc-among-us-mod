
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.jdloghead.among_us.init;

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

import com.jdloghead.among_us.entity.ImposterEntity;
import com.jdloghead.among_us.entity.ImposterCheaterEntity;
import com.jdloghead.among_us.entity.ImposterBossEntity;
import com.jdloghead.among_us.entity.CrewmateEntity;
import com.jdloghead.among_us.AmongUsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AmongUsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, AmongUsMod.MODID);
	public static final RegistryObject<EntityType<CrewmateEntity>> CREWMATE = register("crewmate",
			EntityType.Builder.<CrewmateEntity>of(CrewmateEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CrewmateEntity::new)

					.sized(0.6f, 1.7f));
	public static final RegistryObject<EntityType<ImposterBossEntity>> IMPOSTER_BOSS = register("imposter_boss",
			EntityType.Builder.<ImposterBossEntity>of(ImposterBossEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ImposterBossEntity::new)

					.sized(0.6f, 1.7f));
	public static final RegistryObject<EntityType<ImposterCheaterEntity>> IMPOSTER_CHEATER = register("imposter_cheater",
			EntityType.Builder.<ImposterCheaterEntity>of(ImposterCheaterEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ImposterCheaterEntity::new)

					.sized(0.6f, 1.7f));
	public static final RegistryObject<EntityType<ImposterEntity>> IMPOSTER = register("imposter",
			EntityType.Builder.<ImposterEntity>of(ImposterEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ImposterEntity::new)

					.sized(0.6f, 1.7f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			CrewmateEntity.init();
			ImposterBossEntity.init();
			ImposterCheaterEntity.init();
			ImposterEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(CREWMATE.get(), CrewmateEntity.createAttributes().build());
		event.put(IMPOSTER_BOSS.get(), ImposterBossEntity.createAttributes().build());
		event.put(IMPOSTER_CHEATER.get(), ImposterCheaterEntity.createAttributes().build());
		event.put(IMPOSTER.get(), ImposterEntity.createAttributes().build());
	}
}
