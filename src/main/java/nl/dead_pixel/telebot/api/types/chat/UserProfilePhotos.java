package nl.dead_pixel.telebot.api.types.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.types.files.PhotoSize;

import java.util.List;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class UserProfilePhotos {
    @JsonProperty("total_count")
    private int totalCount;
    private List<List<PhotoSize>> photos;

    public int getTotalCount() {
        return totalCount;
    }

    public UserProfilePhotos setTotalCount(int totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    public List<List<PhotoSize>> getPhotos() {
        return photos;
    }

    public UserProfilePhotos setPhotos(List<List<PhotoSize>> photos) {
        this.photos = photos;
        return this;
    }
}
