package nl.dead_pixel.telebot.api.types.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.types.chat.User;


/**
 * The type Pre checkout query.
 */
public class PreCheckoutQuery {
    private String id;
    private User from;
    private String currency;
    @JsonProperty("total_amount")
    private int totalAmount;
    @JsonProperty("invoice_payload")
    private String invoicePayload;
    @JsonProperty("shipping_option_id")
    private String shippingOptionId;
    @JsonProperty("order_info")
    private OrderInfo orderInfo;

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
    public PreCheckoutQuery setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Gets from.
     *
     * @return the from
     */
    public User getFrom() {
        return from;
    }

    /**
     * Sets from.
     *
     * @param from the from
     * @return the from
     */
    public PreCheckoutQuery setFrom(User from) {
        this.from = from;
        return this;
    }

    /**
     * Gets currency.
     *
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets currency.
     *
     * @param currency the currency
     * @return the currency
     */
    public PreCheckoutQuery setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Gets total amount.
     *
     * @return the total amount
     */
    public int getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     * @return the total amount
     */
    public PreCheckoutQuery setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
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
    public PreCheckoutQuery setInvoicePayload(String invoicePayload) {
        this.invoicePayload = invoicePayload;
        return this;
    }

    /**
     * Gets shipping option id.
     *
     * @return the shipping option id
     */
    public String getShippingOptionId() {
        return shippingOptionId;
    }

    /**
     * Sets shipping option id.
     *
     * @param shippingOptionId the shipping option id
     * @return the shipping option id
     */
    public PreCheckoutQuery setShippingOptionId(String shippingOptionId) {
        this.shippingOptionId = shippingOptionId;
        return this;
    }

    /**
     * Gets order info.
     *
     * @return the order info
     */
    public OrderInfo getOrderInfo() {
        return orderInfo;
    }

    /**
     * Sets order info.
     *
     * @param orderInfo the order info
     * @return the order info
     */
    public PreCheckoutQuery setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
        return this;
    }
}
