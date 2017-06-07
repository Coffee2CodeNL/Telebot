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
package nl.dead_pixel.telebot.api.types.misc;

/**
 * The type Telebot response.
 *
 * @param <T> the type parameter
 */
public class ApiResponse<T> {
    private Boolean ok;
    private T result;

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
    private ApiResponse setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }

    /**
     * Gets result.
     *
     * @return the result
     */
    public T getResult() {
        return result;
    }

    /**
     * Sets result.
     *
     * @param result the result
     * @return the result
     */
    private ApiResponse setResult(T result) {
        this.result = result;
        return this;
    }
}
