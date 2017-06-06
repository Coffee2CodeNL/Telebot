package nl.dead_pixel.telebot.api.types.helpers;

import nl.dead_pixel.telebot.api.interfaces.IUpdate;
import nl.dead_pixel.telebot.api.types.chat.Message;

/**
 * @author ReSco
 * @since 19:28 6-6-2017
 */
public class EditedChannelPost implements IUpdate {
    private Message message;

    public EditedChannelPost(Message message) {
        this.message = message;
    }

    public Message getMessage() {
        return message;
    }
}
