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
package nl.dead_pixel.telebot.api.types.payment;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The type Invoice.
 */
public class Invoice {
    private String title;
    private String description;
    @JsonProperty("start_parameter")
    private String startParameter;
    private String currency;
    @JsonProperty("total_amount")
    private Long totalAmount;

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
    private Invoice setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Gets description.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets description.
     *
     * @param description the description
     * @return the description
     */
    private Invoice setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Gets start parameter.
     *
     * @return the start parameter
     */
    public String getStartParameter() {
        return startParameter;
    }

    /**
     * Sets start parameter.
     *
     * @param startParameter the start parameter
     * @return the start parameter
     */
    private Invoice setStartParameter(String startParameter) {
        this.startParameter = startParameter;
        return this;
    }

    /**
     * Gets currency.
     *
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets currency.
     *
     * @param currency the currency
     * @return the currency
     */
    private Invoice setCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Gets total amount.
     *
     * @return the total amount
     */
    public Long getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     * @return the total amount
     */
    private Invoice setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }
}
