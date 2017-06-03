package nl.dead_pixel.telebot.api.types.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.interfaces.IFile;


/**
 * The type Video.
 */
public class Video implements IFile {
    @JsonProperty("file_id")
    private String fileId;
    private Long width;
    private Long height;
    private Long duration;
    private PhotoSize thumb;
    private String mimeType;
    @JsonProperty("file_size")
    private Long fileSize;

    /**
     * Gets file id.
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
    public Video setFileId(String fileId) {
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
    public Video setWidth(Long width) {
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
    public Video setHeight(Long height) {
        this.height = height;
        return this;
    }

    /**
     * Gets duration.
     *
     * @return the duration
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * Sets duration.
     *
     * @param duration the duration
     * @return the duration
     */
    public Video setDuration(Long duration) {
        this.duration = duration;
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
    public Video setThumb(PhotoSize thumb) {
        this.thumb = thumb;
        return this;
    }

    /**
     * Gets mime type.
     *
     * @return the mime type
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets mime type.
     *
     * @param mimeType the mime type
     * @return the mime type
     */
    public Video setMimeType(String mimeType) {
        this.mimeType = mimeType;
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
    public Video setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
}
