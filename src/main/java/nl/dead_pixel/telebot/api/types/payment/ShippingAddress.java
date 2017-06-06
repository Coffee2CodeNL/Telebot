package nl.dead_pixel.telebot.api.types.payment;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The type Shipping address.
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

    /**
     * Gets country code.
     *
     * @return the country code
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets country code.
     *
     * @param countryCode the country code
     * @return the country code
     */
    private ShippingAddress setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Gets state.
     *
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * Sets state.
     *
     * @param state the state
     * @return the state
     */
    private ShippingAddress setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Gets city.
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets city.
     *
     * @param city the city
     * @return the city
     */
    private ShippingAddress setCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Gets street line 1.
     *
     * @return the street line 1
     */
    public String getStreetLine1() {
        return streetLine1;
    }

    /**
     * Sets street line 1.
     *
     * @param streetLine1 the street line 1
     * @return the street line 1
     */
    private ShippingAddress setStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
        return this;
    }

    /**
     * Gets street line 2.
     *
     * @return the street line 2
     */
    public String getStreetLine2() {
        return streetLine2;
    }

    /**
     * Sets street line 2.
     *
     * @param streetLine2 the street line 2
     * @return the street line 2
     */
    private ShippingAddress setStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
        return this;
    }

    /**
     * Gets post code.
     *
     * @return the post code
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets post code.
     *
     * @param postCode the post code
     * @return the post code
     */
    private ShippingAddress setPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }
}
