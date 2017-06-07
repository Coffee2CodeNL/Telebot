/**
 *    Copyright (C) 2017 Remon Schopmeijer (7914 7FFF 4E3C 86DE) <support-telebot@dead-pixel.nl>
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package nl.dead_pixel.telebot.retrofit;

import io.reactivex.Single;
import nl.dead_pixel.telebot.retrofit.answer_bodies.CallbackQueryAnswer;
import nl.dead_pixel.telebot.retrofit.answer_bodies.InlineQueryAnswer;
import nl.dead_pixel.telebot.retrofit.request_bodies.*;
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

    /**
     * Send chat action single.
     *
     * @return the single
     */
    @POST("sendChatAction")
    Single<ApiResponse<Message>> sendChatAction();

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

    /**
     * Use this method to edit text and game messages sent by the bot or via the bot (for inline bots).
     * On success, if edited message is sent by the bot, the edited Message is returned, otherwise True is returned.
     *
     * @param messageRequest a {@link MessageRequest} object
     * @return {@link Single} Observable which will emit an {@link ApiResponse} object which wraps a {@link Object}
     */
    @POST("editMessageText")
    Single<ApiResponse<Object>> editMessageText(@Body MessageRequest messageRequest);


    /**
     * Edit message caption single.
     *
     * @return the single
     */
    @POST("editMessageCaption")
    Single<ApiResponse<Object>> editMessageCaption();

    /**
     * Edit message reply markup single.
     *
     * @return the single
     */
    @POST("editMessageReplyMarkup")
    Single<ApiResponse<Object>> editMessageReplyMarkup();

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
     * @param userProfilePhotosRequest a {@link UserProfilePhotosRequest} object generated with {@link UserProfilePhotosRequest.Builder#create()}
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
     * <p>
     * For formatting options see: <a href="https://core.telegram.org/bots/api#formatting-options">https://core.telegram.org/bots/api#formatting-options</a>
     *
     * @param messageRequest a {@link MessageRequest} object
     * @return On Success, returns a {@link Single} Observable which will emit an {@link ApiResponse} object which wraps the sent {@link Message} object
     */
    @POST("sendMessage")
    Single<ApiResponse<Message>> sendMessage(@Body MessageRequest messageRequest);

    /**
     * Use this method to forward messages of any kind.
     * On success, the sent Message is returned.
     *
     * @param forwardRequest a {@link ForwardRequest} object
     * @return On Success, returns a {@link Single} Observable which will emit an {@link ApiResponse} object which wraps the sent {@link Message} object
     */
    @POST("forwardMessage")
    Single<ApiResponse<Message>> forwardMessage(@Body ForwardRequest forwardRequest);

    /**
     * Send photo single.
     *
     * @return the single
     */
    @POST("sendPhoto")
    Single<ApiResponse<Message>> sendPhoto();

    /**
     * Send audio single.
     *
     * @return the single
     */
    @POST("sendAudio")
    Single<ApiResponse<Message>> sendAudio();

    /**
     * Send document single.
     *
     * @return the single
     */
    @POST("sendDocument")
    Single<ApiResponse<Message>> sendDocument();

    /**
     * Send sticker single.
     *
     * @return the single
     */
    @POST("sendSticker")
    Single<ApiResponse<Message>> sendSticker();

    /**
     * Send video single.
     *
     * @return the single
     */
    @POST("sendVideo")
    Single<ApiResponse<Message>> sendVideo();

    /**
     * Send voice single.
     *
     * @return the single
     */
    @POST("sendVoice")
    Single<ApiResponse<Message>> sendVoice();

    /**
     * Send video note single.
     *
     * @return the single
     */
    @POST("sendVideoNote")
    Single<ApiResponse<Message>> sendVideoNote();

    /**
     * Send location single.
     *
     * @return the single
     */
    @POST("sendLocation")
    Single<ApiResponse<Message>> sendLocation();

    /**
     * Send venue single.
     *
     * @return the single
     */
    @POST("sendVenue")
    Single<ApiResponse<Message>> sendVenue();

    /**
     * Send contact single.
     *
     * @return the single
     */
    @POST("sendContact")
    Single<ApiResponse<Message>> sendContact();

    /////////////////////////////////////////
    //// Maintenance           Endpoints ////
    /////////////////////////////////////////

    /**
     * Leave chat single.
     *
     * @param chatIdRequest the chat id request
     * @return the single
     */
    @POST("leaveChat")
    Single<ApiResponse<Boolean>> leaveChat(@Body ChatIdRequest chatIdRequest);

    /////////////////////////////////////////
    //// Keyboard Callback     Endpoints ////
    /////////////////////////////////////////

    /**
     * Answer callback query single.
     *
     * @param callbackQueryAnswer the callback query answer
     * @return the single
     */
    @POST("answerCallbackQuery")
    Single<ApiResponse<Boolean>> answerCallbackQuery(@Body CallbackQueryAnswer callbackQueryAnswer);

    /////////////////////////////////////////
    //// Inline Mode           Endpoints ////
    /////////////////////////////////////////

    /**
     * Answer inline query single.
     *
     * @param inlineQueryAnswer the inline query answer
     * @return the single
     */
    @POST("answerInlineQuery")
    Single<ApiResponse<Boolean>> answerInlineQuery(@Body InlineQueryAnswer inlineQueryAnswer);


}
