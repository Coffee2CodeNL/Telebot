package nl.dead_pixel.telebot.api.types.games;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.types.chat.MessageEntity;
import nl.dead_pixel.telebot.api.types.files.Animation;
import nl.dead_pixel.telebot.api.types.files.PhotoSize;

import java.util.List;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class Game {
    private String title;
    private String description;
    private List<PhotoSize> photo;
    private String text;
    @JsonProperty("text_entities")
    private List<MessageEntity> textEntities;
    private Animation animation;

    public String getTitle() {
        return title;
    }

    public Game setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Game setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<PhotoSize> getPhoto() {
        return photo;
    }

    public Game setPhoto(List<PhotoSize> photo) {
        this.photo = photo;
        return this;
    }

    public String getText() {
        return text;
    }

    public Game setText(String text) {
        this.text = text;
        return this;
    }

    public List<MessageEntity> getTextEntities() {
        return textEntities;
    }

    public Game setTextEntities(List<MessageEntity> textEntities) {
        this.textEntities = textEntities;
        return this;
    }

    public Animation getAnimation() {
        return animation;
    }

    public Game setAnimation(Animation animation) {
        this.animation = animation;
        return this;
    }
}
