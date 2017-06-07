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
package nl.dead_pixel.telebot.api.types.helpers;

import nl.dead_pixel.telebot.interfaces.IUpdate;
import nl.dead_pixel.telebot.api.types.chat.Message;
import nl.dead_pixel.telebot.api.types.chat.MessageEntity;

import java.util.List;

/**
 * The type Command message.
 *
 * @author ReSco
 * @since 20 :09 6-6-2017
 */
public class CommandMessage implements IUpdate {
    private Message message;

    /**
     * Instantiates a new Command message.
     *
     * @param message the message
     */
    public CommandMessage(Message message) {
        this.message = message;
    }

    /**
     * Gets the raw message.
     *
     * @return the message
     */
    public Message getMessage() {
        return this.message;
    }

    /**
     * Extracts the Command from a message.
     *
     * @return The command
     */
    public String getCommand() {
        String messageText = message.getText();
        List<MessageEntity> messageEntities = message.getEntities();
        for (MessageEntity messageEntity : messageEntities) {
            if (messageEntity.getOffset() == 0) {
                String command = messageText.substring(
                        messageEntity.getOffset().intValue() + 1,
                        messageEntity.getOffset().intValue() + messageEntity.getLength().intValue()).toLowerCase();
                return command.replaceAll("@[a-zA-Z]+(Bot|bot)", "");
            }
        }
        return "";
    }

    /**
     * Returns the Chat ID for this command.
     *
     * @return The Chat ID
     */
    public Long getChatId() {
        return message.getChat().getId();
    }
}
