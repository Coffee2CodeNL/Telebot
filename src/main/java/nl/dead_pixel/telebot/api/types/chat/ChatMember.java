package nl.dead_pixel.telebot.api.types.chat;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class ChatMember {
    private User user;
    private String status;

    public User getUser() {
        return user;
    }

    public ChatMember setUser(User user) {
        this.user = user;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public ChatMember setStatus(String status) {
        this.status = status;
        return this;
    }
}
