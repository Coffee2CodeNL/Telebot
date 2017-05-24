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
    private boolean resizeKeyboard;
    @JsonProperty("one_time_keyboard")
    private boolean oneTimeKeyboard;
    private boolean selective;

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
     * Is resize keyboard boolean.
     *
     * @return the boolean
     */
    public boolean isResizeKeyboard() {
        return resizeKeyboard;
    }

    /**
     * Sets resize keyboard.
     *
     * @param resizeKeyboard the resize keyboard
     * @return the resize keyboard
     */
    public ReplyKeyboardMarkup setResizeKeyboard(boolean resizeKeyboard) {
        this.resizeKeyboard = resizeKeyboard;
        return this;
    }

    /**
     * Is one time keyboard boolean.
     *
     * @return the boolean
     */
    public boolean isOneTimeKeyboard() {
        return oneTimeKeyboard;
    }

    /**
     * Sets one time keyboard.
     *
     * @param oneTimeKeyboard the one time keyboard
     * @return the one time keyboard
     */
    public ReplyKeyboardMarkup setOneTimeKeyboard(boolean oneTimeKeyboard) {
        this.oneTimeKeyboard = oneTimeKeyboard;
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
    public ReplyKeyboardMarkup setSelective(boolean selective) {
        this.selective = selective;
        return this;
    }
}
