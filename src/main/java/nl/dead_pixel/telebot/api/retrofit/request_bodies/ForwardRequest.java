/**
 *    Copyright 2017 Remon Schopmeijer (49CDB43A4FB4D8AFF5361E8C79147FFF4E3C86DE) <support-telebot@dead-pixel.nl>
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
package nl.dead_pixel.telebot.api.retrofit.request_bodies;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import java.util.Optional;

/**
 * The type Forward request.
 *
 * @author ReSco
 * @since 20 :07 24-5-2017
 */
public class ForwardRequest {
    @JsonProperty("chat_id")
    private final Object chatId;
    @JsonProperty("from_chat_id")
    private final Object fromChatId;
    @JsonProperty("disable_notifications")
    private final Optional<Boolean> disableNotification;
    @JsonProperty("message_id")
    private final Long messageId;

    /**
     * @param builder the builder
     */
    private ForwardRequest(Builder builder) {
        this.chatId = builder.chatId;
        this.fromChatId = builder.fromChatId;
        this.disableNotification = builder.disableNotification.map(s -> builder.disableNotification.get());
        this.messageId = builder.messageId;
    }

    /**
     * The type Builder.
     */
    @JsonPOJOBuilder(buildMethodName = "create", withPrefix = "set")
    public static class Builder {
        private final Object chatId;
        private final Object fromChatId;
        private Optional<Boolean> disableNotification = Optional.empty();
        private final Long messageId;

        /**
         * Instantiates a new Builder.
         *
         * @param chatId     the chat id
         * @param fromChatId the from chat id
         * @param messageId  the message id
         */
        public Builder(Object chatId, Object fromChatId, Long messageId) {
            this.chatId = chatId;
            this.fromChatId = fromChatId;
            this.messageId = messageId;
        }

        /**
         * Sets disable notification.
         *
         * @param disableNotification the disable notification
         * @return the disable notification
         */
        public Builder setDisableNotification(Boolean disableNotification) {
            this.disableNotification = Optional.of(disableNotification);
            return this;
        }

        /**
         * Create forward request.
         *
         * @return the forward request
         */
        public ForwardRequest create() {
            return new ForwardRequest(this);
        }
    }
}
