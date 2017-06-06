package nl.dead_pixel.telebot.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.schedulers.Schedulers;
import nl.dead_pixel.telebot.api.interfaces.IPlugin;
import nl.dead_pixel.telebot.api.retrofit.TelegramBotApiService;
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

import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * The type Api.
 *
 * @author ReSco
 * @since 10 :50 22-5-2017
 */
public class Api {
    private static OkHttpClient HttpClient;
    private static ObjectMapper Mapper;
    private static Logger Logger;
    private static String Token;
    private static TelegramBotApiService ApiService;
    private static Observable<Update> UpdateObservable;
    private static List<IPlugin> Plugins;
    private static ExecutorService ThreadPool;

    private Api() {

    }

    /**
     * Initialize the API.
     *
     * @param token the token
     */
    public static void init(String token, ExecutorService threadpool) {
        HttpClient = new OkHttpClient.Builder().readTimeout(60L, TimeUnit.SECONDS).build();
        Mapper = new ObjectMapper();
        Logger = LoggerFactory.getLogger(Api.class.getSimpleName());
        Token = token;
        Plugins = new ArrayList<IPlugin>();
        ThreadPool = threadpool;
        Logger.info("Starting!");
    }

    /**
     * Creates the update observable.
     */
    private static void createObservable() {
        UpdateObservable = Observable.create((ObservableEmitter<Update> emitter) -> {
            final Long[] updateId = new Long[1];
            Logger.info("Update Watcher is live. Update ID is: " + updateId[0]);
            while (true) {
                try {
                    Response response;
                    UpdateApiResponse updateApiResponse;
                    if (updateId[0] == null) {
                        Request request = new Request.Builder().url("https://api.telegram.org/bot" + Token + "/getUpdates?timeout=60").build();
                        //Logger.info("Making first call...");
                        response = HttpClient.newCall(request).execute();
                        if (response.isSuccessful()) {
                            updateApiResponse = Mapper.readValue(response.body().string(), UpdateApiResponse.class);
                            for (Update update : updateApiResponse.getUpdates()) {
                                updateId[0] = update.getUpdateId();
                                emitter.onNext(update);
                            }
                        } else {
                            Logger.info("Something happened!" + response.body().string());
                        }
                    } else {
                        Long offset = updateId[0] + 1;
                        Request request = new Request.Builder().url("https://api.telegram.org/bot" + Token + "/getUpdates?timeout=60&offset=" + offset).build();
                        //Logger.info("Restarting call with offset " + offset);
                        response = HttpClient.newCall(request).execute();
                        if (response.isSuccessful()) {
                            updateApiResponse = Mapper.readValue(response.body().string(), UpdateApiResponse.class);
                            for (Update update : updateApiResponse.getUpdates()) {
                                updateId[0] = update.getUpdateId();
                                emitter.onNext(update);
                            }
                        } else {
                            Logger.info("Something happened!" + response.message());
                        }
                    }
                } catch (SocketTimeoutException ex) {
                    // Just restart
                    Logger.debug("Timeout, restarting...");
                } catch (Exception ex) {
                    // Something else happened...
                    Logger.info("Exception occurred:", ex);
                }
            }
        }).share().subscribeOn(Schedulers.from(ThreadPool)).onExceptionResumeNext(Observable.empty());
    }

    /**
     * Gets update observable.
     *
     * @return the update observable
     */
    public static Observable<Update> getUpdateObservable() {
        if(UpdateObservable == null) {
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
        if(ApiService == null) {
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
            Logger.info("Returning the service.");
            return ApiService;
        }
        else {
            Logger.info("Instance found, returning!");
            return ApiService;
        }
    }

    public static void addPlugin(IPlugin plugin) {
        Plugins.add(plugin);
    }

    public static void activatePlugins() {
        for(IPlugin plugin : Plugins) {
            Logger.info("Hooking plugin " + plugin.getClass().getSimpleName());
            plugin.subscribe();
        }
    }
}
