package nl.dead_pixel.telebot.api.types.payment;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class SuccessfulPayment {
    private String currency;
    @JsonProperty("total_amount")
    private int totalAmount;
    @JsonProperty("invoice_payload")
    private String invoicePayload;
    @JsonProperty("shipping_option_id")
    private String shippingOptionId;
    @JsonProperty("order_info")
    private OrderInfo orderInfo;
    @JsonProperty("telegram_payment_charge_id")
    private String telegramPaymentChargeId;
    @JsonProperty("provider_payment_charge_id")
    private String providerPaymentChargeId;

    public String getCurrency() {
        return currency;
    }

    public SuccessfulPayment setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public SuccessfulPayment setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    public String getInvoicePayload() {
        return invoicePayload;
    }

    public SuccessfulPayment setInvoicePayload(String invoicePayload) {
        this.invoicePayload = invoicePayload;
        return this;
    }

    public String getShippingOptionId() {
        return shippingOptionId;
    }

    public SuccessfulPayment setShippingOptionId(String shippingOptionId) {
        this.shippingOptionId = shippingOptionId;
        return this;
    }

    public OrderInfo getOrderInfo() {
        return orderInfo;
    }

    public SuccessfulPayment setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
        return this;
    }

    public String getTelegramPaymentChargeId() {
        return telegramPaymentChargeId;
    }

    public SuccessfulPayment setTelegramPaymentChargeId(String telegramPaymentChargeId) {
        this.telegramPaymentChargeId = telegramPaymentChargeId;
        return this;
    }

    public String getProviderPaymentChargeId() {
        return providerPaymentChargeId;
    }

    public SuccessfulPayment setProviderPaymentChargeId(String providerPaymentChargeId) {
        this.providerPaymentChargeId = providerPaymentChargeId;
        return this;
    }
}
