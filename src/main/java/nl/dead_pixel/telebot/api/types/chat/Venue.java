package nl.dead_pixel.telebot.api.types.chat;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The type Venue.
 */
public class Venue {
    private Location location;
    private String title;
    private String address;
    @JsonProperty("foursquare_id")
    private String foursquareId;

    /**
     * Gets location.
     *
     * @return the location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets location.
     *
     * @param location the location
     * @return the location
     */
    private Venue setLocation(Location location) {
        this.location = location;
        return this;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     * @return the title
     */
    private Venue setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     * @return the address
     */
    private Venue setAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Gets foursquare id.
     *
     * @return the foursquare id
     */
    public String getFoursquareId() {
        return foursquareId;
    }

    /**
     * Sets foursquare id.
     *
     * @param foursquareId the foursquare id
     * @return the foursquare id
     */
    private Venue setFoursquareId(String foursquareId) {
        this.foursquareId = foursquareId;
        return this;
    }
}
