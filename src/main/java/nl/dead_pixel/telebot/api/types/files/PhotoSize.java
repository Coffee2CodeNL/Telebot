package nl.dead_pixel.telebot.api.types.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.interfaces.IFile;


/**
 * The type Photo size.
 */
public class PhotoSize implements IFile {
    @JsonProperty("file_id")
    private String fileId;
    private int width;
    private int height;
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
    public PhotoSize setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets width.
     *
     * @param width the width
     * @return the width
     */
    public PhotoSize setWidth(int width) {
        this.width = width;
        return this;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets height.
     *
     * @param height the height
     * @return the height
     */
    public PhotoSize setHeight(int height) {
        this.height = height;
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
    public PhotoSize setFileSize(int fileSize) {
        this.fileSize = fileSize;
        return this;
    }
}
