package com.cogworks.nonsense.registry;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, "nonsense");

    public static final DeferredHolder<SoundEvent, SoundEvent> BISCUITS_MUSIC =
            SOUNDS.register("biscuits_music", () ->
                    SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("nonsense", "biscuits"))); // THIS IS TAKING 24 HOURS AND A MIGRAINE TO FIX

    public static void register(IEventBus eventBus) {
        SOUNDS.register(eventBus);
    }
}
