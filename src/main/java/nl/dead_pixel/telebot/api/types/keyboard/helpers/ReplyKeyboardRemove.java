package nl.dead_pixel.telebot.api.types.keyboard.helpers;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.interfaces.IReplyMarkup;


/**
 * The type Reply keyboard remove.
 */
public class ReplyKeyboardRemove implements IReplyMarkup {
    @JsonProperty("remove_keyboard")
    private boolean removeKeyboard = true;
    private boolean selective;

    /**
     * Is remove keyboard boolean.
     *
     * @return the boolean
     */
    public boolean isRemoveKeyboard() {
        return removeKeyboard;
    }

    /**
     * Sets remove keyboard.
     *
     * @param removeKeyboard the remove keyboard
     * @return the remove keyboard
     */
    public ReplyKeyboardRemove setRemoveKeyboard(boolean removeKeyboard) {
        this.removeKeyboard = removeKeyboard;
        return this;
    }

    /**
     * Is selective boolean.
     *
     * @return the boolean
     */
    public boolean isSelective() {
        return selective;
    }

    /**
     * Sets selective.
     *
     * @param selective the selective
     * @return the selective
     */
    public ReplyKeyboardRemove setSelective(boolean selective) {
        this.selective = selective;
        return this;
    }
}
