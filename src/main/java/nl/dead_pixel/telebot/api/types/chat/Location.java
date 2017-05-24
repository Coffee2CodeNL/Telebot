package nl.dead_pixel.telebot.api.types.chat;


/**
 * The type Location.
 */
public class Location {
    private float longitude;
    private float latitude;

    /**
     * Gets longitude.
     *
     * @return the longitude
     */
    public float getLongitude() {
        return longitude;
    }

    /**
     * Sets longitude.
     *
     * @param longitude the longitude
     * @return the longitude
     */
    public Location setLongitude(float longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Gets latitude.
     *
     * @return the latitude
     */
    public float getLatitude() {
        return latitude;
    }

    /**
     * Sets latitude.
     *
     * @param latitude the latitude
     * @return the latitude
     */
    public Location setLatitude(float latitude) {
        this.latitude = latitude;
        return this;
    }
}
