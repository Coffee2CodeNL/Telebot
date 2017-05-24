package nl.dead_pixel.telebot.api.types.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.interfaces.IFile;


/**
 * The type Video note.
 */
public class VideoNote implements IFile {
    @JsonProperty("file_id")
    private String fileId;
    private int length;
    private int duration;
    private PhotoSize thumb;
    @JsonProperty("file_size")
    private int fileSize;

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
    public VideoNote setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * Gets length.
     *
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * Sets length.
     *
     * @param length the length
     * @return the length
     */
    public VideoNote setLength(int length) {
        this.length = length;
        return this;
    }

    /**
     * Gets duration.
     *
     * @return the duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Sets duration.
     *
     * @param duration the duration
     * @return the duration
     */
    public VideoNote setDuration(int duration) {
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
    public VideoNote setThumb(PhotoSize thumb) {
        this.thumb = thumb;
        return this;
    }

    /**
     * Gets file size.
     *
     * @return the file size
     */
    public int getFileSize() {
        return fileSize;
    }

    /**
     * Sets file size.
     *
     * @param fileSize the file size
     * @return the file size
     */
    public VideoNote setFileSize(int fileSize) {
        this.fileSize = fileSize;
        return this;
    }
}
