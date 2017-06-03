package nl.dead_pixel.telebot.api.types.inline.results;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.interfaces.IInlineQueryResult;
import nl.dead_pixel.telebot.api.interfaces.IInputMessageContent;
import nl.dead_pixel.telebot.api.types.keyboard.markups.InlineKeyboardMarkup;

import java.util.Optional;

/**
 * @author ReSco
 * @since 22:34 2-6-2017
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

    public String getType() {
        return type;
    }

    public InlineQueryResultArticle setType(String type) {
        this.type = type;
        return this;
    }

    public String getId() {
        return id;
    }

    public InlineQueryResultArticle setId(String id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public InlineQueryResultArticle setTitle(String title) {
        this.title = title;
        return this;
    }

    public IInputMessageContent getInputMessageContent() {
        return inputMessageContent;
    }

    public InlineQueryResultArticle setInputMessageContent(IInputMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
        return this;
    }

    public Optional<InlineKeyboardMarkup> getInlineKeyboardMarkup() {
        return inlineKeyboardMarkup;
    }

    public InlineQueryResultArticle setInlineKeyboardMarkup(InlineKeyboardMarkup inlineKeyboardMarkup) {
        this.inlineKeyboardMarkup = Optional.of(inlineKeyboardMarkup);
        return this;
    }

    public Optional<String> getUrl() {
        return url;
    }

    public InlineQueryResultArticle setUrl(String url) {
        this.url = Optional.of(url);
        return this;
    }

    public Optional<Boolean> getHideUrl() {
        return hideUrl;
    }

    public InlineQueryResultArticle setHideUrl(Boolean hideUrl) {
        this.hideUrl = Optional.of(hideUrl);
        return this;
    }

    public Optional<String> getDescription() {
        return description;
    }

    public InlineQueryResultArticle setDescription(String description) {
        this.description = Optional.of(description);
        return this;
    }

    public Optional<String> getThumbUrl() {
        return thumbUrl;
    }

    public InlineQueryResultArticle setThumbUrl(String thumbUrl) {
        this.thumbUrl = Optional.of(thumbUrl);
        return this;
    }

    public Optional<Long> getThumbWidth() {
        return thumbWidth;
    }

    public InlineQueryResultArticle setThumbWidth(Long thumbWidth) {
        this.thumbWidth = Optional.of(thumbWidth);
        return this;
    }

    public Optional<Long> getThumbHeight() {
        return thumbHeight;
    }

    public InlineQueryResultArticle setThumbHeight(Long thumbHeight) {
        this.thumbHeight = Optional.of(thumbHeight);
        return this;
    }
}
