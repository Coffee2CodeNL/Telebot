package nl.dead_pixel.telebot.api.types.keyboard.buttons;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.types.games.CallbackGame;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class InlineKeyboardButton {
    private String text;
    private String url;
    @JsonProperty("callback_data")
    private String callbackData;
    @JsonProperty("switch_inline_query")
    private String switchInlineQuery;
    @JsonProperty("switch_inline_query_current_chat")
    private String switchInlineQueryCurrentChat;
    @JsonProperty("callback_game")
    private CallbackGame callbackGame;
    private boolean pay;

    public String getText() {
        return text;
    }

    public InlineKeyboardButton setText(String text) {
        this.text = text;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public InlineKeyboardButton setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getCallbackData() {
        return callbackData;
    }

    public InlineKeyboardButton setCallbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    public String getSwitchInlineQuery() {
        return switchInlineQuery;
    }

    public InlineKeyboardButton setSwitchInlineQuery(String switchInlineQuery) {
        this.switchInlineQuery = switchInlineQuery;
        return this;
    }

    public String getSwitchInlineQueryCurrentChat() {
        return switchInlineQueryCurrentChat;
    }

    public InlineKeyboardButton setSwitchInlineQueryCurrentChat(String switchInlineQueryCurrentChat) {
        this.switchInlineQueryCurrentChat = switchInlineQueryCurrentChat;
        return this;
    }

    public CallbackGame getCallbackGame() {
        return callbackGame;
    }

    public InlineKeyboardButton setCallbackGame(CallbackGame callbackGame) {
        this.callbackGame = callbackGame;
        return this;
    }

    public boolean isPay() {
        return pay;
    }

    public InlineKeyboardButton setPay(boolean pay) {
        this.pay = pay;
        return this;
    }
}
