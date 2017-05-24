package nl.dead_pixel.telebot.api.retrofit.request_bodies;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import java.util.Optional;


/**
 * The type User profile photos request.
 */
@JsonDeserialize(builder = UserProfilePhotosRequest.Builder.class)
public class UserProfilePhotosRequest {
    @JsonProperty("user_id")
    final private Float userId;
    final private Optional<Float> offset;
    final private Optional<Float> limit;

    private UserProfilePhotosRequest(Builder builder) {
        this.userId = builder.userId;
        this.offset = builder.offset.map(s -> builder.offset.get());
        this.limit  = builder.limit.map(s -> builder.limit.get());
    }

    /**
     * The type Builder.
     */
    @JsonPOJOBuilder(buildMethodName = "create", withPrefix = "set")
    public static class Builder {
        private Float userId;
        private Optional<Float> offset;
        private Optional<Float> limit;

        /**
         * Instantiates a new Builder.
         *
         * @param userId the user id
         */
        public Builder(Float userId) {
            this.userId = userId;
        }

        /**
         * Sets offset.
         *
         * @param offset the offset
         * @return the offset
         */
        public Builder setOffset(Float offset) {
            this.offset = Optional.ofNullable(offset);
            return this;
        }

        /**
         * Sets limit.
         *
         * @param limit the limit
         * @return the limit
         */
        public Builder setLimit(Float limit) {
            this.limit = Optional.ofNullable(limit);
            return this;
        }

        /**
         * Create user profile photos request.
         *
         * @return the user profile photos request
         */
        public UserProfilePhotosRequest create() {
            return new UserProfilePhotosRequest(this);
        }
    }
}
