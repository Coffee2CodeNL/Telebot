package nl.dead_pixel.telebot.api.types.keyboard.helpers;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.types.chat.Message;
import nl.dead_pixel.telebot.api.types.chat.User;


/**
 * The type Callback query.
 */
public class CallbackQuery {
    private String id;
    private User from;
    private Message message;
    @JsonProperty("inline_message_id")
    private String inlineMessageId;
    @JsonProperty("chat_instance")
    private String chatInstance;
    private String data;
    @JsonProperty("game_short_name")
    private String gameShortName;

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     * @return the id
     */
    public CallbackQuery setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Gets from.
     *
     * @return the from
     */
    public User getFrom() {
        return from;
    }

    /**
     * Sets from.
     *
     * @param from the from
     * @return the from
     */
    public CallbackQuery setFrom(User from) {
        this.from = from;
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
    public CallbackQuery setMessage(Message message) {
        this.message = message;
        return this;
    }

    /**
     * Gets inline message id.
     *
     * @return the inline message id
     */
    public String getInlineMessageId() {
        return inlineMessageId;
    }

    /**
     * Sets inline message id.
     *
     * @param inlineMessageId the inline message id
     * @return the inline message id
     */
    public CallbackQuery setInlineMessageId(String inlineMessageId) {
        this.inlineMessageId = inlineMessageId;
        return this;
    }

    /**
     * Gets chat instance.
     *
     * @return the chat instance
     */
    public String getChatInstance() {
        return chatInstance;
    }

    /**
     * Sets chat instance.
     *
     * @param chatInstance the chat instance
     * @return the chat instance
     */
    public CallbackQuery setChatInstance(String chatInstance) {
        this.chatInstance = chatInstance;
        return this;
    }

    /**
     * Gets data.
     *
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * Sets data.
     *
     * @param data the data
     * @return the data
     */
    public CallbackQuery setData(String data) {
        this.data = data;
        return this;
    }

    /**
     * Gets game short name.
     *
     * @return the game short name
     */
    public String getGameShortName() {
        return gameShortName;
    }

    /**
     * Sets game short name.
     *
     * @param gameShortName the game short name
     * @return the game short name
     */
    public CallbackQuery setGameShortName(String gameShortName) {
        this.gameShortName = gameShortName;
        return this;
    }
}
