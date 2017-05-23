package nl.dead_pixel.telebot.api.retrofit.response_bodies;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Optional;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ChatIdResponse {
    private Optional<Long> uniqueId = Optional.empty();
    private Optional<String> channelUsername = Optional.empty();

    public ChatIdResponse(long uniqueId) {
        this.uniqueId = Optional.of(uniqueId);
    }

    public ChatIdResponse(String channelUsername) {
        this.channelUsername = Optional.of(channelUsername);
    }
}
