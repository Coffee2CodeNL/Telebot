package nl.dead_pixel.telebot.api.types.keyboard.markups;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.interfaces.IReplyMarkup;
import nl.dead_pixel.telebot.api.types.keyboard.buttons.KeyboardButton;

import java.util.List;


/**
 * The type Reply keyboard markup.
 */
public class ReplyKeyboardMarkup implements IReplyMarkup {
    private List<List<KeyboardButton>> keyboard;
    @JsonProperty("resize_keyboard")
    private Boolean resizeKeyboard;
    @JsonProperty("one_time_keyboard")
    private Boolean oneTimeKeyboard;
    private Boolean selective;

    /**
     * Gets keyboard.
     *
     * @return the keyboard
     */
    public List<List<KeyboardButton>> getKeyboard() {
        return keyboard;
    }

    /**
     * Sets keyboard.
     *
     * @param keyboard the keyboard
     * @return the keyboard
     */
    public ReplyKeyboardMarkup setKeyboard(List<List<KeyboardButton>> keyboard) {
        this.keyboard = keyboard;
        return this;
    }

    /**
     * Is resize keyboard Boolean.
     *
     * @return the Boolean
     */
    public Boolean isResizeKeyboard() {
        return resizeKeyboard;
    }

    /**
     * Sets resize keyboard.
     *
     * @param resizeKeyboard the resize keyboard
     * @return the resize keyboard
     */
    public ReplyKeyboardMarkup setResizeKeyboard(Boolean resizeKeyboard) {
        this.resizeKeyboard = resizeKeyboard;
        return this;
    }

    /**
     * Is one time keyboard Boolean.
     *
     * @return the Boolean
     */
    public Boolean isOneTimeKeyboard() {
        return oneTimeKeyboard;
    }

    /**
     * Sets one time keyboard.
     *
     * @param oneTimeKeyboard the one time keyboard
     * @return the one time keyboard
     */
    public ReplyKeyboardMarkup setOneTimeKeyboard(Boolean oneTimeKeyboard) {
        this.oneTimeKeyboard = oneTimeKeyboard;
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
    public ReplyKeyboardMarkup setSelective(Boolean selective) {
        this.selective = selective;
        return this;
    }
}
