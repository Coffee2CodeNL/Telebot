package nl.dead_pixel.telebot.api.types.keyboard.helpers;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.interfaces.IReplyMarkup;


/**
 * The type Reply keyboard remove.
 */
public class ReplyKeyboardRemove implements IReplyMarkup {
    @JsonProperty("remove_keyboard")
    private Boolean removeKeyboard = true;
    private Boolean selective;

    /**
     * Is remove keyboard Boolean.
     *
     * @return the Boolean
     */
    public Boolean isRemoveKeyboard() {
        return removeKeyboard;
    }

    /**
     * Sets remove keyboard.
     *
     * @param removeKeyboard the remove keyboard
     * @return the remove keyboard
     */
    private ReplyKeyboardRemove setRemoveKeyboard(Boolean removeKeyboard) {
        this.removeKeyboard = removeKeyboard;
        return this;
    }

    /**
     * Is selective Boolean.
     *
     * @return the Boolean
     */
    public Boolean isSelective() {
        return selective;
    }

    /**
     * Sets selective.
     *
     * @param selective the selective
     * @return the selective
     */
    private ReplyKeyboardRemove setSelective(Boolean selective) {
        this.selective = selective;
        return this;
    }
}
