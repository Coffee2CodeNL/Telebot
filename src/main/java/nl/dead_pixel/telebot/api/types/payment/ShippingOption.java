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
package nl.dead_pixel.telebot.api.types.payment;

import java.util.List;


/**
 * The type Shipping option.
 */
public class ShippingOption {
    private String id;
    private String title;
    private List<LabeledPrice> prices;

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     * @return the id
     */
    private ShippingOption setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     * @return the title
     */
    private ShippingOption setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Gets prices.
     *
     * @return the prices
     */
    public List<LabeledPrice> getPrices() {
        return prices;
    }

    /**
     * Sets prices.
     *
     * @param prices the prices
     * @return the prices
     */
    private ShippingOption setPrices(List<LabeledPrice> prices) {
        this.prices = prices;
        return this;
    }
}
