/**
 *    Copyright 2017 Remon Schopmeijer (49CDB43A4FB4D8AFF5361E8C79147FFF4E3C86DE) <support-telebot@dead-pixel.nl>
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package nl.dead_pixel.telebot.api.types.files;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.interfaces.IFile;


/**
 * The type Voice.
 */
public class Voice implements IFile {
    @JsonProperty("file_id")
    private String fileId;
    private Long duration;
    @JsonProperty("mime_type")
    private String mimeType;
    @JsonProperty("file_size")
    private Long fileSize;

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
    private Voice setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * Gets duration.
     *
     * @return the duration
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * Sets duration.
     *
     * @param duration the duration
     * @return the duration
     */
    private Voice setDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Gets mime type.
     *
     * @return the mime type
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets mime type.
     *
     * @param mimeType the mime type
     * @return the mime type
     */
    private Voice setMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }

    /**
     * Gets file size.
     *
     * @return the file size
     */
    public Long getFileSize() {
        return fileSize;
    }

    /**
     * Sets file size.
     *
     * @param fileSize the file size
     * @return the file size
     */
    private Voice setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
}
