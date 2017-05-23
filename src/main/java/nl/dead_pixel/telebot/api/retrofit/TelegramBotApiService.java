package nl.dead_pixel.telebot.api.retrofit;

import io.reactivex.Single;
import nl.dead_pixel.telebot.api.retrofit.response_bodies.ChatIdResponse;
import nl.dead_pixel.telebot.api.types.chat.Chat;
import nl.dead_pixel.telebot.api.types.chat.User;
import retrofit2.http.Body;
import retrofit2.http.GET;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public interface TelegramBotApiService {
    @GET("getMe")
    Single<User> getMe();

    @GET("getChat")
    Single<Chat> getChat(@Body ChatIdResponse chatIdResponse);
}
