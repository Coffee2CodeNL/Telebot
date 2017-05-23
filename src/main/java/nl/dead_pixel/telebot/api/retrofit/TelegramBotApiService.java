package nl.dead_pixel.telebot.api.retrofit;

import io.reactivex.Single;
import nl.dead_pixel.telebot.api.retrofit.response_bodies.ChatIdRequest;
import nl.dead_pixel.telebot.api.retrofit.response_bodies.ChatIdUserIdRequest;
import nl.dead_pixel.telebot.api.types.chat.Chat;
import nl.dead_pixel.telebot.api.types.chat.ChatMember;
import nl.dead_pixel.telebot.api.types.chat.User;
import retrofit2.http.Body;
import retrofit2.http.GET;

import java.util.List;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public interface TelegramBotApiService {
    /*
    Getters!
     */
    @GET("getMe")
    Single<User> getMe();

    @GET("getChat")
    Single<Chat> getChat(@Body ChatIdRequest chatIdRequest);

    @GET("getChatAdministrators")
    Single<List<ChatMember>> getChatAdministrators(@Body ChatIdRequest chatIdRequest);

    @GET("getChatMembersCount")
    Single<Integer> getChatMembersCount(@Body ChatIdRequest chatIdRequest);

    @GET("getChatMember")
    Single<ChatMember> getChatMember(@Body ChatIdUserIdRequest chatIdUserIdRequest);
}
