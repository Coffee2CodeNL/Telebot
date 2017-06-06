package nl.dead_pixel.telebot.api.plugin;

import nl.dead_pixel.telebot.api.Api;
import nl.dead_pixel.telebot.api.interfaces.IPlugin;
import nl.dead_pixel.telebot.api.types.misc.Update;

/**
 * @author ReSco
 * @since 11:49 6-6-2017
 */
public abstract class Plugin implements IPlugin {
    public void subscribe() {
        Api.getUpdateObservable().subscribe(this::pluginBody);
    }

    public abstract void pluginBody(Update update);
}
