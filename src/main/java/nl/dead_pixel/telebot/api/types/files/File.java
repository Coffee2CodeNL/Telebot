package nl.dead_pixel.telebot.api.types.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.interfaces.IFile;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class File implements IFile {
    @JsonProperty("file_id")
    private String fileId;
    @JsonProperty("file_size")
    private int fileSize;
    @JsonProperty("file_path")
    private String filePath;

    public String getFileId() {
        return fileId;
    }

    public File setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    public int getFileSize() {
        return fileSize;
    }

    public File setFileSize(int fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    public String getFilePath() {
        return filePath;
    }

    public File setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
}
