package nl.dead_pixel.telebot.api.types.misc;

import nl.dead_pixel.telebot.api.interfaces.IResponseType;


/**
 * The type Api response.
 *
 * @param <T> the type parameter
 */
public class ApiResponse<T> {
    private Boolean ok;
    private T result;
}
