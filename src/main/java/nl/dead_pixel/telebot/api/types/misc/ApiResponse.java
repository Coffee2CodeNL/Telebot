package nl.dead_pixel.telebot.api.types.misc;

/**
 * The type Api response.
 *
 * @param <T> the type parameter
 */
public class ApiResponse<T> {
    private Boolean ok;
    private T result;

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
    private ApiResponse setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }

    /**
     * Gets result.
     *
     * @return the result
     */
    public T getResult() {
        return result;
    }

    /**
     * Sets result.
     *
     * @param result the result
     * @return the result
     */
    private ApiResponse setResult(T result) {
        this.result = result;
        return this;
    }
}
