package nl.dead_pixel.telebot.api.types.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.interfaces.IFile;

/**
 * Created by resco on 22-5-2017.
 */
public class Document implements IFile {
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

    public Document setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    public PhotoSize getThumb() {
        return thumb;
    }

    public Document setThumb(PhotoSize thumb) {
        this.thumb = thumb;
        return this;
    }

    public String getFileName() {
        return fileName;
    }

    public Document setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public String getMimeType() {
        return mimeType;
    }

    public Document setMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    public int getFileSize() {
        return fileSize;
    }

    public Document setFileSize(int fileSize) {
        this.fileSize = fileSize;
        return this;
    }
}
