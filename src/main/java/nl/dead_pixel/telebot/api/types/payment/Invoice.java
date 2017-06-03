package nl.dead_pixel.telebot.api.types.payment;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The type Invoice.
 */
public class Invoice {
    private String title;
    private String description;
    @JsonProperty("start_parameter")
    private String startParameter;
    private String currency;
    @JsonProperty("total_amount")
    private Long totalAmount;

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     * @return the title
     */
    public Invoice setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     * @return the description
     */
    public Invoice setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Gets start parameter.
     *
     * @return the start parameter
     */
    public String getStartParameter() {
        return startParameter;
    }

    /**
     * Sets start parameter.
     *
     * @param startParameter the start parameter
     * @return the start parameter
     */
    public Invoice setStartParameter(String startParameter) {
        this.startParameter = startParameter;
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
    public Invoice setCurrency(String currency) {
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
    public Invoice setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
}
