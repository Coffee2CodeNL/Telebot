package nl.dead_pixel.telebot.api.retrofit.request_bodies;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import nl.dead_pixel.telebot.api.interfaces.IReplyMarkup;

import java.util.Optional;


/**
 * The type Message request.
 */
@JsonDeserialize(builder = MessageRequest.Builder.class)
public class MessageRequest {
    @JsonProperty("chat_id")
    private final Object chatId;
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
        private final String text;
        private Optional<String> parseMode;
        private Optional<Boolean> disableWebPagePreview;
        private Optional<Boolean> disableNotification;
        private Optional<Long> replyToMessageId;
        private Optional<IReplyMarkup> replyMarkup;

        /**
         * Instantiates a new Builder.
         *
         * @param chatId the chat id
         * @param text   the text
         */
        public Builder(String chatId, String text) {
            this.chatId = chatId;
            this.text = text;
        }

        /**
         * Instantiates a new Builder.
         *
         * @param chatId the chat id
         * @param text   the text
         */
        public Builder(Long chatId, String text) {
            this.chatId = chatId;
            this.text = text;
        }

        /**
         * Sets parse mode.
         *
         * @param parseMode the parse mode
         * @return the parse mode
         */
        public Builder setParseMode(String parseMode) {
            this.parseMode = Optional.ofNullable(parseMode);
            return this;
        }

        /**
         * Sets disable web page preview.
         *
         * @param disableWebPagePreview the disable web page preview
         * @return the disable web page preview
         */
        public Builder setDisableWebPagePreview(Boolean disableWebPagePreview) {
            this.disableWebPagePreview = Optional.ofNullable(disableWebPagePreview);
            return this;
        }

        /**
         * Sets disable notification.
         *
         * @param disableNotification the disable notification
         * @return the disable notification
         */
        public Builder setDisableNotification(Boolean disableNotification) {
            this.disableNotification = Optional.ofNullable(disableNotification);
            return this;
        }

        /**
         * Sets reply to message id.
         *
         * @param replyToMessageId the reply to message id
         * @return the reply to message id
         */
        public Builder setReplyToMessageId(Long replyToMessageId) {
            this.replyToMessageId = Optional.ofNullable(replyToMessageId);
            return this;
        }

        /**
         * Sets reply markup.
         *
         * @param replyMarkup the reply markup
         * @return the reply markup
         */
        public Builder setReplyMarkup(IReplyMarkup replyMarkup) {
            this.replyMarkup = Optional.ofNullable(replyMarkup);
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
