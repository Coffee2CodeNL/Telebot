package nl.dead_pixel.telebot.api.types.chat;


/**
 * The type Chat member.
 */
public class ChatMember {
    private User user;
    private String status;

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
    public ChatMember setUser(User user) {
        this.user = user;
        return this;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets status.
     *
     * @param status the status
     * @return the status
     */
    public ChatMember setStatus(String status) {
        this.status = status;
        return this;
    }
}
