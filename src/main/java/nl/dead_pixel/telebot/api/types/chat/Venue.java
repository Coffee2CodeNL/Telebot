package nl.dead_pixel.telebot.api.types.chat;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class Venue {
    private Location location;
    private String title;
    private String address;
    @JsonProperty("foursquare_id")
    private String foursquareId;

    public Location getLocation() {
        return location;
    }

    public Venue setLocation(Location location) {
        this.location = location;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Venue setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Venue setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getFoursquareId() {
        return foursquareId;
    }

    public Venue setFoursquareId(String foursquareId) {
        this.foursquareId = foursquareId;
        return this;
    }
}
