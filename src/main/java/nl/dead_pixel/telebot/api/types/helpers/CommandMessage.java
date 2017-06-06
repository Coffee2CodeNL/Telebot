package nl.dead_pixel.telebot.api.types.helpers;

import nl.dead_pixel.telebot.api.interfaces.IUpdate;
import nl.dead_pixel.telebot.api.types.chat.Message;

/**
 * @author ReSco
 * @since 20:09 6-6-2017
 */
public class CommandMessage implements IUpdate {
    private Message message;
    public CommandMessage(Message message) {
        this.message = message;
    }

    public Message getMessage() {
        return this.message;
    }
}
