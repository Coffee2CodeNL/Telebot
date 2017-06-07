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
package nl.dead_pixel.telebot.api.types.keyboard.helpers;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.interfaces.IUpdate;
import nl.dead_pixel.telebot.api.types.chat.Message;
import nl.dead_pixel.telebot.api.types.chat.User;


/**
 * The type Callback query.
 */
public class CallbackQuery implements IUpdate {
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
    private CallbackQuery setId(String id) {
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
    private CallbackQuery setFrom(User from) {
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
    private CallbackQuery setMessage(Message message) {
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
    private CallbackQuery setInlineMessageId(String inlineMessageId) {
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
    private CallbackQuery setChatInstance(String chatInstance) {
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
    private CallbackQuery setData(String data) {
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
    private CallbackQuery setGameShortName(String gameShortName) {
        this.gameShortName = gameShortName;
        return this;
    }
}
