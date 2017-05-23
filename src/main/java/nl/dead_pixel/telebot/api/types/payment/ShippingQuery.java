package nl.dead_pixel.telebot.api.types.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.types.chat.User;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class ShippingQuery {
    private String id;
    private User user;
    @JsonProperty("invoice_payload")
    private String invoicePayload;
    @JsonProperty("shipping_address")
    private ShippingAddress shippingAddress;

    public String getId() {
        return id;
    }

    public ShippingQuery setId(String id) {
        this.id = id;
        return this;
    }

    public User getUser() {
        return user;
    }

    public ShippingQuery setUser(User user) {
        this.user = user;
        return this;
    }

    public String getInvoicePayload() {
        return invoicePayload;
    }

    public ShippingQuery setInvoicePayload(String invoicePayload) {
        this.invoicePayload = invoicePayload;
        return this;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public ShippingQuery setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }
}
