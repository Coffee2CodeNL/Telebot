package nl.dead_pixel.telebot.api.types.games;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.types.chat.MessageEntity;
import nl.dead_pixel.telebot.api.types.files.Animation;
import nl.dead_pixel.telebot.api.types.files.PhotoSize;

import java.util.List;


/**
 * The type Game.
 */
public class Game {
    private String title;
    private String description;
    private List<PhotoSize> photo;
    private String text;
    @JsonProperty("text_entities")
    private List<MessageEntity> textEntities;
    private Animation animation;

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     * @return the title
     */
    private Game setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     * @return the description
     */
    private Game setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Gets photo.
     *
     * @return the photo
     */
    public List<PhotoSize> getPhoto() {
        return photo;
    }

    /**
     * Sets photo.
     *
     * @param photo the photo
     * @return the photo
     */
    private Game setPhoto(List<PhotoSize> photo) {
        this.photo = photo;
        return this;
    }

    /**
     * Gets text.
     *
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * Sets text.
     *
     * @param text the text
     * @return the text
     */
    private Game setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Gets text entities.
     *
     * @return the text entities
     */
    public List<MessageEntity> getTextEntities() {
        return textEntities;
    }

    /**
     * Sets text entities.
     *
     * @param textEntities the text entities
     * @return the text entities
     */
    private Game setTextEntities(List<MessageEntity> textEntities) {
        this.textEntities = textEntities;
        return this;
    }

    /**
     * Gets animation.
     *
     * @return the animation
     */
    public Animation getAnimation() {
        return animation;
    }

    /**
     * Sets animation.
     *
     * @param animation the animation
     * @return the animation
     */
    private Game setAnimation(Animation animation) {
        this.animation = animation;
        return this;
    }
}
