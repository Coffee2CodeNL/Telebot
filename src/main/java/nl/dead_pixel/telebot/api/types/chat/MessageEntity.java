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
package nl.dead_pixel.telebot.api.types.chat;


/**
 * The type Message entity.
 */
public class MessageEntity {
    private String type;
    private Long offset;
    private Long length;
    private String url;
    private User user;

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     * @return the type
     */
    private MessageEntity setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Gets offset.
     *
     * @return the offset
     */
    public Long getOffset() {
        return offset;
    }

    /**
     * Sets offset.
     *
     * @param offset the offset
     * @return the offset
     */
    private MessageEntity setOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Gets length.
     *
     * @return the length
     */
    public Long getLength() {
        return length;
    }

    /**
     * Sets length.
     *
     * @param length the length
     * @return the length
     */
    private MessageEntity setLength(Long length) {
        this.length = length;
        return this;
    }

    /**
     * Gets url.
     *
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets url.
     *
     * @param url the url
     * @return the url
     */
    private MessageEntity setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     * @return the user
     */
    private MessageEntity setUser(User user) {
        this.user = user;
        return this;
    }
}
