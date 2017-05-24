package nl.dead_pixel.telebot.api.retrofit;

import io.reactivex.Single;
import nl.dead_pixel.telebot.api.retrofit.request_bodies.*;
import nl.dead_pixel.telebot.api.types.chat.*;
import nl.dead_pixel.telebot.api.types.misc.ApiResponse;
import retrofit2.http.Body;
import retrofit2.http.POST;

import java.util.List;


/**
 * Retrofit Interface outlining the Telegram Bot API's endpoints.
 *
 * @since 2017 -05-23 11:40 CET
 */
public interface TelegramBotApiService {

    /////////////////////////////////////////
    //// Miscellaneous         Endpoints ////
    /////////////////////////////////////////

    /**
     * A simple method for testing the bot's auth token.
     * Requires no parameters.
     * Returns basic information about the bot in form of a {@link User} object.
     *
     * @return {@link Single} Observable which will emit an {@link ApiResponse} object which wraps a {@link User} object
     */
    @POST("getMe")
    Single<ApiResponse<User>> getMe();

    /////////////////////////////////////////
    //// Administrative        Endpoints ////
    /////////////////////////////////////////

    /**
     * Use this method to kick a user from a group or a supergroup.
     * In the case of supergroups, the user will not be able to return to the group on their own using invite links, etc., unless unbanned first.
     * The bot must be an administrator in the group for this to work.
     * Returns a {@link Single} Observable which will emit an {@link ApiResponse} object which wraps a {@link Boolean}
     *
     * @param chatIdUserIdRequest a {@link ChatIdUserIdRequest} object, built with the {@link ChatIdUserIdRequest.Builder#create()} method
     * @return {@link Single} Observable which will emit an {@link ApiResponse} object which wraps a {@link Boolean}
     */
    @POST("kickChatMember")
    Single<ApiResponse<Boolean>> kickChatMember(@Body ChatIdUserIdRequest chatIdUserIdRequest);

    /**
     * Use this method to unban a previously kicked user in a supergroup or channel.
     * The user will not return to the group or channel automatically, but will be able to join via link, etc.
     * The bot must be an administrator for this to work.
     * Returns a {@link Single} Observable which will emit an {@link ApiResponse} object which wraps a {@link Boolean}
     *
     * @param chatIdUserIdRequest a {@link ChatIdUserIdRequest} object, built with the {@link ChatIdUserIdRequest.Builder#create()} method
     * @return {@link Single} Observable which will emit an {@link ApiResponse} object which wraps a {@link Boolean}
     */
    @POST("unbanChatMember")
    Single<ApiResponse<Boolean>> unbanChatMember(@Body ChatIdUserIdRequest chatIdUserIdRequest);

    /**
     * Use this method to delete a message.
     * A message can only be deleted if it was sent less than 48 hours ago.
     * Any such recently sent outgoing message may be deleted.
     * Additionally, if the bot is an administrator in a group chat, it can delete any message.
     * If the bot is an administrator in a supergroup, it can delete messages from any other user and service messages about people joining or leaving the group (other types of service messages may only be removed by the group creator).
     * In channels, bots can only remove their own messages.
     * Returns a {@link Single} Observable which will emit an {@link ApiResponse} object which wraps a {@link Boolean}
     *
     * @param chatIdMessageIdRequest a {@link ChatIdMessageIdRequest} object, built with the {@link ChatIdMessageIdRequest.Builder#create()} method
     * @return {@link Single} Observable which will emit an {@link ApiResponse} object which wraps a {@link Boolean}
     */
    @POST("deleteMessage")
    Single<ApiResponse<Boolean>> deleteMessage(@Body ChatIdMessageIdRequest chatIdMessageIdRequest);

    /////////////////////////////////////////
    //// Message Updating      Endpoints ////
    /////////////////////////////////////////



    /////////////////////////////////////////
    //// Chat Information      Endpoints ////
    /////////////////////////////////////////

    /**
     * Use this method to get up to date information about the chat (current name of the user for one-on-one conversations, current username of a user, group or channel, etc.).
     * Returns a {@link Chat} object on success.
     *
     * @param chatIdRequest a {@link ChatIdRequest} object
     * @return {@link Single} Observable which will emit an {@link ApiResponse} object which wraps a {@link Chat} object
     */
    @POST("getChat")
    Single<ApiResponse<Chat>> getChat(@Body ChatIdRequest chatIdRequest);

    /**
     * Use this method to get a list of administrators in a chat.
     * On success, returns an Array of ChatMember objects that contains information about all chat administrators except other bots.
     * If the chat is a group or a supergroup and no administrators were appointed, only the creator will be returned.
     *
     * @param chatIdRequest a {@link ChatIdRequest} object
     * @return {@link Single} Observable which will emit an {@link ApiResponse} object which wraps a {@link List} containing {@link ChatMember} objects.
     */
    @POST("getChatAdministrators")
    Single<ApiResponse<List<ChatMember>>> getChatAdministrators(@Body ChatIdRequest chatIdRequest);
    // TODO: See if this method needs fixing

    /**
     * Use this method to get the number of members in a chat.
     * Returns a {@link Long} object on success.
     *
     * @param chatIdRequest a {@link ChatIdRequest} object
     * @return {@link Single} Observable which will emit an {@link ApiResponse} object which wraps a {@link Long} object
     */
    @POST("getChatMembersCount")
    Single<ApiResponse<Long>> getChatMembersCount(@Body ChatIdRequest chatIdRequest);

    /**
     * Use this method to get information about a member of a chat.
     * Returns a {@link ChatMember} object on success.
     *
     * @param chatIdUserIdRequest a {@link ChatIdUserIdRequest} object, built with the {@link ChatIdUserIdRequest.Builder#create()} method
     * @return {@link Single} Observable which will emit an {@link ApiResponse} object which wraps a {@link ChatMember} object
     */
    @POST("getChatMember")
    Single<ApiResponse<ChatMember>> getChatMember(@Body ChatIdUserIdRequest chatIdUserIdRequest);

    /////////////////////////////////////////
    //// User Information      Endpoints ////
    /////////////////////////////////////////

    /**
     * Use this method to get a list of profile pictures for a user.
     * Returns a UserProfilePhotos object.
     *
     * @param userProfilePhotosRequest a {@link UserProfilePhotosRequest} object generated with {@link UserProfilePhotosRequest.Builder#create()}  }
     * @return {@link Single } Observable which will emit an {@link ApiResponse } containing a {@link UserProfilePhotos } object
     */
    @POST("getUserProfilePhotos")
    Single<ApiResponse<UserProfilePhotos>> getUserProfilePhotos(@Body UserProfilePhotosRequest userProfilePhotosRequest);

    /////////////////////////////////////////
    //// Sending               Endpoints ////
    /////////////////////////////////////////

    /**
     * Use this method to send text messages.
     * On success, the sent {@link Message} is returned.
     *
     * @param messageRequest a {@link MessageRequest} object
     * @return On Success, returns a {@link Single} Observable which will emit an {@link ApiResponse} object which wraps the sent {@link Message} object
     */
    @POST("sendMessage")
    Single<ApiResponse<Message>> sendMessage(@Body MessageRequest messageRequest);
}
