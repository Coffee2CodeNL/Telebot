package nl.dead_pixel.telebot.api.retrofit.response_bodies;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class ChatIdRequest {
    @JsonProperty("chat_id")
    private Object chatId;

    private ChatIdRequest(Long identifier) { this.chatId = identifier; }

    public static ChatIdRequest setUniqueId(Long identifier) {
        return new ChatIdRequest(identifier);
    }

    private ChatIdRequest(String identifier) { this.chatId = identifier; }

    public static ChatIdRequest setChannelUsername(String identifier) {
        return new ChatIdRequest(identifier);
    }
}
