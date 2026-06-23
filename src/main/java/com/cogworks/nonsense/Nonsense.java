package com.cogworks.nonsense;

import com.cogworks.nonsense.registry.*;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

import static com.cogworks.nonsense.registry.ModTabs.NONSENSE_TAB;

@Mod(Nonsense.MODID)
public class Nonsense {
    public static final String MODID = "nonsense";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Nonsense(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModTabs.register(modEventBus);
        ModSounds.register(modEventBus);
        ModFluidTypes.FLUID_TYPES.register(modEventBus);
        ModFluids.FLUIDS.register(modEventBus);
        NeoForge.EVENT_BUS.register(this);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("HELLO FROM COMMON SETUP");
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("HELLO from server starting");
        LOGGER.info("Loaded Creative Tab ID: {}", NONSENSE_TAB.getId());
    }
}
