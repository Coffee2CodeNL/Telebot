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
package nl.dead_pixel.telebot.api.types.helpers;

import nl.dead_pixel.telebot.api.interfaces.IUpdate;
import nl.dead_pixel.telebot.api.types.chat.Message;

/**
 * The type Edited channel post.
 *
 * @author ReSco
 * @since 19 :28 6-6-2017
 */
public class EditedChannelPost implements IUpdate {
    private Message message;

    /**
     * Instantiates a new Edited channel post.
     *
     * @param message the message
     */
    public EditedChannelPost(Message message) {
        this.message = message;
    }

    /**
     * Gets message.
     *
     * @return the message
     */
    public Message getMessage() {
        return message;
    }
}
