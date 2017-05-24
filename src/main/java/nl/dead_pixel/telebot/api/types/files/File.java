package nl.dead_pixel.telebot.api.types.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.interfaces.IFile;


/**
 * The type File.
 */
public class File implements IFile {
    @JsonProperty("file_id")
    private String fileId;
    @JsonProperty("file_size")
    private int fileSize;
    @JsonProperty("file_path")
    private String filePath;

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
    public File setFileId(String fileId) {
        this.fileId = fileId;
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
    public File setFileSize(int fileSize) {
        this.fileSize = fileSize;
        return this;
    }

    /**
     * Gets file path.
     *
     * @return the file path
     */
    public String getFilePath() {
        return filePath;
    }

    /**
     * Sets file path.
     *
     * @param filePath the file path
     * @return the file path
     */
    public File setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }
}
