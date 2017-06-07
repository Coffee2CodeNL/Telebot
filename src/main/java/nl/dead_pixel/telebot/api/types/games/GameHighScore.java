/**
 *    Copyright (C) 2017 Remon Schopmeijer (7914 7FFF 4E3C 86DE) <support-telebot@dead-pixel.nl>
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
    private GameHighScore setPosition(Long position) {
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
    private GameHighScore setUser(User user) {
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
    private GameHighScore setScore(Long score) {
        this.score = score;
        return this;
    }
}
