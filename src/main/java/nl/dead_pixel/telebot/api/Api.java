package nl.dead_pixel.telebot.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.schedulers.Schedulers;
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
import java.util.concurrent.TimeUnit;

/**
 * The type Api.
 *
 * @author ReSco
 * @since 10 :50 22-5-2017
 */
public class Api {
    private static OkHttpClient mHttpClient;
    private static ObjectMapper mMapper;
    private static Logger mLogger;
    private static String mToken;
    private static TelegramBotApiService mApiService;

    private Api() {

    }

    /**
     * Initialize the API.
     *
     * @param token the token
     */
    public static void init(String token) {
        mHttpClient = new OkHttpClient.Builder().readTimeout(60L, TimeUnit.SECONDS).build();
        mMapper = new ObjectMapper();
        mLogger = LoggerFactory.getLogger(Api.class.getSimpleName());
        mToken = token;
        mLogger.info("Starting!");
    }

    /**
     * Gets the update observable.
     *
     * @return the update observable
     */
    public static Observable<Update> getUpdateObservable() {
        return Observable.create((ObservableEmitter<Update> emitter) -> {
            final Long[] updateId = new Long[1];
            mLogger.info("Update Watcher is live. Update ID is: " + updateId[0]);
            while (true) {
                try {
                    Response response;
                    UpdateApiResponse updateApiResponse;
                    if (updateId[0] == null) {
                        Request request = new Request.Builder().url("https://api.telegram.org/bot" + mToken + "/getUpdates?timeout=60").build();
                        //mLogger.info("Making first call...");
                        response = mHttpClient.newCall(request).execute();
                        if (response.isSuccessful()) {
                            updateApiResponse = mMapper.readValue(response.body().string(), UpdateApiResponse.class);
                            for (Update update : updateApiResponse.getUpdates()) {
                                updateId[0] = update.getUpdateId();
                                emitter.onNext(update);
                            }
                        } else {
                            mLogger.info("Something happened!" + response.body().string());
                        }
                    } else {
                        Long offset = updateId[0] + 1;
                        Request request = new Request.Builder().url("https://api.telegram.org/bot" + mToken + "/getUpdates?timeout=60&offset=" + offset).build();
                        //mLogger.info("Restarting call with offset " + offset);
                        response = mHttpClient.newCall(request).execute();
                        if (response.isSuccessful()) {
                            updateApiResponse = mMapper.readValue(response.body().string(), UpdateApiResponse.class);
                            for (Update update : updateApiResponse.getUpdates()) {
                                updateId[0] = update.getUpdateId();
                                emitter.onNext(update);
                            }
                        } else {
                            mLogger.info("Something happened!" + response.message());
                        }
                    }
                } catch (SocketTimeoutException ex) {
                    // Just restart
                    mLogger.debug("Timeout, restarting...");
                } catch (Exception ex) {
                    // Something else happened...
                    mLogger.info("Exception occurred:", ex);
                }
            }
        }).observeOn(Schedulers.computation()).onExceptionResumeNext(Observable.empty());
    }

    /**
     * Gets api service.
     *
     * @param enableHTTPLogging boolean to enable logging
     * @return the bot api service
     */
    public static TelegramBotApiService getApiService(Boolean enableHTTPLogging) {
        if(mApiService == null) {
            mLogger.info("No instance of service yet. Building...");
            ObjectMapper objectMapper = new ObjectMapper().registerModule(new Jdk8Module());
            Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
                    .baseUrl("https://api.telegram.org/bot" + mToken + "/")
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(JacksonConverterFactory.create(objectMapper));
            if (enableHTTPLogging) {
                mLogger.info("Adding request logging...");
                HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
                httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
                OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
                httpClient.addInterceptor(httpLoggingInterceptor);
                retrofitBuilder.client(httpClient.build());
            }
            Retrofit retrofit = retrofitBuilder.build();
            mApiService = retrofit.create(TelegramBotApiService.class);
            mLogger.info("Returning the service.");
            return mApiService;
        }
        else {
            mLogger.info("Instance found, returning!");
            return mApiService;
        }
    }
}
