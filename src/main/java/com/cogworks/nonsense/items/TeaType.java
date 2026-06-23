package com.cogworks.nonsense.items;

import net.minecraft.ChatFormatting;

public enum TeaType {
    OOLONG("oolong", ChatFormatting.GOLD),
    GREEN("green", ChatFormatting.GREEN),
    BLACK("black", ChatFormatting.DARK_RED),
    CHAMOMILE("chamomile", ChatFormatting.YELLOW);

    private final String name;
    private final ChatFormatting textFormatting;

    TeaType(String name, ChatFormatting textFormatting) {
        this.name = name;
        this.textFormatting = textFormatting;
    }

    public String getName() {
        return this.name;
    }

    public ChatFormatting getTextFormatting() {
        return this.textFormatting;
    }
}
