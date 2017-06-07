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
package nl.dead_pixel.telebot.plugin;

import nl.dead_pixel.telebot.Telebot;
import nl.dead_pixel.telebot.interfaces.IPlugin;
import nl.dead_pixel.telebot.retrofit.TelegramBotApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The type Plugin.
 *
 * @param <U> the type parameter
 * @author ReSco
 * @since 11 :49 6-6-2017
 */
public abstract class Plugin<U> implements IPlugin {
    private static Class Clazz;
    private static Logger Logger;

    /**
     * The Api service.
     */
    protected TelegramBotApiService ApiService = Telebot.getApiService();
    /**
     * The bot's username.
     */
    protected String BotUsername;

    protected Plugin(Class clazz) {
        ApiService.getMe().subscribe(userApiResponse -> BotUsername = userApiResponse.getResult().getUsername());
        Clazz = clazz;
        Logger = LoggerFactory.getLogger(Clazz.getSimpleName());
    }

    /**
     * Subscription method.
     * <p>
     * Used to attach Plugins to the API.
     */
    public void subscribe() {
        Telebot.getUpdateObservable().ofType(pluginUpdateType()).subscribe(this::pluginBody);
    }

    /**
     * Logging helper function.
     *
     * @param message   The message String
     * @param throwable The throwable
     * @param debug     A boolean to switch to Debug logging level
     */
    protected static void log(String message, Throwable throwable, Boolean debug) {
        if (throwable == null) {
            if (debug) {
                Logger.debug(message);
            } else {
                Logger.info(message);
            }
        } else {
            if (debug) {
                Logger.debug(message, throwable);
            } else {
                Logger.info(message, throwable);
            }
        }

    }

    /**
     * Logging helper function.
     *
     * @param message   The message String
     * @param throwable The throwable
     */
    protected static void log(String message, Throwable throwable) {
        log(message, throwable, false);
    }

    /**
     * Logging helper function.
     *
     * @param message The message String
     * @param debug   A boolean to switch to Debug logging level
     */
    protected static void log(String message, Boolean debug) {
        log(message, null, debug);
    }

    /**
     * Logging helper function.
     *
     * @param message The message String
     */
    protected static void log(String message) {
        log(message, null, false);
    }

    /**
     * Plugin body.
     *
     * @param update the update
     */
    public abstract void pluginBody(U update);

    /**
     * Plugin's expected type.
     *
     * @return the class
     */
    public abstract Class<U> pluginUpdateType();
}
