package nl.dead_pixel.telebot.api.types.misc;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class ResponseParameters {
    @JsonProperty("migrate_to_chat_id")
    private long migrateToChatId;
    @JsonProperty("retry_after")
    private int retryAfter;

    public long getMigrateToChatId() {
        return migrateToChatId;
    }

    public ResponseParameters setMigrateToChatId(long migrateToChatId) {
        this.migrateToChatId = migrateToChatId;
        return this;
    }

    public int getRetryAfter() {
        return retryAfter;
    }

    public ResponseParameters setRetryAfter(int retryAfter) {
        this.retryAfter = retryAfter;
        return this;
    }
}
