package nl.dead_pixel.telebot.api.types.payment;

import java.util.List;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class ShippingOption {
    private String id;
    private String title;
    private List<LabeledPrice> prices;

    public String getId() {
        return id;
    }

    public ShippingOption setId(String id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ShippingOption setTitle(String title) {
        this.title = title;
        return this;
    }

    public List<LabeledPrice> getPrices() {
        return prices;
    }

    public ShippingOption setPrices(List<LabeledPrice> prices) {
        this.prices = prices;
        return this;
    }
}
