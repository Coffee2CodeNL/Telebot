package nl.dead_pixel.telebot.api.types.chat;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class MessageEntity {
    private String type;
    private int offset;
    private int length;
    private String url;
    private User user;

    public String getType() {
        return type;
    }

    public MessageEntity setType(String type) {
        this.type = type;
        return this;
    }

    public int getOffset() {
        return offset;
    }

    public MessageEntity setOffset(int offset) {
        this.offset = offset;
        return this;
    }

    public int getLength() {
        return length;
    }

    public MessageEntity setLength(int length) {
        this.length = length;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public MessageEntity setUrl(String url) {
        this.url = url;
        return this;
    }

    public User getUser() {
        return user;
    }

    public MessageEntity setUser(User user) {
        this.user = user;
        return this;
    }
}
