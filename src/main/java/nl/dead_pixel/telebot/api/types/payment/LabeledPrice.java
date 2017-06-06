package nl.dead_pixel.telebot.api.types.payment;


/**
 * The type Labeled price.
 */
public class LabeledPrice {
    private String label;
    private Long amount;

    /**
     * Gets label.
     *
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets label.
     *
     * @param label the label
     * @return the label
     */
    private LabeledPrice setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * Sets amount.
     *
     * @param amount the amount
     * @return the amount
     */
    private LabeledPrice setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
}
