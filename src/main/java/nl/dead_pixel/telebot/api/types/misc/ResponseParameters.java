package nl.dead_pixel.telebot.api.types.misc;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The type Response parameters.
 */
public class ResponseParameters {
    @JsonProperty("migrate_to_chat_id")
    private Long migrateToChatId;
    @JsonProperty("retry_after")
    private Long retryAfter;

    /**
     * Gets migrate to chat id.
     *
     * @return the migrate to chat id
     */
    public Long getMigrateToChatId() {
        return migrateToChatId;
    }

    /**
     * Sets migrate to chat id.
     *
     * @param migrateToChatId the migrate to chat id
     * @return the migrate to chat id
     */
    private ResponseParameters setMigrateToChatId(Long migrateToChatId) {
        this.migrateToChatId = migrateToChatId;
        return this;
    }

    /**
     * Gets retry after.
     *
     * @return the retry after
     */
    public Long getRetryAfter() {
        return retryAfter;
    }

    /**
     * Sets retry after.
     *
     * @param retryAfter the retry after
     * @return the retry after
     */
    private ResponseParameters setRetryAfter(Long retryAfter) {
        this.retryAfter = retryAfter;
        return this;
    }
}
