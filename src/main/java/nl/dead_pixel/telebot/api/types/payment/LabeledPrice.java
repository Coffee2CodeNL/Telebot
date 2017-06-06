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


/**
 * The type Labeled price.
 */
public class LabeledPrice {
    private String label;
    private Long amount;

    /**
     * Gets label.
     *
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets label.
     *
     * @param label the label
     * @return the label
     */
    private LabeledPrice setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * Sets amount.
     *
     * @param amount the amount
     * @return the amount
     */
    private LabeledPrice setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
}
