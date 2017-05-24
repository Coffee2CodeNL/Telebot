package nl.dead_pixel.telebot.api.types.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.interfaces.IFile;


/**
 * The type Audio.
 */
public class Audio implements IFile {
    @JsonProperty("file_id")
    private String fileId;
    private int duration;
    private String performer;
    private String title;
    @JsonProperty("mime_type")
    private String mimeType;
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
    public Audio setFileId(String fileId) {
        this.fileId = fileId;
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
    public Audio setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Gets performer.
     *
     * @return the performer
     */
    public String getPerformer() {
        return performer;
    }

    /**
     * Sets performer.
     *
     * @param performer the performer
     * @return the performer
     */
    public Audio setPerformer(String performer) {
        this.performer = performer;
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

    /**
     * Sets title.
     *
     * @param title the title
     * @return the title
     */
    public Audio setTitle(String title) {
        this.title = title;
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
    public Audio setMimeType(String mimeType) {
        this.mimeType = mimeType;
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
    public Audio setFileSize(int fileSize) {
        this.fileSize = fileSize;
        return this;
    }
}
