package nl.dead_pixel.telebot.api.types.helpers;

import nl.dead_pixel.telebot.api.interfaces.IUpdate;
import nl.dead_pixel.telebot.api.types.chat.Message;

/**
 * @author ReSco
 * @since 19:21 6-6-2017
 */
public class EditedMessage implements IUpdate {
    private Message message;

    public EditedMessage(Message message) {
        this.message = message;
    }

    public Message getMessage() {
        return this.message;
    }
}
