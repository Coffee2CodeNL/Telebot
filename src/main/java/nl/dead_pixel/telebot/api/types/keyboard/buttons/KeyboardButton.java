package nl.dead_pixel.telebot.api.types.keyboard.buttons;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class KeyboardButton {
    private String text;
    @JsonProperty("request_contact")
    private boolean requestContact;
    @JsonProperty("request_location")
    private boolean requestLocation;

    public String getText() {
        return text;
    }

    public KeyboardButton setText(String text) {
        this.text = text;
        return this;
    }

    public boolean isRequestContact() {
        return requestContact;
    }

    public KeyboardButton setRequestContact(boolean requestContact) {
        this.requestContact = requestContact;
        return this;
    }

    public boolean isRequestLocation() {
        return requestLocation;
    }

    public KeyboardButton setRequestLocation(boolean requestLocation) {
        this.requestLocation = requestLocation;
        return this;
    }
}
