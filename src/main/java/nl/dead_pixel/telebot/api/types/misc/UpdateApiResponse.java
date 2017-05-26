package nl.dead_pixel.telebot.api.types.misc;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * The type Update API response.
 *
 */
public class UpdateApiResponse {
    @JsonProperty("ok")
    private Boolean ok;
    @JsonProperty("result")
    private List<Update> updates;

    /**
     * Gets ok.
     *
     * @return the ok
     */
    public Boolean getOk() {
        return ok;
    }

    /**
     * Sets ok.
     *
     * @param ok the ok
     * @return the ok
     */
    public UpdateApiResponse setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }

    /**
     * Gets result.
     *
     * @return the result
     */
    public List<Update> getUpdates() {
        return updates;
    }

    /**
     * Sets result.
     *
     * @param result the result
     * @return the result
     */
    public UpdateApiResponse setUpdates(List<Update> updates) {
        this.updates = updates;
        return this;
    }
}
