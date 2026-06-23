package com.cogworks.nonsense.registry;

import com.cogworks.nonsense.Nonsense;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Nonsense.MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NONSENSE_TAB =
            CREATIVE_MODE_TABS.register("example_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.nonsense"))
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .icon(() -> ModItems.IRON_TEASPOON.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.TEACUP.get());

                        output.accept(ModItems.WOODEN_TEASPOON.get());
                        output.accept(ModItems.STONE_TEASPOON.get());
                        output.accept(ModItems.IRON_TEASPOON.get());
                        output.accept(ModItems.GOLDEN_TEASPOON.get());
                        output.accept(ModItems.DIAMOND_TEASPOON.get());
                        output.accept(ModItems.NETHERITE_TEASPOON.get());

                        output.accept(ModItems.WOODEN_TABLESPOON.get());
                        output.accept(ModItems.STONE_TABLESPOON.get());
                        output.accept(ModItems.IRON_TABLESPOON.get());
                        output.accept(ModItems.GOLDEN_TABLESPOON.get());
                        output.accept(ModItems.DIAMOND_TABLESPOON.get());
                        output.accept(ModItems.NETHERITE_TABLESPOON.get());

                        output.accept(ModItems.OAK_TABLE.get());
                        output.accept(ModItems.SPRUCE_TABLE.get());
                        output.accept(ModItems.BIRCH_TABLE.get());
                        output.accept(ModItems.JUNGLE_TABLE.get());
                        output.accept(ModItems.ACACIA_TABLE.get());
                        output.accept(ModItems.DARK_OAK_TABLE.get());
                        output.accept(ModItems.MANGROVE_TABLE.get());
                        output.accept(ModItems.CHERRY_TABLE.get());
                        output.accept(ModItems.BAMBOO_TABLE.get());
                        output.accept(ModItems.CRIMSON_TABLE.get());
                        output.accept(ModItems.WARPED_TABLE.get());

                        output.accept(ModItems.ANDESITE_TABLE.get());
                        output.accept(ModItems.GRANITE_TABLE.get());
                        output.accept(ModItems.DIORITE_TABLE.get());
                        output.accept(ModItems.STONE_TABLE.get());

                        output.accept(ModItems.OOLONG_TEABAG.get());
                        output.accept(ModItems.GREEN_TEABAG.get());
                        output.accept(ModItems.BLACK_TEABAG.get());
                        output.accept(ModItems.CHAMOMILE_TEABAG.get());

                        output.accept(ModItems.OOLONG_TEA_BUCKET.get());
                        output.accept(ModItems.GREEN_TEA_BUCKET.get());
                        output.accept(ModItems.BLACK_TEA_BUCKET.get());
                        output.accept(ModItems.CHAMOMILE_TEA_BUCKET.get());

                        output.accept(ModItems.BISCUITS_MUSIC_DISC.get());
                    }).build());

    public static void register(IEventBus modEventBus) {
        CREATIVE_MODE_TABS.register(modEventBus);
    }
}
