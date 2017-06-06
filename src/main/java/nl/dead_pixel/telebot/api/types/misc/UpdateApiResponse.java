/**
 *    Copyright 2017 Remon Schopmeijer (49CDB43A4FB4D8AFF5361E8C79147FFF4E3C86DE) <support-telebot@dead-pixel.nl>
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
package nl.dead_pixel.telebot.api.types.misc;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Update API response.
 *
 */
public class UpdateApiResponse {
    @JsonProperty("ok")
    private Boolean ok;
    @JsonProperty("result")
    private List<Update> updates = new ArrayList<>();

    /**
     * Gets ok.
     *
     * @return the ok
     */
    public Boolean getOk() {
        return ok;
    }

    /**
     * Sets ok.
     *
     * @param ok the ok
     * @return the ok
     */
    private UpdateApiResponse setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }

    /**
     * Gets result.
     *
     * @return the result
     */
    public List<Update> getUpdates() {
        return updates;
    }

    /**
     * Sets result.
     *
     * @param result the result
     * @return the result
     */
    private UpdateApiResponse setUpdates(List<Update> updates) {
        this.updates = updates;
        return this;
    }
}
