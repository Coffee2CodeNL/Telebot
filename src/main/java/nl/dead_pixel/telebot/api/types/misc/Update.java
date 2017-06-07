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
package nl.dead_pixel.telebot.api.types.misc;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.types.chat.Message;
import nl.dead_pixel.telebot.api.types.inline.ChosenInlineResult;
import nl.dead_pixel.telebot.api.types.inline.InlineQuery;
import nl.dead_pixel.telebot.api.types.keyboard.helpers.CallbackQuery;
import nl.dead_pixel.telebot.api.types.payment.PreCheckoutQuery;
import nl.dead_pixel.telebot.api.types.payment.ShippingQuery;


/**
 * The type Update.
 */
public class Update {
    @JsonProperty("update_id")
    private Long updateId;
    @JsonProperty("message")
    private Message message;
    @JsonProperty("edited_message")
    private Message editedMessage;
    @JsonProperty("channel_post")
    private Message channelPost;
    @JsonProperty("edited_channel_post")
    private Message editedChannelPost;
    @JsonProperty("inline_query")
    private InlineQuery inlineQuery;
    @JsonProperty("chosen_inline_result")
    private ChosenInlineResult chosenInlineResult;
    @JsonProperty("callback_query")
    private CallbackQuery callbackQuery;
    @JsonProperty("shipping_query")
    private ShippingQuery shippingQuery;
    @JsonProperty("pre_checkout_query")
    private PreCheckoutQuery preCheckoutQuery;

    /**
     * Gets update id.
     *
     * @return the update id
     */
    public Long getUpdateId() {
        return updateId;
    }

    /**
     * Sets the Update ID.
     *
     * @param updateId The update ID
     * @return the current {@link Update} instance
     */
    private Update setUpdateId(Long updateId) {
        this.updateId = updateId;
        return this;
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public Message getMessage() {
        return message;
    }

    /**
     * Sets message.
     *
     * @param message the message
     * @return the message
     */
    private Update setMessage(Message message) {
        this.message = message;
        return this;
    }

    /**
     * Gets edited message.
     *
     * @return the edited message
     */
    public Message getEditedMessage() {
        return editedMessage;
    }

    /**
     * Sets edited message.
     *
     * @param editedMessage the edited message
     * @return the edited message
     */
    private Update setEditedMessage(Message editedMessage) {
        this.editedMessage = editedMessage;
        return this;
    }

    /**
     * Gets channel post.
     *
     * @return the channel post
     */
    public Message getChannelPost() {
        return channelPost;
    }

    /**
     * Sets channel post.
     *
     * @param channelPost the channel post
     * @return the channel post
     */
    private Update setChannelPost(Message channelPost) {
        this.channelPost = channelPost;
        return this;
    }

    /**
     * Gets edited channel post.
     *
     * @return the edited channel post
     */
    public Message getEditedChannelPost() {
        return editedChannelPost;
    }

    /**
     * Sets edited channel post.
     *
     * @param editedChannelPost the edited channel post
     * @return the edited channel post
     */
    private Update setEditedChannelPost(Message editedChannelPost) {
        this.editedChannelPost = editedChannelPost;
        return this;
    }

    /**
     * Gets inline query.
     *
     * @return the inline query
     */
    public InlineQuery getInlineQuery() {
        return inlineQuery;
    }

    /**
     * Sets inline query.
     *
     * @param inlineQuery the inline query
     * @return the inline query
     */
    private Update setInlineQuery(InlineQuery inlineQuery) {
        this.inlineQuery = inlineQuery;
        return this;
    }

    /**
     * Gets chosen inline result.
     *
     * @return the chosen inline result
     */
    public ChosenInlineResult getChosenInlineResult() {
        return chosenInlineResult;
    }

    /**
     * Sets chosen inline result.
     *
     * @param chosenInlineResult the chosen inline result
     * @return the chosen inline result
     */
    private Update setChosenInlineResult(ChosenInlineResult chosenInlineResult) {
        this.chosenInlineResult = chosenInlineResult;
        return this;
    }

    /**
     * Gets callback query.
     *
     * @return the callback query
     */
    public CallbackQuery getCallbackQuery() {
        return callbackQuery;
    }

    /**
     * Sets callback query.
     *
     * @param callbackQuery the callback query
     * @return the callback query
     */
    private Update setCallbackQuery(CallbackQuery callbackQuery) {
        this.callbackQuery = callbackQuery;
        return this;
    }

    /**
     * Gets shipping query.
     *
     * @return the shipping query
     */
    public ShippingQuery getShippingQuery() {
        return shippingQuery;
    }

    /**
     * Sets shipping query.
     *
     * @param shippingQuery the shipping query
     * @return the shipping query
     */
    private Update setShippingQuery(ShippingQuery shippingQuery) {
        this.shippingQuery = shippingQuery;
        return this;
    }

    /**
     * Gets pre checkout query.
     *
     * @return the pre checkout query
     */
    public PreCheckoutQuery getPreCheckoutQuery() {
        return preCheckoutQuery;
    }

    /**
     * Sets pre checkout query.
     *
     * @param preCheckoutQuery the pre checkout query
     * @return the pre checkout query
     */
    private Update setPreCheckoutQuery(PreCheckoutQuery preCheckoutQuery) {
        this.preCheckoutQuery = preCheckoutQuery;
        return this;
    }
}
