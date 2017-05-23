package nl.dead_pixel.telebot.api.types.payment;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class OrderInfo {
    private String name;
    @JsonProperty("phone_number")
    private String phoneNumber;
    private String email;
    @JsonProperty("shipping_address")
    private ShippingAddress shippingAddress;

    public String getName() {
        return name;
    }

    public OrderInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public OrderInfo setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public OrderInfo setEmail(String email) {
        this.email = email;
        return this;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public OrderInfo setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }
}
