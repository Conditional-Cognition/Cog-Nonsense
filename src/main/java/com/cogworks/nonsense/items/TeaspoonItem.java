package com.cogworks.nonsense.items;

import com.cogworks.nonsense.registry.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TeaspoonItem extends TieredItem {

    public TeaspoonItem(Tier tier, Item.Properties properties) {
        super(tier, properties);
    }

    @Override
    public int getBurnTime(@NotNull ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        if (this.getTier() == net.minecraft.world.item.Tiers.WOOD) {
            return 100;
        }
        return super.getBurnTime(itemStack, recipeType);
    }

    @Override
    public @NotNull InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        InteractionHand offhand = context.getHand();
        Player player = context.getPlayer();
        assert player != null;

        if (level.getBlockState(pos).is(ModBlocks.TEACUP_BLOCK.get())) {
            if (!level.isClientSide) {
                float pitch = this.getTier() == Tiers.WOOD ? 0.8F : 1.5F;
                level.playSound(player, pos, SoundEvents.EXPERIENCE_ORB_PICKUP, SoundSource.PLAYERS, 0.5F, pitch);
                if (offhand == InteractionHand.MAIN_HAND) {
                    if (TeabagItem.isTeabagCheck(player.getOffhandItem().getItem())) {player.getOffhandItem().shrink(1);}
                } else if (offhand == InteractionHand.OFF_HAND) {
                    if (TeabagItem.isTeabagCheck(player.getMainHandItem().getItem())) {player.getMainHandItem().shrink(1);}
                }
            }
        } else {
            if (!level.isClientSide) {
                float pitch = this.getTier() == Tiers.WOOD ? 0.8F : 1.5F;
                level.playSound(player, pos, SoundEvents.BAT_AMBIENT, SoundSource.PLAYERS, 0.5F, pitch);
            }
        }
        return InteractionResult.SUCCESS;
    }
}
