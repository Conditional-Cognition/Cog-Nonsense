package com.cogworks.nonsense.registry;

import com.cogworks.nonsense.Nonsense;
import com.cogworks.nonsense.blocks.ModTableBlock;
import com.cogworks.nonsense.blocks.TeacupBlock;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(Nonsense.MODID);

    public static final DeferredBlock<TeacupBlock> TEACUP_BLOCK =
            BLOCKS.registerBlock(
                    "teacup",
                    TeacupBlock::new,
                    BlockBehaviour.Properties.of().noOcclusion()
            );

    private static DeferredBlock<ModTableBlock> registerTable(String name, Block plankBlock) {
        return BLOCKS.register(
                name,
                () -> new ModTableBlock(
                        BlockBehaviour.Properties.ofFullCopy(plankBlock)
                )
        );
    }

    public static final DeferredBlock<ModTableBlock> OAK_TABLE =
            registerTable("oak_table", Blocks.OAK_PLANKS);

    public static final DeferredBlock<ModTableBlock> SPRUCE_TABLE =
            registerTable("spruce_table", Blocks.SPRUCE_PLANKS);

    public static final DeferredBlock<ModTableBlock> BIRCH_TABLE =
            registerTable("birch_table", Blocks.BIRCH_PLANKS);

    public static final DeferredBlock<ModTableBlock> JUNGLE_TABLE =
            registerTable("jungle_table", Blocks.JUNGLE_PLANKS);

    public static final DeferredBlock<ModTableBlock> ACACIA_TABLE =
            registerTable("acacia_table", Blocks.ACACIA_PLANKS);

    public static final DeferredBlock<ModTableBlock> DARK_OAK_TABLE =
            registerTable("dark_oak_table", Blocks.DARK_OAK_PLANKS);

    public static final DeferredBlock<ModTableBlock> MANGROVE_TABLE =
            registerTable("mangrove_table", Blocks.MANGROVE_PLANKS);

    public static final DeferredBlock<ModTableBlock> CHERRY_TABLE =
            registerTable("cherry_table", Blocks.CHERRY_PLANKS);

    public static final DeferredBlock<ModTableBlock> BAMBOO_TABLE =
            registerTable("bamboo_table", Blocks.BAMBOO_PLANKS);

    public static final DeferredBlock<ModTableBlock> CRIMSON_TABLE =
            registerTable("crimson_table", Blocks.CRIMSON_PLANKS);

    public static final DeferredBlock<ModTableBlock> WARPED_TABLE =
            registerTable("warped_table", Blocks.WARPED_PLANKS);

    public static final DeferredBlock<ModTableBlock> DIORITE_TABLE =
            registerTable("diorite_table", Blocks.IRON_TRAPDOOR);
    public static final DeferredBlock<ModTableBlock> ANDESITE_TABLE =
            registerTable("andesite_table", Blocks.IRON_TRAPDOOR);
    public static final DeferredBlock<ModTableBlock> GRANITE_TABLE =
            registerTable("granite_table", Blocks.IRON_TRAPDOOR);
    public static final DeferredBlock<ModTableBlock> STONE_TABLE =
            registerTable("stone_table", Blocks.IRON_TRAPDOOR);

    public static final DeferredHolder<Block, LiquidBlock> CHAMOMILE_TEA_BLOCK =
            BLOCKS.register("chamomile_tea_block", () -> new LiquidBlock(
                    com.cogworks.nonsense.registry.ModFluids.CHAMOMILE_TEA_STILL.get(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)
            ));
    public static final DeferredHolder<Block, LiquidBlock> BLACK_TEA_BLOCK =
            BLOCKS.register("black_tea_block", () -> new LiquidBlock(
                    com.cogworks.nonsense.registry.ModFluids.BLACK_TEA_STILL.get(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)
            ));
    public static final DeferredHolder<Block, LiquidBlock> OOLONG_TEA_BLOCK =
            BLOCKS.register("oolong_tea_block", () -> new LiquidBlock(
                    com.cogworks.nonsense.registry.ModFluids.OOLONG_TEA_STILL.get(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)
            ));
    public static final DeferredHolder<Block, LiquidBlock> GREEN_TEA_BLOCK =
            BLOCKS.register("green_tea_block", () -> new LiquidBlock(
                    com.cogworks.nonsense.registry.ModFluids.GREEN_TEA_STILL.get(),
                    BlockBehaviour.Properties.ofFullCopy(Blocks.WATER)
            ));

    public static void register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
    }
}