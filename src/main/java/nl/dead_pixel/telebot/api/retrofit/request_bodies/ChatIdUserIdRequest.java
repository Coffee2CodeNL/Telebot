package nl.dead_pixel.telebot.api.retrofit.request_bodies;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;


/**
 * The type Chat id user id request.
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

    /**
     * The type Builder.
     */
    @JsonPOJOBuilder(buildMethodName = "create", withPrefix = "set")
    public static class Builder {
        private Object chatId;
        private long userId;

        /**
         * Sets chat id.
         *
         * @param chatId the chat id
         * @return the chat id
         */
        public Builder setChatId(String chatId) {
            this.chatId = chatId;
            return this;
        }

        /**
         * Sets chat id.
         *
         * @param chatId the chat id
         * @return the chat id
         */
        public Builder setChatId(Long chatId) {
            this.chatId = chatId;
            return this;
        }

        /**
         * Sets user id.
         *
         * @param userId the user id
         * @return the user id
         */
        public Builder setUserId(Long userId) {
            this.userId = userId;
            return this;
        }

        /**
         * Create chat id user id request.
         *
         * @return the chat id user id request
         */
        public ChatIdUserIdRequest create() {
            return new ChatIdUserIdRequest(this);
        }
    }
}
