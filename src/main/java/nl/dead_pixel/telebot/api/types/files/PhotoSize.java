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
 * The type Photo size.
 */
public class PhotoSize implements IFile {
    @JsonProperty("file_id")
    private String fileId;
    private Long width;
    private Long height;
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
    private PhotoSize setFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * Gets width.
     *
     * @return the width
     */
    public Long getWidth() {
        return width;
    }

    /**
     * Sets width.
     *
     * @param width the width
     * @return the width
     */
    private PhotoSize setWidth(Long width) {
        this.width = width;
        return this;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    public Long getHeight() {
        return height;
    }

    /**
     * Sets height.
     *
     * @param height the height
     * @return the height
     */
    private PhotoSize setHeight(Long height) {
        this.height = height;
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
    private PhotoSize setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
}
