package com.cogworks.nonsense.registry;

import net.minecraft.sounds.SoundEvents;
import net.neoforged.neoforge.common.SoundActions;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModFluidTypes {
    public static final DeferredRegister<FluidType> FLUID_TYPES =
            DeferredRegister.create(NeoForgeRegistries.Keys.FLUID_TYPES, "nonsense");

    public static final DeferredHolder<FluidType, FluidType> CHAMOMILE_TEA_TYPE =
            FLUID_TYPES.register("chamomile_tea_type", () -> new FluidType(
                    FluidType.Properties.create()
                            .descriptionId("fluid.nonsense.chamomile_tea")
                            .density(1000)
                            .viscosity(1000)
                            .lightLevel(0)
                            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                            .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)
            ));

    public static final DeferredHolder<FluidType, FluidType> BLACK_TEA_TYPE =
            FLUID_TYPES.register("black_tea_type", () -> new FluidType(
                    FluidType.Properties.create()
                            .descriptionId("fluid.nonsense.black_tea")
                            .density(1000)
                            .viscosity(1000)
                            .lightLevel(0)
                            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                            .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)
            ));

    public static final DeferredHolder<FluidType, FluidType> OOLONG_TEA_TYPE =
            FLUID_TYPES.register("oolong_tea_type", () -> new FluidType(
                    FluidType.Properties.create()
                            .descriptionId("fluid.nonsense.oolong_tea")
                            .density(1000)
                            .viscosity(1000)
                            .lightLevel(0)
                            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                            .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)
            ));
    public static final DeferredHolder<FluidType, FluidType> GREEN_TEA_TYPE =
            FLUID_TYPES.register("green_tea_type", () -> new FluidType(
                    FluidType.Properties.create()
                            .descriptionId("fluid.nonsense.green_tea")
                            .density(1000)
                            .viscosity(1000)
                            .lightLevel(0)
                            .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                            .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)
            ));
}
