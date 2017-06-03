package nl.dead_pixel.telebot.api.types.chat;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The type User.
 */
public class User {
    private Long id;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    private String username;
    @JsonProperty("language_code")
    private String languageCode;

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     * @return the id
     */
    public User setId(Long id) {
        this.id = id;
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
     * @return the first name
     */
    public User setFirstName(String firstName) {
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
     * @return the last name
     */
    public User setLastName(String lastName) {
        this.lastName = lastName;
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
     * @return the username
     */
    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Gets language code.
     *
     * @return the language code
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets language code.
     *
     * @param languageCode the language code
     * @return the language code
     */
    public User setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }
}
