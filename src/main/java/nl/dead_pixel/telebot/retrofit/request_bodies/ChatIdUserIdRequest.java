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
    private final Long userId;

    /**
     * @param builder Builder instance, passed in the {@link Builder#create()} method
     */
    private ChatIdUserIdRequest(Builder builder) {
        this.chatId = builder.chatId;
        this.userId = builder.userId;
    }

    /**
     * The type Builder.
     */
    @JsonPOJOBuilder(buildMethodName = "create", withPrefix = "set")
    public static class Builder {
        private Object chatId;
        private Long userId;

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
