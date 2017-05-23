package nl.dead_pixel.telebot.api.types.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.interfaces.IFile;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
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

    public String getFileId() {
        return fileId;
    }

    public Audio setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    public int getDuration() {
        return duration;
    }

    public Audio setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    public String getPerformer() {
        return performer;
    }

    public Audio setPerformer(String performer) {
        this.performer = performer;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Audio setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getMimeType() {
        return mimeType;
    }

    public Audio setMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public int getFileSize() {
        return fileSize;
    }

    public Audio setFileSize(int fileSize) {
        this.fileSize = fileSize;
        return this;
    }
}
