package nl.dead_pixel.telebot.api.types.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.interfaces.IFile;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class PhotoSize implements IFile {
    @JsonProperty("file_id")
    private String fileId;
    private int width;
    private int height;
    @JsonProperty("file_size")
    private int fileSize;

    public String getFileId() {
        return fileId;
    }

    public PhotoSize setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    public int getWidth() {
        return width;
    }

    public PhotoSize setWidth(int width) {
        this.width = width;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public PhotoSize setHeight(int height) {
        this.height = height;
        return this;
    }

    public int getFileSize() {
        return fileSize;
    }

    public PhotoSize setFileSize(int fileSize) {
        this.fileSize = fileSize;
        return this;
    }
}
