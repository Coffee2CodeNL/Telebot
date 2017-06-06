/**
 *    Copyright (C) 2017 Remon Schopmeijer (79147FFF4E3C86DE) <support-telebot@dead-pixel.nl>
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
package nl.dead_pixel.telebot.api.types.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.types.files.PhotoSize;

import java.util.List;


/**
 * The type User profile photos.
 */
public class UserProfilePhotos {
    @JsonProperty("total_count")
    private Long totalCount;
    private List<List<PhotoSize>> photos;

    /**
     * Gets total count.
     *
     * @return the total count
     */
    public Long getTotalCount() {
        return totalCount;
    }

    /**
     * Sets total count.
     *
     * @param totalCount the total count
     * @return the total count
     */
    private UserProfilePhotos setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Gets photos.
     *
     * @return the photos
     */
    public List<List<PhotoSize>> getPhotos() {
        return photos;
    }

    /**
     * Sets photos.
     *
     * @param photos the photos
     * @return the photos
     */
    private UserProfilePhotos setPhotos(List<List<PhotoSize>> photos) {
        this.photos = photos;
        return this;
    }
}
