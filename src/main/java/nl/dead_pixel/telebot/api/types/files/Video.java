package nl.dead_pixel.telebot.api.types.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.interfaces.IFile;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class Video implements IFile {
    @JsonProperty("file_id")
    private String fileId;
    private int width;
    private int height;
    private int duration;
    private PhotoSize thumb;
    private String mimeType;
    @JsonProperty("file_size")
    private int fileSize;

    public String getFileId() {
        return fileId;
    }

    public Video setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    public int getWidth() {
        return width;
    }

    public Video setWidth(int width) {
        this.width = width;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public Video setHeight(int height) {
        this.height = height;
        return this;
    }

    public int getDuration() {
        return duration;
    }

    public Video setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    public PhotoSize getThumb() {
        return thumb;
    }

    public Video setThumb(PhotoSize thumb) {
        this.thumb = thumb;
        return this;
    }

    public String getMimeType() {
        return mimeType;
    }

    public Video setMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public int getFileSize() {
        return fileSize;
    }

    public Video setFileSize(int fileSize) {
        this.fileSize = fileSize;
        return this;
    }
}
