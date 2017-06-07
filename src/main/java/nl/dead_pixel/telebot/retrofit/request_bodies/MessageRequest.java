/**
 *    Copyright (C) 2017 Remon Schopmeijer (79147FFF4E3C86DE) <support-telebot@dead-pixel.nl>
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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import nl.dead_pixel.telebot.interfaces.IReplyMarkup;
import nl.dead_pixel.telebot.api.types.chat.Message;

import java.util.Optional;


/**
 * The type Message request.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = MessageRequest.Builder.class)
public class MessageRequest {
    @JsonProperty("chat_id")
    private final Object chatId;
    @JsonProperty("text")
    private final String text;
    @JsonProperty("parse_mode")
    private final Optional<String> parseMode;
    @JsonProperty("disable_web_page_preview")
    private final Optional<Boolean> disableWebPagePreview;
    @JsonProperty("disable_notification")
    private final Optional<Boolean> disableNotification;
    @JsonProperty("reply_to_message_id")
    private final Optional<Long> replyToMessageId;
    @JsonProperty("reply_markup")
    private final Optional<IReplyMarkup> replyMarkup;


    /**
     * @param builder Builder instance, passed in the {@link Builder#create()} method
     */
    private MessageRequest(Builder builder) {
        this.chatId = builder.chatId;
        this.text = builder.text;
        this.parseMode = builder.parseMode.map(s -> builder.parseMode.get());
        this.disableWebPagePreview = builder.disableWebPagePreview.map(s -> builder.disableWebPagePreview.get());
        this.disableNotification = builder.disableNotification.map(s -> builder.disableNotification.get());
        this.replyToMessageId = builder.replyToMessageId.map(s -> builder.replyToMessageId.get());
        this.replyMarkup = builder.replyMarkup.map(s -> builder.replyMarkup.get());
    }

    /**
     * The type Builder.
     */
    @JsonPOJOBuilder(buildMethodName = "create", withPrefix = "set")
    public static class Builder {
        private final Object chatId;
        private String text;
        private Optional<String> parseMode = Optional.empty();
        private Optional<Boolean> disableWebPagePreview = Optional.empty();
        private Optional<Boolean> disableNotification = Optional.empty();
        private Optional<Long> replyToMessageId = Optional.empty();
        private Optional<IReplyMarkup> replyMarkup = Optional.empty();

        /**
         * Instantiates a new Builder.
         *
         * @param chatId the chat id
         */
        public Builder(String chatId) {
            this.chatId = chatId;
        }

        /**
         * Instantiates a new Builder.
         *
         * @param chatId the chat id
         */
        public Builder(Long chatId) {
            this.chatId = chatId;
        }

        /**
         * Sets parse mode.
         *
         * @param parseMode the parse mode
         * @return the parse mode
         */
        public Builder setParseMode(String parseMode) {
            this.parseMode = Optional.of(parseMode);
            return this;
        }

        /**
         * Sets disable web page preview.
         *
         * @param disableWebPagePreview the disable web page preview
         * @return the disable web page preview
         */
        public Builder setDisableWebPagePreview(Boolean disableWebPagePreview) {
            this.disableWebPagePreview = Optional.of(disableWebPagePreview);
            return this;
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
         * Sets reply to message id.
         *
         * @param replyToMessageId the reply to message id
         * @return the reply to message id
         */
        public Builder setReplyToMessageId(Long replyToMessageId) {
            this.replyToMessageId = Optional.of(replyToMessageId);
            return this;
        }

        /**
         * Sets reply markup.
         *
         * @param replyMarkup the reply markup
         * @return the reply markup
         */
        public Builder setReplyMarkup(IReplyMarkup replyMarkup) {
            this.replyMarkup = Optional.of(replyMarkup);
            return this;
        }

        /**
         * Reply to builder.
         *
         * @param message the message
         * @return the builder
         */
        public Builder replyTo(Message message) {
            Long messageId = message.getMessageId();
            this.replyToMessageId = Optional.of(messageId);
            return this;
        }

        /**
         * Text builder.
         *
         * @param text the text
         * @return the builder
         */
        public Builder text(String text) {
            this.text = text;
            return this;
        }

        /**
         * Create message request.
         *
         * @return the message request
         */
        public MessageRequest create() {
            return new MessageRequest(this);
        }
    }
}
