package nl.dead_pixel.telebot.api.types.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.interfaces.IFile;


/**
 * The type Animation.
 */
public class Animation implements IFile {
    @JsonProperty("file_id")
    private String fileId;
    private PhotoSize thumb;
    @JsonProperty("file_name")
    private String fileName;
    @JsonProperty("mime_type")
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
    private Animation setFileId(String fileId) {
        this.fileId = fileId;
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
    private Animation setThumb(PhotoSize thumb) {
        this.thumb = thumb;
        return this;
    }

    /**
     * Gets file name.
     *
     * @return the file name
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets file name.
     *
     * @param fileName the file name
     * @return the file name
     */
    private Animation setFileName(String fileName) {
        this.fileName = fileName;
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
    private Animation setMimeType(String mimeType) {
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
    private Animation setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
}
