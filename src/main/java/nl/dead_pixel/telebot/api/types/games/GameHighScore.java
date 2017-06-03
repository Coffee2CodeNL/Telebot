package nl.dead_pixel.telebot.api.types.games;

import nl.dead_pixel.telebot.api.types.chat.User;


/**
 * The type Game high score.
 */
public class GameHighScore {
    private Long position;
    private User user;
    private Long score;

    /**
     * Gets position.
     *
     * @return the position
     */
    public Long getPosition() {
        return position;
    }

    /**
     * Sets position.
     *
     * @param position the position
     * @return the position
     */
    public GameHighScore setPosition(Long position) {
        this.position = position;
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
    public GameHighScore setUser(User user) {
        this.user = user;
        return this;
    }

    /**
     * Gets score.
     *
     * @return the score
     */
    public Long getScore() {
        return score;
    }

    /**
     * Sets score.
     *
     * @param score the score
     * @return the score
     */
    public GameHighScore setScore(Long score) {
        this.score = score;
        return this;
    }
}
