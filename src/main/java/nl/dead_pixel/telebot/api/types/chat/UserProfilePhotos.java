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
