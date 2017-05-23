package nl.dead_pixel.telebot.api.types.chat;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class Location {
    private float longitude;
    private float latitude;

    public float getLongitude() {
        return longitude;
    }

    public Location setLongitude(float longitude) {
        this.longitude = longitude;
        return this;
    }

    public float getLatitude() {
        return latitude;
    }

    public Location setLatitude(float latitude) {
        this.latitude = latitude;
        return this;
    }
}
