package nl.dead_pixel.telebot.api.types.payment;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The type Successful payment.
 */
public class SuccessfulPayment {
    private String currency;
    @JsonProperty("total_amount")
    private Long totalAmount;
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
    public SuccessfulPayment setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Gets total amount.
     *
     * @return the total amount
     */
    public Long getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     * @return the total amount
     */
    public SuccessfulPayment setTotalAmount(Long totalAmount) {
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
    public SuccessfulPayment setInvoicePayload(String invoicePayload) {
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
    public SuccessfulPayment setShippingOptionId(String shippingOptionId) {
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
    public SuccessfulPayment setOrderInfo(OrderInfo orderInfo) {
        this.orderInfo = orderInfo;
        return this;
    }

    /**
     * Gets telegram payment charge id.
     *
     * @return the telegram payment charge id
     */
    public String getTelegramPaymentChargeId() {
        return telegramPaymentChargeId;
    }

    /**
     * Sets telegram payment charge id.
     *
     * @param telegramPaymentChargeId the telegram payment charge id
     * @return the telegram payment charge id
     */
    public SuccessfulPayment setTelegramPaymentChargeId(String telegramPaymentChargeId) {
        this.telegramPaymentChargeId = telegramPaymentChargeId;
        return this;
    }

    /**
     * Gets provider payment charge id.
     *
     * @return the provider payment charge id
     */
    public String getProviderPaymentChargeId() {
        return providerPaymentChargeId;
    }

    /**
     * Sets provider payment charge id.
     *
     * @param providerPaymentChargeId the provider payment charge id
     * @return the provider payment charge id
     */
    public SuccessfulPayment setProviderPaymentChargeId(String providerPaymentChargeId) {
        this.providerPaymentChargeId = providerPaymentChargeId;
        return this;
    }
}
