package nl.dead_pixel.telebot.api.types.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.interfaces.IFile;


/**
 * The type Sticker.
 */
public class Sticker implements IFile {
    @JsonProperty("file_id")
    private String fileId;
    private Long width;
    private Long height;
    private PhotoSize thumb;
    private String emoji;
    @JsonProperty("file_size")
    private Long fileSize;

    /**
     * Gets the file id.
     *
     * @return the file id
     */
    public String getFileId() {
        return fileId;
    }

    /**
     * Sets file id.
     *
     * @param fileId the file id
     * @return the file id
     */
    public Sticker setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    public Long getWidth() {
        return width;
    }

    /**
     * Sets width.
     *
     * @param width the width
     * @return the width
     */
    public Sticker setWidth(Long width) {
        this.width = width;
        return this;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    public Long getHeight() {
        return height;
    }

    /**
     * Sets height.
     *
     * @param height the height
     * @return the height
     */
    public Sticker setHeight(Long height) {
        this.height = height;
        return this;
    }

    /**
     * Gets thumb.
     *
     * @return the thumb
     */
    public PhotoSize getThumb() {
        return thumb;
    }

    /**
     * Sets thumb.
     *
     * @param thumb the thumb
     * @return the thumb
     */
    public Sticker setThumb(PhotoSize thumb) {
        this.thumb = thumb;
        return this;
    }

    /**
     * Gets emoji.
     *
     * @return the emoji
     */
    public String getEmoji() {
        return emoji;
    }

    /**
     * Sets emoji.
     *
     * @param emoji the emoji
     * @return the emoji
     */
    public Sticker setEmoji(String emoji) {
        this.emoji = emoji;
        return this;
    }

    /**
     * Gets file size.
     *
     * @return the file size
     */
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * Sets file size.
     *
     * @param fileSize the file size
     * @return the file size
     */
    public Sticker setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
}
