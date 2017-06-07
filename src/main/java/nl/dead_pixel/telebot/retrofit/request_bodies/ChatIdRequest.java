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
package nl.dead_pixel.telebot.retrofit.request_bodies;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The type Chat id request.
 */
public class ChatIdRequest {
    @JsonProperty("chat_id")
    private Object chatId;

    /**
     * @param identifier Numeric Chat ID
     */
    private ChatIdRequest(Long identifier) {
        this.chatId = identifier;
    }


    /**
     * @param identifier String Chat ID ({@code @username})
     */
    private ChatIdRequest(String identifier) {
        this.chatId = identifier;
    }

    /**
     * Sets unique id.
     *
     * @param identifier Unique identifier for the target chat
     * @return A {@link ChatIdRequest} object to be used with numeric ID's
     */
    public static ChatIdRequest setUniqueId(Long identifier) {
        return new ChatIdRequest(identifier);
    }

    /**
     * Sets channel username.
     *
     * @param identifier Unique identifier for the target chat
     * @return A {@link ChatIdRequest} object to be used with numeric ID's
     */
    public static ChatIdRequest setChannelUsername(String identifier) {
        return new ChatIdRequest(identifier);
    }
}
