package nl.dead_pixel.telebot.api.types.games;

import nl.dead_pixel.telebot.api.types.chat.User;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class GameHighScore {
    private int position;
    private User user;
    private int score;

    public int getPosition() {
        return position;
    }

    public GameHighScore setPosition(int position) {
        this.position = position;
        return this;
    }

    public User getUser() {
        return user;
    }

    public GameHighScore setUser(User user) {
        this.user = user;
        return this;
    }

    public int getScore() {
        return score;
    }

    public GameHighScore setScore(int score) {
        this.score = score;
        return this;
    }
}
