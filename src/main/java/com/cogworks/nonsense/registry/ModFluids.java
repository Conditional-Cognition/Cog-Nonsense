package com.cogworks.nonsense.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(Registries.FLUID, "nonsense");

    private static BaseFlowingFluid.Properties chamomile_tea_properties() {
        return new BaseFlowingFluid.Properties(
                ModFluidTypes.CHAMOMILE_TEA_TYPE,
                CHAMOMILE_TEA_STILL,
                CHAMOMILE_TEA_FLOWING
        )
                .bucket(ModItems.CHAMOMILE_TEA_BUCKET)
                .block(ModBlocks.CHAMOMILE_TEA_BLOCK);
    }

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> CHAMOMILE_TEA_STILL =
            FLUIDS.register("chamomile_tea",
                    () -> new BaseFlowingFluid.Source(chamomile_tea_properties()));

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> CHAMOMILE_TEA_FLOWING =
            FLUIDS.register("chamomile_tea_flowing",
                    () -> new BaseFlowingFluid.Flowing(chamomile_tea_properties()));

    private static BaseFlowingFluid.Properties black_tea_properties() {
        return new BaseFlowingFluid.Properties(
                ModFluidTypes.BLACK_TEA_TYPE,
                BLACK_TEA_STILL,
                BLACK_TEA_FLOWING
        )
                .bucket(ModItems.BLACK_TEA_BUCKET)
                .block(ModBlocks.BLACK_TEA_BLOCK);
    }

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> BLACK_TEA_STILL =
            FLUIDS.register("black_tea",
                    () -> new BaseFlowingFluid.Source(black_tea_properties()));

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> BLACK_TEA_FLOWING =
            FLUIDS.register("black_tea_flowing",
                    () -> new BaseFlowingFluid.Flowing(black_tea_properties()));

    private static BaseFlowingFluid.Properties oolong_tea_properties() {
        return new BaseFlowingFluid.Properties(
                ModFluidTypes.OOLONG_TEA_TYPE,
                OOLONG_TEA_STILL,
                OOLONG_TEA_FLOWING
        )
                .bucket(ModItems.OOLONG_TEA_BUCKET)
                .block(ModBlocks.OOLONG_TEA_BLOCK);
    }

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> OOLONG_TEA_STILL =
            FLUIDS.register("oolong_tea",
                    () -> new BaseFlowingFluid.Source(oolong_tea_properties()));

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> OOLONG_TEA_FLOWING =
            FLUIDS.register("oolong_tea_flowing",
                    () -> new BaseFlowingFluid.Flowing(oolong_tea_properties()));

    private static BaseFlowingFluid.Properties green_tea_properties() {
        return new BaseFlowingFluid.Properties(
                ModFluidTypes.GREEN_TEA_TYPE,
                GREEN_TEA_STILL,
                GREEN_TEA_FLOWING
        )
                .bucket(ModItems.GREEN_TEA_BUCKET)
                .block(ModBlocks.GREEN_TEA_BLOCK);
    }

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Source> GREEN_TEA_STILL =
            FLUIDS.register("green_tea",
                    () -> new BaseFlowingFluid.Source(green_tea_properties()));

    public static final DeferredHolder<Fluid, BaseFlowingFluid.Flowing> GREEN_TEA_FLOWING =
            FLUIDS.register("green_tea_flowing",
                    () -> new BaseFlowingFluid.Flowing(green_tea_properties()));
}
