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
package nl.dead_pixel.telebot.api.types.keyboard.markups;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.interfaces.IReplyMarkup;
import nl.dead_pixel.telebot.api.types.keyboard.buttons.KeyboardButton;

import java.util.List;


/**
 * The type Reply keyboard markup.
 */
public class ReplyKeyboardMarkup implements IReplyMarkup {
    private List<List<KeyboardButton>> keyboard;
    @JsonProperty("resize_keyboard")
    private Boolean resizeKeyboard;
    @JsonProperty("one_time_keyboard")
    private Boolean oneTimeKeyboard;
    private Boolean selective;

    /**
     * Gets keyboard.
     *
     * @return the keyboard
     */
    public List<List<KeyboardButton>> getKeyboard() {
        return keyboard;
    }

    /**
     * Sets keyboard.
     *
     * @param keyboard the keyboard
     * @return the keyboard
     */
    private ReplyKeyboardMarkup setKeyboard(List<List<KeyboardButton>> keyboard) {
        this.keyboard = keyboard;
        return this;
    }

    /**
     * Is resize keyboard Boolean.
     *
     * @return the Boolean
     */
    public Boolean isResizeKeyboard() {
        return resizeKeyboard;
    }

    /**
     * Sets resize keyboard.
     *
     * @param resizeKeyboard the resize keyboard
     * @return the resize keyboard
     */
    private ReplyKeyboardMarkup setResizeKeyboard(Boolean resizeKeyboard) {
        this.resizeKeyboard = resizeKeyboard;
        return this;
    }

    /**
     * Is one time keyboard Boolean.
     *
     * @return the Boolean
     */
    public Boolean isOneTimeKeyboard() {
        return oneTimeKeyboard;
    }

    /**
     * Sets one time keyboard.
     *
     * @param oneTimeKeyboard the one time keyboard
     * @return the one time keyboard
     */
    private ReplyKeyboardMarkup setOneTimeKeyboard(Boolean oneTimeKeyboard) {
        this.oneTimeKeyboard = oneTimeKeyboard;
        return this;
    }

    /**
     * Is selective Boolean.
     *
     * @return the Boolean
     */
    public Boolean isSelective() {
        return selective;
    }

    /**
     * Sets selective.
     *
     * @param selective the selective
     * @return the selective
     */
    private ReplyKeyboardMarkup setSelective(Boolean selective) {
        this.selective = selective;
        return this;
    }
}
