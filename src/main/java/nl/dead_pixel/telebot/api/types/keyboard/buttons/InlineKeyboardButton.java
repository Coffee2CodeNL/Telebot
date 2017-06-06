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
package nl.dead_pixel.telebot.api.types.keyboard.buttons;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.types.games.CallbackGame;


/**
 * The type Inline keyboard button.
 */
public class InlineKeyboardButton {
    private String text;
    private String url;
    @JsonProperty("callback_data")
    private String callbackData;
    @JsonProperty("switch_inline_query")
    private String switchInlineQuery;
    @JsonProperty("switch_inline_query_current_chat")
    private String switchInlineQueryCurrentChat;
    @JsonProperty("callback_game")
    private CallbackGame callbackGame;
    private Boolean pay;

    /**
     * Gets text.
     *
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * Sets text.
     *
     * @param text the text
     * @return the text
     */
    private InlineKeyboardButton setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Gets url.
     *
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets url.
     *
     * @param url the url
     * @return the url
     */
    private InlineKeyboardButton setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Gets callback data.
     *
     * @return the callback data
     */
    public String getCallbackData() {
        return callbackData;
    }

    /**
     * Sets callback data.
     *
     * @param callbackData the callback data
     * @return the callback data
     */
    private InlineKeyboardButton setCallbackData(String callbackData) {
        this.callbackData = callbackData;
        return this;
    }

    /**
     * Gets switch inline query.
     *
     * @return the switch inline query
     */
    public String getSwitchInlineQuery() {
        return switchInlineQuery;
    }

    /**
     * Sets switch inline query.
     *
     * @param switchInlineQuery the switch inline query
     * @return the switch inline query
     */
    private InlineKeyboardButton setSwitchInlineQuery(String switchInlineQuery) {
        this.switchInlineQuery = switchInlineQuery;
        return this;
    }

    /**
     * Gets switch inline query current chat.
     *
     * @return the switch inline query current chat
     */
    public String getSwitchInlineQueryCurrentChat() {
        return switchInlineQueryCurrentChat;
    }

    /**
     * Sets switch inline query current chat.
     *
     * @param switchInlineQueryCurrentChat the switch inline query current chat
     * @return the switch inline query current chat
     */
    private InlineKeyboardButton setSwitchInlineQueryCurrentChat(String switchInlineQueryCurrentChat) {
        this.switchInlineQueryCurrentChat = switchInlineQueryCurrentChat;
        return this;
    }

    /**
     * Gets callback game.
     *
     * @return the callback game
     */
    public CallbackGame getCallbackGame() {
        return callbackGame;
    }

    /**
     * Sets callback game.
     *
     * @param callbackGame the callback game
     * @return the callback game
     */
    private InlineKeyboardButton setCallbackGame(CallbackGame callbackGame) {
        this.callbackGame = callbackGame;
        return this;
    }

    /**
     * Is pay Boolean.
     *
     * @return the Boolean
     */
    public Boolean isPay() {
        return pay;
    }

    /**
     * Sets pay.
     *
     * @param pay the pay
     * @return the pay
     */
    private InlineKeyboardButton setPay(Boolean pay) {
        this.pay = pay;
        return this;
    }
}
