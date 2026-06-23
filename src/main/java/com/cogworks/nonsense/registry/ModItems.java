package com.cogworks.nonsense.registry;

import com.cogworks.nonsense.items.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems("nonsense");

    // --- TEASPOONS ---
    public static final DeferredItem<Item> WOODEN_TEASPOON = ITEMS.registerItem("wooden_teaspoon", props -> new TeaspoonItem(Tiers.WOOD, props));
    public static final DeferredItem<Item> STONE_TEASPOON = ITEMS.registerItem("stone_teaspoon", props -> new TeaspoonItem(Tiers.STONE, props));
    public static final DeferredItem<Item> IRON_TEASPOON = ITEMS.registerItem("iron_teaspoon", props -> new TeaspoonItem(Tiers.IRON, props));
    public static final DeferredItem<Item> GOLDEN_TEASPOON = ITEMS.registerItem("golden_teaspoon", props -> new TeaspoonItem(Tiers.GOLD, props));
    public static final DeferredItem<Item> DIAMOND_TEASPOON = ITEMS.registerItem("diamond_teaspoon", props -> new TeaspoonItem(Tiers.DIAMOND, props));
    public static final DeferredItem<Item> NETHERITE_TEASPOON = ITEMS.registerItem("netherite_teaspoon", props -> new TeaspoonItem(Tiers.NETHERITE, props.fireResistant()));

    // --- TABLESPOONS ---
    public static final DeferredItem<Item> WOODEN_TABLESPOON = ITEMS.registerItem("wooden_tablespoon", props -> new TablespoonItem(Tiers.WOOD, props));
    public static final DeferredItem<Item> STONE_TABLESPOON = ITEMS.registerItem("stone_tablespoon", props -> new TablespoonItem(Tiers.STONE, props));
    public static final DeferredItem<Item> IRON_TABLESPOON = ITEMS.registerItem("iron_tablespoon", props -> new TablespoonItem(Tiers.IRON, props));
    public static final DeferredItem<Item> GOLDEN_TABLESPOON = ITEMS.registerItem("golden_tablespoon", props -> new TablespoonItem(Tiers.GOLD, props));
    public static final DeferredItem<Item> DIAMOND_TABLESPOON = ITEMS.registerItem("diamond_tablespoon", props -> new TablespoonItem(Tiers.DIAMOND, props));
    public static final DeferredItem<Item> NETHERITE_TABLESPOON = ITEMS.registerItem("netherite_tablespoon", props -> new TablespoonItem(Tiers.NETHERITE, props.fireResistant()));

    // --- WOOD TABLES ---
    public static final DeferredItem<Item> OAK_TABLE = ITEMS.registerItem("oak_table", props -> new BlockItem(ModBlocks.OAK_TABLE.get(), props));
    public static final DeferredItem<Item> SPRUCE_TABLE = ITEMS.registerItem("spruce_table", props -> new BlockItem(ModBlocks.SPRUCE_TABLE.get(), props));
    public static final DeferredItem<Item> BIRCH_TABLE = ITEMS.registerItem("birch_table", props -> new BlockItem(ModBlocks.BIRCH_TABLE.get(), props));
    public static final DeferredItem<Item> JUNGLE_TABLE = ITEMS.registerItem("jungle_table", props -> new BlockItem(ModBlocks.JUNGLE_TABLE.get(), props));
    public static final DeferredItem<Item> ACACIA_TABLE = ITEMS.registerItem("acacia_table", props -> new BlockItem(ModBlocks.ACACIA_TABLE.get(), props));
    public static final DeferredItem<Item> DARK_OAK_TABLE = ITEMS.registerItem("dark_oak_table", props -> new BlockItem(ModBlocks.DARK_OAK_TABLE.get(), props));
    public static final DeferredItem<Item> MANGROVE_TABLE = ITEMS.registerItem("mangrove_table", props -> new BlockItem(ModBlocks.MANGROVE_TABLE.get(), props));
    public static final DeferredItem<Item> CHERRY_TABLE = ITEMS.registerItem("cherry_table", props -> new BlockItem(ModBlocks.CHERRY_TABLE.get(), props));
    public static final DeferredItem<Item> BAMBOO_TABLE = ITEMS.registerItem("bamboo_table", props -> new BlockItem(ModBlocks.BAMBOO_TABLE.get(), props));
    public static final DeferredItem<Item> CRIMSON_TABLE = ITEMS.registerItem("crimson_table", props -> new BlockItem(ModBlocks.CRIMSON_TABLE.get(), props));
    public static final DeferredItem<Item> WARPED_TABLE = ITEMS.registerItem("warped_table", props -> new BlockItem(ModBlocks.WARPED_TABLE.get(), props));

    // --- METAL TABLES ---
    public static final DeferredItem<Item> ANDESITE_TABLE = ITEMS.registerItem("andesite_table", props -> new BlockItem(ModBlocks.ANDESITE_TABLE.get(), props));
    public static final DeferredItem<Item> GRANITE_TABLE = ITEMS.registerItem("granite_table", props -> new BlockItem(ModBlocks.GRANITE_TABLE.get(), props));
    public static final DeferredItem<Item> DIORITE_TABLE = ITEMS.registerItem("diorite_table", props -> new BlockItem(ModBlocks.DIORITE_TABLE.get(), props));
    public static final DeferredItem<Item> STONE_TABLE = ITEMS.registerItem("stone_table", props -> new BlockItem(ModBlocks.STONE_TABLE.get(), props));

    // --- TEABAGS & TEACUP ---
    public static final DeferredItem<TeacupItem> TEACUP = ITEMS.register("teacup", () -> new TeacupItem(ModBlocks.TEACUP_BLOCK.get(), new Item.Properties()));
    public static final DeferredItem<Item> OOLONG_TEABAG = ITEMS.registerItem("oolong_teabag", props -> new TeabagItem(TeaType.OOLONG, props));
    public static final DeferredItem<Item> GREEN_TEABAG = ITEMS.registerItem("green_teabag", props -> new TeabagItem(TeaType.GREEN, props));
    public static final DeferredItem<Item> BLACK_TEABAG = ITEMS.registerItem("black_teabag", props -> new TeabagItem(TeaType.BLACK, props));
    public static final DeferredItem<Item> CHAMOMILE_TEABAG = ITEMS.registerItem("chamomile_teabag", props -> new TeabagItem(TeaType.CHAMOMILE, props));
    
    // --- TEA BUCKETS ---
    public static final DeferredItem<Item> CHAMOMILE_TEA_BUCKET =
            ITEMS.register("chamomile_tea_bucket",
                    () -> new BucketItem(
                            ModFluids.CHAMOMILE_TEA_STILL.get(),
                            new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)
                    ));
    public static final DeferredItem<Item> BLACK_TEA_BUCKET =
            ITEMS.register("black_tea_bucket",
                    () -> new BucketItem(
                            ModFluids.BLACK_TEA_STILL.get(),
                            new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)
                    ));
    public static final DeferredItem<Item> OOLONG_TEA_BUCKET =
            ITEMS.register("oolong_tea_bucket",
                    () -> new BucketItem(
                            ModFluids.OOLONG_TEA_STILL.get(),
                            new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)
                    ));
    public static final DeferredItem<Item> GREEN_TEA_BUCKET =
            ITEMS.register("green_tea_bucket",
                    () -> new BucketItem(
                            ModFluids.GREEN_TEA_STILL.get(),
                            new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)
                    ));

    // --- MUSIC DISC ---
    public static final ResourceKey<JukeboxSong> BISCUITS_SONG_KEY =
            ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath("nonsense", "biscuits"));
    public static final DeferredItem<Item> BISCUITS_MUSIC_DISC =
            ITEMS.register("biscuits_music_disc", () -> new ModMusicDiscItem(
                    new Item.Properties()
                            .stacksTo(1)
                            .jukeboxPlayable(BISCUITS_SONG_KEY)
            ));
    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}