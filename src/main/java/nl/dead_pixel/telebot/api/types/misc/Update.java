package nl.dead_pixel.telebot.api.types.misc;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.types.chat.Message;
import nl.dead_pixel.telebot.api.types.inline.ChosenInlineResult;
import nl.dead_pixel.telebot.api.types.inline.InlineQuery;
import nl.dead_pixel.telebot.api.types.keyboard.helpers.CallbackQuery;
import nl.dead_pixel.telebot.api.types.payment.PreCheckoutQuery;
import nl.dead_pixel.telebot.api.types.payment.ShippingQuery;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class Update {
    @JsonProperty("update_id")
    private int updateId;
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

    public int getUpdateId() {
        return updateId;
    }

    public Message getMessage() {
        return message;
    }

    public Update setMessage(Message message) {
        this.message = message;
        return this;
    }

    public Message getEditedMessage() {
        return editedMessage;
    }

    public Update setEditedMessage(Message editedMessage) {
        this.editedMessage = editedMessage;
        return this;
    }

    public Message getChannelPost() {
        return channelPost;
    }

    public Update setChannelPost(Message channelPost) {
        this.channelPost = channelPost;
        return this;
    }

    public Message getEditedChannelPost() {
        return editedChannelPost;
    }

    public Update setEditedChannelPost(Message editedChannelPost) {
        this.editedChannelPost = editedChannelPost;
        return this;
    }

    public InlineQuery getInlineQuery() {
        return inlineQuery;
    }

    public Update setInlineQuery(InlineQuery inlineQuery) {
        this.inlineQuery = inlineQuery;
        return this;
    }

    public ChosenInlineResult getChosenInlineResult() {
        return chosenInlineResult;
    }

    public Update setChosenInlineResult(ChosenInlineResult chosenInlineResult) {
        this.chosenInlineResult = chosenInlineResult;
        return this;
    }

    public CallbackQuery getCallbackQuery() {
        return callbackQuery;
    }

    public Update setCallbackQuery(CallbackQuery callbackQuery) {
        this.callbackQuery = callbackQuery;
        return this;
    }

    public ShippingQuery getShippingQuery() {
        return shippingQuery;
    }

    public Update setShippingQuery(ShippingQuery shippingQuery) {
        this.shippingQuery = shippingQuery;
        return this;
    }

    public PreCheckoutQuery getPreCheckoutQuery() {
        return preCheckoutQuery;
    }

    public Update setPreCheckoutQuery(PreCheckoutQuery preCheckoutQuery) {
        this.preCheckoutQuery = preCheckoutQuery;
        return this;
    }
}
