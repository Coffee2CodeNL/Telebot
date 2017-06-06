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
package nl.dead_pixel.telebot.api.types.misc;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The type Response parameters.
 */
public class ResponseParameters {
    @JsonProperty("migrate_to_chat_id")
    private Long migrateToChatId;
    @JsonProperty("retry_after")
    private Long retryAfter;

    /**
     * Gets migrate to chat id.
     *
     * @return the migrate to chat id
     */
    public Long getMigrateToChatId() {
        return migrateToChatId;
    }

    /**
     * Sets migrate to chat id.
     *
     * @param migrateToChatId the migrate to chat id
     * @return the migrate to chat id
     */
    private ResponseParameters setMigrateToChatId(Long migrateToChatId) {
        this.migrateToChatId = migrateToChatId;
        return this;
    }

    /**
     * Gets retry after.
     *
     * @return the retry after
     */
    public Long getRetryAfter() {
        return retryAfter;
    }

    /**
     * Sets retry after.
     *
     * @param retryAfter the retry after
     * @return the retry after
     */
    private ResponseParameters setRetryAfter(Long retryAfter) {
        this.retryAfter = retryAfter;
        return this;
    }
}
