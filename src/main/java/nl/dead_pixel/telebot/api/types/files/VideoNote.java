package nl.dead_pixel.telebot.api.types.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.interfaces.IFile;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class VideoNote implements IFile {
    @JsonProperty("file_id")
    private String fileId;
    private int length;
    private int duration;
    private PhotoSize thumb;
    @JsonProperty("file_size")
    private int fileSize;

    public String getFileId() {
        return fileId;
    }

    public VideoNote setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    public int getLength() {
        return length;
    }

    public VideoNote setLength(int length) {
        this.length = length;
        return this;
    }

    public int getDuration() {
        return duration;
    }

    public VideoNote setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    public PhotoSize getThumb() {
        return thumb;
    }

    public VideoNote setThumb(PhotoSize thumb) {
        this.thumb = thumb;
        return this;
    }

    public int getFileSize() {
        return fileSize;
    }

    public VideoNote setFileSize(int fileSize) {
        this.fileSize = fileSize;
        return this;
    }
}
