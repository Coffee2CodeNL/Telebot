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
package nl.dead_pixel.telebot.api.types.keyboard.helpers;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.interfaces.IReplyMarkup;


/**
 * The type Force reply.
 */
public class ForceReply implements IReplyMarkup {
    @JsonProperty("force_reply")
    private Boolean forceReply = true;
    private Boolean selective;

    /**
     * Is force reply Boolean.
     *
     * @return the Boolean
     */
    public Boolean isForceReply() {
        return forceReply;
    }

    /**
     * Sets force reply.
     *
     * @param forceReply the force reply
     * @return the force reply
     */
    private ForceReply setForceReply(Boolean forceReply) {
        this.forceReply = forceReply;
        return this;
    }

    /**
     * Is selective Boolean.
     *
     * @return the Boolean
     */
    public Boolean isSelective() {
        return selective;
    }

    /**
     * Sets selective.
     *
     * @param selective the selective
     * @return the selective
     */
    private ForceReply setSelective(Boolean selective) {
        this.selective = selective;
        return this;
    }
}
