package nl.dead_pixel.telebot.api.types.chat;


/**
 * The type Message entity.
 */
public class MessageEntity {
    private String type;
    private Long offset;
    private Long length;
    private String url;
    private User user;

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Sets type.
     *
     * @param type the type
     * @return the type
     */
    public MessageEntity setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Gets offset.
     *
     * @return the offset
     */
    public Long getOffset() {
        return offset;
    }

    /**
     * Sets offset.
     *
     * @param offset the offset
     * @return the offset
     */
    public MessageEntity setOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Gets length.
     *
     * @return the length
     */
    public Long getLength() {
        return length;
    }

    /**
     * Sets length.
     *
     * @param length the length
     * @return the length
     */
    public MessageEntity setLength(Long length) {
        this.length = length;
        return this;
    }

    /**
     * Gets url.
     *
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets url.
     *
     * @param url the url
     * @return the url
     */
    public MessageEntity setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Gets user.
     *
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * Sets user.
     *
     * @param user the user
     * @return the user
     */
    public MessageEntity setUser(User user) {
        this.user = user;
        return this;
    }
}
