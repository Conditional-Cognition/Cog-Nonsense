package com.cogworks.nonsense;

import com.cogworks.nonsense.registry.ModFluidTypes;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import org.jetbrains.annotations.NotNull;

// This class will not load on dedicated servers. Accessing client side code from here is safe.
@Mod(value = Nonsense.MODID, dist = Dist.CLIENT)
// You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
@EventBusSubscriber(modid = Nonsense.MODID, value = Dist.CLIENT)
public class NonsenseClient {
    public NonsenseClient(ModContainer container) {
        // Allows NeoForge to create a config screen for this mod's configs.
        // The config screen is accessed by going to the Mods screen > clicking on your mod > clicking on config.
        // Do not forget to add translations for your config options to the en_us.json file.
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        // Some client setup code
        Nonsense.LOGGER.info("HELLO FROM CLIENT SETUP");
        Nonsense.LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
    }

    @SubscribeEvent
    public static void onClientExtensions(RegisterClientExtensionsEvent event) {
        event.registerFluidType(new IClientFluidTypeExtensions() {
            private static final ResourceLocation STILL = ResourceLocation.fromNamespaceAndPath("minecraft", "block/water_still");
            private static final ResourceLocation FLOWING = ResourceLocation.fromNamespaceAndPath("minecraft", "block/water_flow");

            @Override
            public @NotNull ResourceLocation getStillTexture() { return STILL; }
            @Override
            public @NotNull ResourceLocation getFlowingTexture() { return FLOWING; }

            @Override
            public int getTintColor() {
                return 0xDDEEAA00;
            }
        }, ModFluidTypes.CHAMOMILE_TEA_TYPE.get());
        event.registerFluidType(new IClientFluidTypeExtensions() {
            private static final ResourceLocation STILL = ResourceLocation.fromNamespaceAndPath("minecraft", "block/water_still");
            private static final ResourceLocation FLOWING = ResourceLocation.fromNamespaceAndPath("minecraft", "block/water_flow");

            @Override
            public @NotNull ResourceLocation getStillTexture() { return STILL; }
            @Override
            public @NotNull ResourceLocation getFlowingTexture() { return FLOWING; }

            @Override
            public int getTintColor() {
                return 0xDD4B0404;
            }
        }, ModFluidTypes.BLACK_TEA_TYPE.get());
        event.registerFluidType(new IClientFluidTypeExtensions() {
            private static final ResourceLocation STILL = ResourceLocation.fromNamespaceAndPath("minecraft", "block/water_still");
            private static final ResourceLocation FLOWING = ResourceLocation.fromNamespaceAndPath("minecraft", "block/water_flow");

            @Override
            public @NotNull ResourceLocation getStillTexture() { return STILL; }
            @Override
            public @NotNull ResourceLocation getFlowingTexture() { return FLOWING; }

            @Override
            public int getTintColor() {
                return 0xDDEDB260;
            }
        }, ModFluidTypes.OOLONG_TEA_TYPE.get());
        event.registerFluidType(new IClientFluidTypeExtensions() {
            private static final ResourceLocation STILL = ResourceLocation.fromNamespaceAndPath("minecraft", "block/water_still");
            private static final ResourceLocation FLOWING = ResourceLocation.fromNamespaceAndPath("minecraft", "block/water_flow");

            @Override
            public @NotNull ResourceLocation getStillTexture() { return STILL; }
            @Override
            public @NotNull ResourceLocation getFlowingTexture() { return FLOWING; }

            @Override
            public int getTintColor() {
                return 0xDD80A869;
            }
        }, ModFluidTypes.GREEN_TEA_TYPE.get());
    }
}
