package nl.dead_pixel.telebot.api.types.keyboard.markups;

import nl.dead_pixel.telebot.api.types.keyboard.buttons.InlineKeyboardButton;

import java.util.List;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class InlineKeyboardMarkup {
    private List<List<InlineKeyboardButton>> inlineKeyboard;

    public List<List<InlineKeyboardButton>> getInlineKeyboard() {
        return inlineKeyboard;
    }

    public InlineKeyboardMarkup setInlineKeyboard(List<List<InlineKeyboardButton>> inlineKeyboard) {
        this.inlineKeyboard = inlineKeyboard;
        return this;
    }
}
