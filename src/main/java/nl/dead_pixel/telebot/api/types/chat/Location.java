package nl.dead_pixel.telebot.api.types.chat;


/**
 * The type Location.
 */
public class Location {
    private Float longitude;
    private Float latitude;

    /**
     * Gets longitude.
     *
     * @return the longitude
     */
    public Float getLongitude() {
        return longitude;
    }

    /**
     * Sets longitude.
     *
     * @param longitude the longitude
     * @return the longitude
     */
    private Location setLongitude(Float longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Gets latitude.
     *
     * @return the latitude
     */
    public Float getLatitude() {
        return latitude;
    }

    /**
     * Sets latitude.
     *
     * @param latitude the latitude
     * @return the latitude
     */
    private Location setLatitude(Float latitude) {
        this.latitude = latitude;
        return this;
    }
}
