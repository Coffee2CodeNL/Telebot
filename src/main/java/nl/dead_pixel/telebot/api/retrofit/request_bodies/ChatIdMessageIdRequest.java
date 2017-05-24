package nl.dead_pixel.telebot.api.retrofit.request_bodies;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import nl.dead_pixel.telebot.api.types.chat.Chat;
import nl.dead_pixel.telebot.api.types.chat.Message;

/**
 * ChatIdMessageIdRequest
 * <p>
 * A Request Body Object to serialize and send to the API.
 * Implements a Builder pattern.
 *
 * @author ReSco
 * @since 21 :10 23-5-2017
 */
public class ChatIdMessageIdRequest {
    /**
     * The Chat ID.
     */
    @JsonProperty("chat_id")
    private final Object chatId;
    /**
     * The Message ID.
     */
    @JsonProperty("message_id")
    private final Long messageId;

    /**
     * @param builder Builder instance, passed in the {@link Builder#create()} method
     */
    private ChatIdMessageIdRequest(Builder builder)
    {
        this.chatId = builder.chatId;
        this.messageId = builder.messageId;
    }

    /**
     * The type Builder.
     */
    @JsonPOJOBuilder(buildMethodName = "create", withPrefix = "set")
    public static class Builder {
        private Object chatId;
        private Long messageId;

        /**
         * Set the chat ID to the username of a Supergroup or Channel.
         *
         * @param chatId The username of a Supergroup or Channel
         * @return {@link ChatIdMessageIdRequest.Builder }
         */
        public Builder setChatId(String chatId) {
            this.chatId = chatId;
            return this;
        }

        /**
         * Set the chat ID to the numeric ID of a {@link Chat}.
         *
         * @param chatId The numeric ID of a {@link Chat}
         * @return {@link ChatIdMessageIdRequest.Builder }
         */
        public Builder setChatId(Long chatId) {
            this.chatId = chatId;
            return this;
        }

        /**
         * Set the Message ID of the message
         *
         * @param messageId The numeric ID of a {@link Message }
         * @return {@link ChatIdMessageIdRequest.Builder }
         */
        public Builder setMessageId(Long messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * This creates the final serializable object to send to the API.
         *
         * @return new instance of {@link ChatIdMessageIdRequest } containing all the necessary data.
         */
        public ChatIdMessageIdRequest create() {
            return new ChatIdMessageIdRequest(this);
        }
    }
}
