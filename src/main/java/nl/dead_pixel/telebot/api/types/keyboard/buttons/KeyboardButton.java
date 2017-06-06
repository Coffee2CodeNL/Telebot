package nl.dead_pixel.telebot.api.types.keyboard.buttons;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The type Keyboard button.
 */
public class KeyboardButton {
    private String text;
    @JsonProperty("request_contact")
    private Boolean requestContact;
    @JsonProperty("request_location")
    private Boolean requestLocation;

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
    private KeyboardButton setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Is request contact Boolean.
     *
     * @return the Boolean
     */
    public Boolean isRequestContact() {
        return requestContact;
    }

    /**
     * Sets request contact.
     *
     * @param requestContact the request contact
     * @return the request contact
     */
    private KeyboardButton setRequestContact(Boolean requestContact) {
        this.requestContact = requestContact;
        return this;
    }

    /**
     * Is request location Boolean.
     *
     * @return the Boolean
     */
    public Boolean isRequestLocation() {
        return requestLocation;
    }

    /**
     * Sets request location.
     *
     * @param requestLocation the request location
     * @return the request location
     */
    private KeyboardButton setRequestLocation(Boolean requestLocation) {
        this.requestLocation = requestLocation;
        return this;
    }
}
