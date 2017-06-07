/**
 * Copyright (C) 2017 Remon Schopmeijer (79147FFF4E3C86DE) <support-telebot@dead-pixel.nl>
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nl.dead_pixel.telebot.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.schedulers.Schedulers;
import nl.dead_pixel.telebot.api.interfaces.IPlugin;
import nl.dead_pixel.telebot.api.interfaces.IUpdate;
import nl.dead_pixel.telebot.api.retrofit.TelegramBotApiService;
import nl.dead_pixel.telebot.api.types.helpers.ChannelPost;
import nl.dead_pixel.telebot.api.types.helpers.CommandMessage;
import nl.dead_pixel.telebot.api.types.helpers.EditedChannelPost;
import nl.dead_pixel.telebot.api.types.helpers.EditedMessage;
import nl.dead_pixel.telebot.api.types.misc.Update;
import nl.dead_pixel.telebot.api.types.misc.UpdateApiResponse;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * The main Telebot Class.
 */
public class Telebot {
    private static OkHttpClient HttpClient;
    private static ObjectMapper Mapper;
    private static Logger Logger;
    private static String Token;
    private static TelegramBotApiService ApiService;
    private static Observable<IUpdate> UpdateObservable;
    private static ExecutorService ThreadPool;

    private Telebot() {

    }

    /**
     * Initialize the API.
     * Run this before adding plugins.
     *
     * @param token      the token
     * @param threadpool The Thread Pool to use (do not use daemon threads!)
     */
    public static void init(String token, ExecutorService threadpool) {
        HttpClient = new OkHttpClient.Builder().readTimeout(60L, TimeUnit.SECONDS).build();
        Mapper = new ObjectMapper();
        Logger = LoggerFactory.getLogger(Telebot.class.getSimpleName());
        Token = token;
        ThreadPool = threadpool;
        Logger.info("Starting!");
    }

    /**
     * Creates the update observable.
     */
    private static void createObservable() {
        UpdateObservable = Observable.create((ObservableEmitter<IUpdate> emitter) -> {
            final Long[] updateId = new Long[1];
            Logger.info("Update Watcher is live.");
            while (true) {
                try {
                    if (updateId[0] == null) {
                        Request request = new Request.Builder().url("https://api.telegram.org/bot" + Token + "/getUpdates?timeout=60").build();
                        handleResponse(updateId, HttpClient.newCall(request).execute(), emitter);
                    } else {
                        Long offset = updateId[0] + 1;
                        Request request = new Request.Builder().url("https://api.telegram.org/bot" + Token + "/getUpdates?timeout=60&offset=" + offset).build();
                        Logger.debug("Update ID: " + updateId[0]);
                        handleResponse(updateId, HttpClient.newCall(request).execute(), emitter);
                    }
                } catch (SocketTimeoutException ex) {
                    // Just restart
                    Logger.debug("Timeout, restarting...");
                } catch (Exception ex) {
                    // Something else happened...
                    Logger.info("Exception occurred:", ex);
                }
            }
        })
                .share()
                .subscribeOn(Schedulers.from(ThreadPool))
                .onExceptionResumeNext(Observable.empty());
    }

    private static IUpdate determineType(Update update) {
        if (update.getEditedMessage() != null) {
            return new EditedMessage(update.getEditedMessage());
        } else if (update.getChannelPost() != null) {
            return new ChannelPost(update.getChannelPost());
        } else if (update.getEditedChannelPost() != null) {
            return new EditedChannelPost(update.getEditedChannelPost());
        } else if (update.getMessage() != null) {
            if (!update.getMessage().getEntities().isEmpty()) {
                return new CommandMessage(update.getMessage());
            } else {
                return update.getMessage();
            }
        } else if (update.getCallbackQuery() != null) {
            return update.getCallbackQuery();
        } else if (update.getInlineQuery() != null) {
            return update.getInlineQuery();
        } else if (update.getChosenInlineResult() != null) {
            return update.getChosenInlineResult();
        } else if (update.getPreCheckoutQuery() != null) {
            return update.getPreCheckoutQuery();
        } else if (update.getShippingQuery() != null) {
            return update.getShippingQuery();
        } else {
            throw new TypeNotPresentException("Could not Determine type", new Throwable("Unknown Type"));
        }
    }

    private static void handleResponse(Long[] updateId, Response response, ObservableEmitter<IUpdate> emitter) {
        if (response.isSuccessful()) {
            UpdateApiResponse updateApiResponse = null;
            try {
                updateApiResponse = Mapper.readValue(response.body().string(), UpdateApiResponse.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (!updateApiResponse.getUpdates().isEmpty()) {
                for (Update update : updateApiResponse.getUpdates()) {
                    updateId[0] = update.getUpdateId();
                    IUpdate parsedUpdate = determineType(update);
                    emitter.onNext(parsedUpdate);
                }
            }
        } else {
            Logger.info("Something happened!" + response.message());
        }
    }

    /**
     * Gets update observable.
     *
     * @return the update observable
     */
    public static Observable<IUpdate> getUpdateObservable() {
        if (UpdateObservable == null) {
            Logger.info("Update Observable wasn't created yet, creating now...");
            createObservable();
        }
        return UpdateObservable;
    }

    /**
     * Gets api service.
     *
     * @param enableHTTPLogging boolean to enable logging
     * @return the bot api service
     */
    public static TelegramBotApiService getApiService(Boolean enableHTTPLogging) {
        if (ApiService == null) {
            Logger.info("No instance of service yet. Building...");
            ObjectMapper objectMapper = new ObjectMapper().registerModule(new Jdk8Module());
            Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
                    .baseUrl("https://api.telegram.org/bot" + Token + "/")
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(JacksonConverterFactory.create(objectMapper));
            if (enableHTTPLogging) {
                Logger.info("Adding request logging...");
                HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
                httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
                OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
                httpClient.addInterceptor(httpLoggingInterceptor);
                retrofitBuilder.client(httpClient.build());
            }
            Retrofit retrofit = retrofitBuilder.build();
            ApiService = retrofit.create(TelegramBotApiService.class);
        }
        Logger.info("Returning ApiService instance.");
        return ApiService;
    }

    /**
     * Gets api service.
     *
     * @return the api service
     */
    public static TelegramBotApiService getApiService() {
        return getApiService(false);
    }

    /**
     * Gets logger.
     *
     * @param clazz the clazz
     * @return the logger
     */
    public static Logger getLogger(Class clazz) {
        return LoggerFactory.getLogger(clazz.getSimpleName());
    }

    /**
     * Plugin Subclass.
     */
    public static class Plugins {
        private List<IPlugin> PluginList = new ArrayList<>();

        /**
         * Add plugin.
         *
         * @param plugin the plugin
         * @return the plugins
         */
        public Plugins addPlugin(IPlugin plugin) {
            Logger.debug("Adding " + plugin.getClass().getSimpleName().replace("Plugin", "") + " plugin");
            PluginList.add(plugin);
            return this;
        }

        /**
         * Activate plugins.
         */
        public void activatePlugins() {
            for (IPlugin plugin : PluginList) {
                Logger.info("Activating " + plugin.getClass().getSimpleName().replace("Plugin", "") + " plugin");
                plugin.subscribe();
            }
        }
    }
}
