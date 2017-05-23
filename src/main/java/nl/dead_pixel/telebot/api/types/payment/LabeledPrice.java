package nl.dead_pixel.telebot.api.types.payment;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class LabeledPrice {
    private String label;
    private int amount;

    public String getLabel() {
        return label;
    }

    public LabeledPrice setLabel(String label) {
        this.label = label;
        return this;
    }

    public int getAmount() {
        return amount;
    }

    public LabeledPrice setAmount(int amount) {
        this.amount = amount;
        return this;
    }
}
