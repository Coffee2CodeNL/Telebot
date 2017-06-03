package nl.dead_pixel.telebot.api.types.keyboard.helpers;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.interfaces.IReplyMarkup;


/**
 * The type Force reply.
 */
public class ForceReply implements IReplyMarkup {
    @JsonProperty("force_reply")
    private Boolean forceReply = true;
    private Boolean selective;

    /**
     * Is force reply Boolean.
     *
     * @return the Boolean
     */
    public Boolean isForceReply() {
        return forceReply;
    }

    /**
     * Sets force reply.
     *
     * @param forceReply the force reply
     * @return the force reply
     */
    public ForceReply setForceReply(Boolean forceReply) {
        this.forceReply = forceReply;
        return this;
    }

    /**
     * Is selective Boolean.
     *
     * @return the Boolean
     */
    public Boolean isSelective() {
        return selective;
    }

    /**
     * Sets selective.
     *
     * @param selective the selective
     * @return the selective
     */
    public ForceReply setSelective(Boolean selective) {
        this.selective = selective;
        return this;
    }
}
