package nl.dead_pixel.telebot.api.types.keyboard.helpers;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class ReplyKeyboardRemove {
    @JsonProperty("remove_keyboard")
    private boolean removeKeyboard = true;
    private boolean selective;

    public boolean isRemoveKeyboard() {
        return removeKeyboard;
    }

    public ReplyKeyboardRemove setRemoveKeyboard(boolean removeKeyboard) {
        this.removeKeyboard = removeKeyboard;
        return this;
    }

    public boolean isSelective() {
        return selective;
    }

    public ReplyKeyboardRemove setSelective(boolean selective) {
        this.selective = selective;
        return this;
    }
}
