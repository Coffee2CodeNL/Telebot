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
package nl.dead_pixel.telebot.api.types.chat;


/**
 * The type Location.
 */
public class Location {
    private Float longitude;
    private Float latitude;

    /**
     * Gets longitude.
     *
     * @return the longitude
     */
    public Float getLongitude() {
        return longitude;
    }

    /**
     * Sets longitude.
     *
     * @param longitude the longitude
     * @return the longitude
     */
    private Location setLongitude(Float longitude) {
        this.longitude = longitude;
        return this;
    }

    /**
     * Gets latitude.
     *
     * @return the latitude
     */
    public Float getLatitude() {
        return latitude;
    }

    /**
     * Sets latitude.
     *
     * @param latitude the latitude
     * @return the latitude
     */
    private Location setLatitude(Float latitude) {
        this.latitude = latitude;
        return this;
    }
}
