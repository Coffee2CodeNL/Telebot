package nl.dead_pixel.telebot.api.types.keyboard.helpers;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.interfaces.IReplyMarkup;


/**
 * The type Force reply.
 */
public class ForceReply implements IReplyMarkup {
    @JsonProperty("force_reply")
    private boolean forceReply = true;
    private boolean selective;

    /**
     * Is force reply boolean.
     *
     * @return the boolean
     */
    public boolean isForceReply() {
        return forceReply;
    }

    /**
     * Sets force reply.
     *
     * @param forceReply the force reply
     * @return the force reply
     */
    public ForceReply setForceReply(boolean forceReply) {
        this.forceReply = forceReply;
        return this;
    }

    /**
     * Is selective boolean.
     *
     * @return the boolean
     */
    public boolean isSelective() {
        return selective;
    }

    /**
     * Sets selective.
     *
     * @param selective the selective
     * @return the selective
     */
    public ForceReply setSelective(boolean selective) {
        this.selective = selective;
        return this;
    }
}
