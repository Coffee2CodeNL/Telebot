package nl.dead_pixel.telebot.api.types.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.interfaces.IFile;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class Sticker implements IFile {
    @JsonProperty("file_id")
    private String fileId;
    private int width;
    private int height;
    private PhotoSize thumb;
    private String emoji;
    @JsonProperty("file_size")
    private int fileSize;

    public String getFileId() {
        return fileId;
    }

    public Sticker setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    public int getWidth() {
        return width;
    }

    public Sticker setWidth(int width) {
        this.width = width;
        return this;
    }

    public int getHeight() {
        return height;
    }

    public Sticker setHeight(int height) {
        this.height = height;
        return this;
    }

    public PhotoSize getThumb() {
        return thumb;
    }

    public Sticker setThumb(PhotoSize thumb) {
        this.thumb = thumb;
        return this;
    }

    public String getEmoji() {
        return emoji;
    }

    public Sticker setEmoji(String emoji) {
        this.emoji = emoji;
        return this;
    }

    public int getFileSize() {
        return fileSize;
    }

    public Sticker setFileSize(int fileSize) {
        this.fileSize = fileSize;
        return this;
    }
}
