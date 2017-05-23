package nl.dead_pixel.telebot.api.types.payment;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class ShippingAddress {
    @JsonProperty("country_code")
    private String countryCode;
    private String state;
    private String city;
    @JsonProperty("street_line1")
    private String streetLine1;
    @JsonProperty("street_line2")
    private String streetLine2;
    @JsonProperty("post_code")
    private String postCode;

    public String getCountryCode() {
        return countryCode;
    }

    public ShippingAddress setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public String getState() {
        return state;
    }

    public ShippingAddress setState(String state) {
        this.state = state;
        return this;
    }

    public String getCity() {
        return city;
    }

    public ShippingAddress setCity(String city) {
        this.city = city;
        return this;
    }

    public String getStreetLine1() {
        return streetLine1;
    }

    public ShippingAddress setStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
        return this;
    }

    public String getStreetLine2() {
        return streetLine2;
    }

    public ShippingAddress setStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
        return this;
    }

    public String getPostCode() {
        return postCode;
    }

    public ShippingAddress setPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }
}
