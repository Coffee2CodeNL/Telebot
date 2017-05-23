package nl.dead_pixel.telebot.api.types.payment;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.types.chat.User;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
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

    public String getId() {
        return id;
    }

    public PreCheckoutQuery setId(String id) {
        this.id = id;
        return this;
    }

    public User getFrom() {
        return from;
    }

    public PreCheckoutQuery setFrom(User from) {
        this.from = from;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public PreCheckoutQuery setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public PreCheckoutQuery setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    public String getInvoicePayload() {
        return invoicePayload;
    }

    public PreCheckoutQuery setInvoicePayload(String invoicePayload) {
        this.invoicePayload = invoicePayload;
        return this;
    }

    public String getShippingOptionId() {
        return shippingOptionId;
    }

    public PreCheckoutQuery setShippingOptionId(String shippingOptionId) {
        this.shippingOptionId = shippingOptionId;
        return this;
    }

    public OrderInfo getOrderInfo() {
        return orderInfo;
    }

    public PreCheckoutQuery setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
        return this;
    }
}
