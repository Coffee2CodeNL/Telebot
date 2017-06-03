package nl.dead_pixel.telebot.api.retrofit.answer_bodies;

import nl.dead_pixel.telebot.api.interfaces.IInlineQueryResult;

import java.util.List;
import java.util.Optional;

/**
 * @author ReSco
 * @since 22:34 2-6-2017
 */
public class InlineQueryAnswer {
    private String inlineQueryId;
    private List<IInlineQueryResult> inlineQueryResults;
    private Optional<Long> cacheTime = Optional.empty();
    private Optional<Boolean> isPersonal = Optional.empty();
    private Optional<String> nextOffset = Optional.empty();
    private Optional<String> switchPmText = Optional.empty();
    private Optional<String> switchPmParameter = Optional.empty();
}
