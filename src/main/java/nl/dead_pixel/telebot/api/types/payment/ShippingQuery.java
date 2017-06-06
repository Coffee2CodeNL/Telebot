package nl.dead_pixel.telebot.api.types.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.interfaces.IUpdate;
import nl.dead_pixel.telebot.api.types.chat.User;


/**
 * The type Shipping query.
 */
public class ShippingQuery implements IUpdate {
    private String id;
    private User user;
    @JsonProperty("invoice_payload")
    private String invoicePayload;
    @JsonProperty("shipping_address")
    private ShippingAddress shippingAddress;

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     * @return the id
     */
    private ShippingQuery setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     * @return the user
     */
    private ShippingQuery setUser(User user) {
        this.user = user;
        return this;
    }

    /**
     * Gets invoice payload.
     *
     * @return the invoice payload
     */
    public String getInvoicePayload() {
        return invoicePayload;
    }

    /**
     * Sets invoice payload.
     *
     * @param invoicePayload the invoice payload
     * @return the invoice payload
     */
    private ShippingQuery setInvoicePayload(String invoicePayload) {
        this.invoicePayload = invoicePayload;
        return this;
    }

    /**
     * Gets shipping address.
     *
     * @return the shipping address
     */
    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Sets shipping address.
     *
     * @param shippingAddress the shipping address
     * @return the shipping address
     */
    private ShippingQuery setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }
}
