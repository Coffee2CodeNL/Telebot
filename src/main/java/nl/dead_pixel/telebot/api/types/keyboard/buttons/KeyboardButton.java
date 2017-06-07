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
package nl.dead_pixel.telebot.api.types.keyboard.buttons;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The type Keyboard button.
 */
public class KeyboardButton {
    private String text;
    @JsonProperty("request_contact")
    private Boolean requestContact;
    @JsonProperty("request_location")
    private Boolean requestLocation;

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
    private KeyboardButton setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Is request contact Boolean.
     *
     * @return the Boolean
     */
    public Boolean isRequestContact() {
        return requestContact;
    }

    /**
     * Sets request contact.
     *
     * @param requestContact the request contact
     * @return the request contact
     */
    private KeyboardButton setRequestContact(Boolean requestContact) {
        this.requestContact = requestContact;
        return this;
    }

    /**
     * Is request location Boolean.
     *
     * @return the Boolean
     */
    public Boolean isRequestLocation() {
        return requestLocation;
    }

    /**
     * Sets request location.
     *
     * @param requestLocation the request location
     * @return the request location
     */
    private KeyboardButton setRequestLocation(Boolean requestLocation) {
        this.requestLocation = requestLocation;
        return this;
    }
}
