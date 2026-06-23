package com.cogworks.nonsense.items;

import com.cogworks.nonsense.registry.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class TeabagItem extends Item {
    private final TeaType teaType;

    public TeabagItem(TeaType teaType, Item.Properties properties) {
        super(properties);
        this.teaType = teaType;
    }

    public TeaType getTeaType() {
        return this.teaType;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
        // Adds a clean inline description, e.g., "Flavor: Green" in green text
        tooltipComponents.add(Component.translatable("tooltip.nonsense.tea_flavor")
                .append(": ")
                .append(Component.literal(this.teaType.name()))
                .withStyle(this.teaType.getTextFormatting()));

        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
    public static Boolean isTeabagCheck(Item item) {
        return item == ModItems.CHAMOMILE_TEABAG.get()
                || item == ModItems.BLACK_TEABAG.get()
                || item == ModItems.OOLONG_TEABAG.get()
                || item == ModItems.GREEN_TEABAG.get();
    }
}
