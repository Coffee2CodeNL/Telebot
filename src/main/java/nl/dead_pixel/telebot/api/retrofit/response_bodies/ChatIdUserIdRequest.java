package nl.dead_pixel.telebot.api.retrofit.response_bodies;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
@JsonDeserialize(builder = ChatIdUserIdRequest.Builder.class)
public class ChatIdUserIdRequest {
    @JsonProperty("chat_id")
    private final Object chatId;
    @JsonProperty("user_id")
    private final long userId;

    private ChatIdUserIdRequest(Builder builder)
    {
        this.chatId = builder.chatId;
        this.userId = builder.userId;
    }
    @JsonPOJOBuilder(buildMethodName = "create", withPrefix = "set")
    public static class Builder {
        private Object chatId;
        private long userId;

        public Builder setChatId(String chatId) {
            this.chatId = chatId;
            return this;
        }

        public Builder setChatId(Long chatId) {
            this.chatId = chatId;
            return this;
        }

        public Builder setUserId(Long userId) {
            this.userId = userId;
            return this;
        }

        public ChatIdUserIdRequest create() {
            return new ChatIdUserIdRequest(this);
        }
    }
}
