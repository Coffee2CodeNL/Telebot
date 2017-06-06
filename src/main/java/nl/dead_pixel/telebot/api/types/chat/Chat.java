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

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The type Chat.
 */
public class Chat {
    private Long id;
    private String type;
    private String title;
    private String username;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("all_members_are_administrators")
    private Boolean allMembersAreAdministrators;

    /**
     * Gets Chat id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets Chat id.
     *
     * @param id the id
     * @return The current {@link Chat} object
     */
    private Chat setId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Gets Chat type.
     *
     * @return The Chat Type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     * @return The current {@link Chat} object
     */
    private Chat setType(String type) {
        this.type = type;
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
     * @return The current {@link Chat} object
     */
    private Chat setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets username.
     *
     * @param username the username
     * @return The current {@link Chat} object
     */
    private Chat setUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     * @return The current {@link Chat} object
     */
    private Chat setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     * @return The current {@link Chat} object
     */
    private Chat setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * A Method to check if all members in a chat are administrators or not.
     *
     * @return the Boolean
     */
    public Boolean isAllMembersAreAdministrators() {
        return allMembersAreAdministrators;
    }

    /**
     * Sets all members are administrators.
     *
     * @param allMembersAreAdministrators If True, All members are administrators in this chat.
     * @return The current {@link Chat} object
     */
    private Chat setAllMembersAreAdministrators(Boolean allMembersAreAdministrators) {
        this.allMembersAreAdministrators = allMembersAreAdministrators;
        return this;
    }
}
