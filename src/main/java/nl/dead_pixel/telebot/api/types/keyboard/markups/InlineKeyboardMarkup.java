package nl.dead_pixel.telebot.api.types.keyboard.markups;

import nl.dead_pixel.telebot.api.interfaces.IReplyMarkup;
import nl.dead_pixel.telebot.api.types.keyboard.buttons.InlineKeyboardButton;

import java.util.List;


/**
 * The type Inline keyboard markup.
 */
public class InlineKeyboardMarkup implements IReplyMarkup {
    private List<List<InlineKeyboardButton>> inlineKeyboard;

    /**
     * Gets inline keyboard.
     *
     * @return the inline keyboard
     */
    public List<List<InlineKeyboardButton>> getInlineKeyboard() {
        return inlineKeyboard;
    }

    /**
     * Sets inline keyboard.
     *
     * @param inlineKeyboard the inline keyboard
     * @return the inline keyboard
     */
    public InlineKeyboardMarkup setInlineKeyboard(List<List<InlineKeyboardButton>> inlineKeyboard) {
        this.inlineKeyboard = inlineKeyboard;
        return this;
    }
}
