package nl.dead_pixel.telebot.api.types.keyboard.helpers;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class ForceReply {
    @JsonProperty("force_reply")
    private boolean forceReply = true;
    private boolean selective;

    public boolean isForceReply() {
        return forceReply;
    }

    public ForceReply setForceReply(boolean forceReply) {
        this.forceReply = forceReply;
        return this;
    }

    public boolean isSelective() {
        return selective;
    }

    public ForceReply setSelective(boolean selective) {
        this.selective = selective;
        return this;
    }
}
