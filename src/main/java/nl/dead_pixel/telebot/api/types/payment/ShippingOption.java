package nl.dead_pixel.telebot.api.types.payment;

import java.util.List;


/**
 * The type Shipping option.
 */
public class ShippingOption {
    private String id;
    private String title;
    private List<LabeledPrice> prices;

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
    public ShippingOption setId(String id) {
        this.id = id;
        return this;
    }

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
    public ShippingOption setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Gets prices.
     *
     * @return the prices
     */
    public List<LabeledPrice> getPrices() {
        return prices;
    }

    /**
     * Sets prices.
     *
     * @param prices the prices
     * @return the prices
     */
    public ShippingOption setPrices(List<LabeledPrice> prices) {
        this.prices = prices;
        return this;
    }
}
