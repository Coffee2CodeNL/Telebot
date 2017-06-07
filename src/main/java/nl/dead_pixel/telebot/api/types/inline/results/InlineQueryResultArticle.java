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
package nl.dead_pixel.telebot.api.types.inline.results;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.interfaces.IInlineQueryResult;
import nl.dead_pixel.telebot.interfaces.IInputMessageContent;
import nl.dead_pixel.telebot.api.types.keyboard.markups.InlineKeyboardMarkup;

import java.util.Optional;

/**
 * The type Inline query result article.
 */
public class InlineQueryResultArticle implements IInlineQueryResult {
    @JsonProperty("type")
    private String type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("input_message_content")
    private IInputMessageContent inputMessageContent;
    @JsonProperty("inline_keyboard_markup")
    private Optional<InlineKeyboardMarkup> inlineKeyboardMarkup = Optional.empty();
    @JsonProperty("url")
    private Optional<String> url = Optional.empty();
    @JsonProperty("hide_url")
    private Optional<Boolean> hideUrl = Optional.empty();
    @JsonProperty("description")
    private Optional<String> description = Optional.empty();
    @JsonProperty("thumb_url")
    private Optional<String> thumbUrl = Optional.empty();
    @JsonProperty("thumb_width")
    private Optional<Long> thumbWidth = Optional.empty();
    @JsonProperty("thumb_height")
    private Optional<Long> thumbHeight = Optional.empty();

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    private InlineQueryResultArticle setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    private InlineQueryResultArticle setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    private InlineQueryResultArticle setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Gets input message content.
     *
     * @return the input message content
     */
    public IInputMessageContent getInputMessageContent() {
        return inputMessageContent;
    }

    private InlineQueryResultArticle setInputMessageContent(IInputMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
        return this;
    }

    /**
     * Gets inline keyboard markup.
     *
     * @return the inline keyboard markup
     */
    public Optional<InlineKeyboardMarkup> getInlineKeyboardMarkup() {
        return inlineKeyboardMarkup;
    }

    private InlineQueryResultArticle setInlineKeyboardMarkup(InlineKeyboardMarkup inlineKeyboardMarkup) {
        this.inlineKeyboardMarkup = Optional.of(inlineKeyboardMarkup);
        return this;
    }

    /**
     * Gets url.
     *
     * @return the url
     */
    public Optional<String> getUrl() {
        return url;
    }

    private InlineQueryResultArticle setUrl(String url) {
        this.url = Optional.of(url);
        return this;
    }

    /**
     * Gets hide url.
     *
     * @return the hide url
     */
    public Optional<Boolean> getHideUrl() {
        return hideUrl;
    }

    private InlineQueryResultArticle setHideUrl(Boolean hideUrl) {
        this.hideUrl = Optional.of(hideUrl);
        return this;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public Optional<String> getDescription() {
        return description;
    }

    private InlineQueryResultArticle setDescription(String description) {
        this.description = Optional.of(description);
        return this;
    }

    /**
     * Gets thumb url.
     *
     * @return the thumb url
     */
    public Optional<String> getThumbUrl() {
        return thumbUrl;
    }

    private InlineQueryResultArticle setThumbUrl(String thumbUrl) {
        this.thumbUrl = Optional.of(thumbUrl);
        return this;
    }

    /**
     * Gets thumb width.
     *
     * @return the thumb width
     */
    public Optional<Long> getThumbWidth() {
        return thumbWidth;
    }

    private InlineQueryResultArticle setThumbWidth(Long thumbWidth) {
        this.thumbWidth = Optional.of(thumbWidth);
        return this;
    }

    /**
     * Gets thumb height.
     *
     * @return the thumb height
     */
    public Optional<Long> getThumbHeight() {
        return thumbHeight;
    }

    private InlineQueryResultArticle setThumbHeight(Long thumbHeight) {
        this.thumbHeight = Optional.of(thumbHeight);
        return this;
    }
}
