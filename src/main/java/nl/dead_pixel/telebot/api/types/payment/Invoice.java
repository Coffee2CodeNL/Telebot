package nl.dead_pixel.telebot.api.types.payment;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class Invoice {
    private String title;
    private String description;
    @JsonProperty("start_parameter")
    private String startParameter;
    private String currency;
    @JsonProperty("total_amount")
    private int totalAmount;

    public String getTitle() {
        return title;
    }

    public Invoice setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Invoice setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getStartParameter() {
        return startParameter;
    }

    public Invoice setStartParameter(String startParameter) {
        this.startParameter = startParameter;
        return this;
    }

    public String getCurrency() {
        return currency;
    }

    public Invoice setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public Invoice setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
}
