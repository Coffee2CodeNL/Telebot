package nl.dead_pixel.telebot.api.plugin;

import nl.dead_pixel.telebot.api.Api;
import nl.dead_pixel.telebot.api.interfaces.IPlugin;
import nl.dead_pixel.telebot.api.interfaces.IUpdate;
import nl.dead_pixel.telebot.api.types.chat.Message;

/**
 * @author ReSco
 * @since 11:49 6-6-2017
 */
public abstract class Plugin<U> implements IPlugin {
    public void subscribe() {
        Api.getUpdateObservable().ofType(pluginUpdateType()).subscribe(this::pluginBody);
    }

    public abstract void pluginBody(U update);

    public abstract Class<U> pluginUpdateType();
}
