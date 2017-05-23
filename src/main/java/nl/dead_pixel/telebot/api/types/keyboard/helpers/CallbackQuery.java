package nl.dead_pixel.telebot.api.types.keyboard.helpers;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.types.chat.Message;
import nl.dead_pixel.telebot.api.types.chat.User;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class CallbackQuery {
    private String id;
    private User from;
    private Message message;
    @JsonProperty("inline_message_id")
    private String inlineMessageId;
    @JsonProperty("chat_instance")
    private String chatInstance;
    private String data;
    @JsonProperty("game_short_name")
    private String gameShortName;

    public String getId() {
        return id;
    }

    public CallbackQuery setId(String id) {
        this.id = id;
        return this;
    }

    public User getFrom() {
        return from;
    }

    public CallbackQuery setFrom(User from) {
        this.from = from;
        return this;
    }

    public Message getMessage() {
        return message;
    }

    public CallbackQuery setMessage(Message message) {
        this.message = message;
        return this;
    }

    public String getInlineMessageId() {
        return inlineMessageId;
    }

    public CallbackQuery setInlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
        return this;
    }

    public String getChatInstance() {
        return chatInstance;
    }

    public CallbackQuery setChatInstance(String chatInstance) {
        this.chatInstance = chatInstance;
        return this;
    }

    public String getData() {
        return data;
    }

    public CallbackQuery setData(String data) {
        this.data = data;
        return this;
    }

    public String getGameShortName() {
        return gameShortName;
    }

    public CallbackQuery setGameShortName(String gameShortName) {
        this.gameShortName = gameShortName;
        return this;
    }
}
