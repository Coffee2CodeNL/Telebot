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
