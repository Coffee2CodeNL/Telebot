package nl.dead_pixel.telebot.api.types.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.interfaces.IFile;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
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
    private int fileSize;

    public String getFileId() {
        return fileId;
    }

    public Animation setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    public PhotoSize getThumb() {
        return thumb;
    }

    public Animation setThumb(PhotoSize thumb) {
        this.thumb = thumb;
        return this;
    }

    public String getFileName() {
        return fileName;
    }

    public Animation setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public String getMimeType() {
        return mimeType;
    }

    public Animation setMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public int getFileSize() {
        return fileSize;
    }

    public Animation setFileSize(int fileSize) {
        this.fileSize = fileSize;
        return this;
    }
}
