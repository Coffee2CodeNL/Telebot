package nl.dead_pixel.telebot.api.types.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.interfaces.IFile;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class Voice implements IFile {
    @JsonProperty("file_id")
    private String fileId;
    private int duration;
    @JsonProperty("mime_type")
    private String mimeType;
    @JsonProperty("file_size")
    private int fileSize;

    public String getFileId() {
        return fileId;
    }

    public Voice setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    public int getDuration() {
        return duration;
    }

    public Voice setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    public String getMimeType() {
        return mimeType;
    }

    public Voice setMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public int getFileSize() {
        return fileSize;
    }

    public Voice setFileSize(int fileSize) {
        this.fileSize = fileSize;
        return this;
    }
}
