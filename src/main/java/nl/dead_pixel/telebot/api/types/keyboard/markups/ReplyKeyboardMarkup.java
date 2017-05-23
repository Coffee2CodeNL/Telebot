package nl.dead_pixel.telebot.api.types.keyboard.markups;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.types.keyboard.buttons.KeyboardButton;

import java.util.List;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class ReplyKeyboardMarkup {
    private List<List<KeyboardButton>> keyboard;
    @JsonProperty("resize_keyboard")
    private boolean resizeKeyboard;
    @JsonProperty("one_time_keyboard")
    private boolean oneTimeKeyboard;
    private boolean selective;

    public List<List<KeyboardButton>> getKeyboard() {
        return keyboard;
    }

    public ReplyKeyboardMarkup setKeyboard(List<List<KeyboardButton>> keyboard) {
        this.keyboard = keyboard;
        return this;
    }

    public boolean isResizeKeyboard() {
        return resizeKeyboard;
    }

    public ReplyKeyboardMarkup setResizeKeyboard(boolean resizeKeyboard) {
        this.resizeKeyboard = resizeKeyboard;
        return this;
    }

    public boolean isOneTimeKeyboard() {
        return oneTimeKeyboard;
    }

    public ReplyKeyboardMarkup setOneTimeKeyboard(boolean oneTimeKeyboard) {
        this.oneTimeKeyboard = oneTimeKeyboard;
        return this;
    }

    public boolean isSelective() {
        return selective;
    }

    public ReplyKeyboardMarkup setSelective(boolean selective) {
        this.selective = selective;
        return this;
    }
}
