/**
 *    Copyright (C) 2017 Remon Schopmeijer (7914 7FFF 4E3C 86DE) <support-telebot@dead-pixel.nl>
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package nl.dead_pixel.telebot.retrofit.request_bodies;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import nl.dead_pixel.telebot.api.types.chat.Chat;
import nl.dead_pixel.telebot.api.types.chat.Message;

/**
 * ChatIdMessageIdRequest.
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
    private ChatIdMessageIdRequest(Builder builder) {
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
         * Set the Message ID of the message.
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
