package nl.dead_pixel.telebot.api.retrofit.request_bodies;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The type Chat id request.
 */
public class ChatIdRequest {
    @JsonProperty("chat_id")
    private Object chatId;

    /**
     * @param identifier Numeric Chat ID
     */
    private ChatIdRequest(Long identifier) {
        this.chatId = identifier;
    }


    /**
     * @param identifier String Chat ID ({@code @username})
     */
    private ChatIdRequest(String identifier) {
        this.chatId = identifier;
    }

    /**
     * Sets unique id.
     *
     * @param identifier Unique identifier for the target chat
     * @return A {@link ChatIdRequest} object to be used with numeric ID's
     */
    public static ChatIdRequest setUniqueId(Long identifier) {
        return new ChatIdRequest(identifier);
    }

    /**
     * Sets channel username.
     *
     * @param identifier Unique identifier for the target chat
     * @return A {@link ChatIdRequest} object to be used with numeric ID's
     */
    public static ChatIdRequest setChannelUsername(String identifier) {
        return new ChatIdRequest(identifier);
    }
}
