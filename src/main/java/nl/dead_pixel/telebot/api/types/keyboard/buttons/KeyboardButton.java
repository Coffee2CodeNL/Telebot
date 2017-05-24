package nl.dead_pixel.telebot.api.types.keyboard.buttons;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The type Keyboard button.
 */
public class KeyboardButton {
    private String text;
    @JsonProperty("request_contact")
    private boolean requestContact;
    @JsonProperty("request_location")
    private boolean requestLocation;

    /**
     * Gets text.
     *
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * Sets text.
     *
     * @param text the text
     * @return the text
     */
    public KeyboardButton setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Is request contact boolean.
     *
     * @return the boolean
     */
    public boolean isRequestContact() {
        return requestContact;
    }

    /**
     * Sets request contact.
     *
     * @param requestContact the request contact
     * @return the request contact
     */
    public KeyboardButton setRequestContact(boolean requestContact) {
        this.requestContact = requestContact;
        return this;
    }

    /**
     * Is request location boolean.
     *
     * @return the boolean
     */
    public boolean isRequestLocation() {
        return requestLocation;
    }

    /**
     * Sets request location.
     *
     * @param requestLocation the request location
     * @return the request location
     */
    public KeyboardButton setRequestLocation(boolean requestLocation) {
        this.requestLocation = requestLocation;
        return this;
    }
}
