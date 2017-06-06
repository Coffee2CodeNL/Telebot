/**
 *    Copyright (C) 2017 Remon Schopmeijer (79147FFF4E3C86DE) <support-telebot@dead-pixel.nl>
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

    /**
     * @param builder Builder instance, passed in the {@link Builder#create()} method
     */
    private UserProfilePhotosRequest(Builder builder) {
        this.userId = builder.userId;
        this.offset = builder.offset.map(s -> builder.offset.get());
        this.limit = builder.limit.map(s -> builder.limit.get());
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
            this.offset = Optional.of(offset);
            return this;
        }

        /**
         * Sets limit.
         *
         * @param limit the limit
         * @return the limit
         */
        public Builder setLimit(Float limit) {
            this.limit = Optional.of(limit);
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
