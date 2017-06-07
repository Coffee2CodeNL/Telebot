Java Telegram Bot API Library [![Build Status](https://travis-ci.org/iSDP/Telebot.svg?branch=master)](https://travis-ci.org/iSDP/Telebot)
=======
This library is meant to be used to create Telegram bots with ease, while allowing jobs to run in seperate threads.  
The whole library is based on RxJava2 and Retrofit.

**Gradle**
``` 
compile 'nl.dead-pixel.telebot:telebot:0.3.0'
```

## State of the Library
This library is currently at version 0.3.0.  
Most of the Javadocs have been auto-generated and are in need of fixing.  
I do **NOT** deem it stable, but it's in a state that it can actually receive and send messages, and use most [methods defined in the API](https://github.com/iSDP/Telebot/blob/master/src/main/java/nl/dead_pixel/telebot/api/retrofit/TelegramBotApiService.java).

If you have any questions, feel free to make an [Issue](https://github.com/iSDP/Telebot/issues/new).  
The same goes for bugs and suggestions.

## Documentation
#### Code sample
```java
public class ExampleBot {
    private final static String TOKEN = "<Token Here>";

    public static void main(String[] args) {
        org.slf4j.Logger logger = LoggerFactory.getLogger(ExampleBot.class.getSimpleName());
        Telebot.init(TOKEN, Executors.newFixedThreadPool(4));
        Telebot.Plugins plugins = new Telebot.Plugins();
        plugins.addPlugin(new ExamplePlugin())
                .addPlugin(new AnotherExamplePlugin())
                .activatePlugins();
        logger.info("Activated Plugins");
    }
}
```
#### Explained step by step
1. Initialize the library  
    **This must be called before adding plugins!**  
    ```
    Telebot.init(TOKEN, Executors.newFixedThreadPool(4));
    ```

    Where the token is a field in your main class:
    `private static final String TOKEN = "<Token here>"` 

2. After that you can start adding Plugins, The main method of using this library, and also the recommended one.

    Create a package named `plugins` and add classes like the following example.  
    There are some premade plugins below you could use for testing.
    
    ##### Plugin Class Example
    ```java
    public class ExamplePlugin extends Plugin<Message> {
        @Override
        public void pluginBody(Message message) {
            // Add your plugin logic here
        }
    
        @Override
        public Class<Message> pluginUpdateType() {
            return Message.class;
        }
    }
    ```
    
    As you can see, the above plugin uses the `Message` type, this plugin will only catch messages sent by users in private or in groups.  
    The following types are available:
    - `Message`, A plain message sent in a group (Can be a photo, sticker, etc)
    - `EditedMessage`, An edited message in the group the bot is in.
    - `CommandMessage`, A `/command` type, so you can filter out regular messages.
    - `ChannelPost`, A Message posted to a Channel the bot is part of.
    - `EditedChannelPost`, An edited message posted to the channel the bot is part of.
    - `CallbackQuery`, An callback query
    - `InlineQuery`, An inline query
    - `ChosenInlineResult`, An chosen inline result
    - `PreCheckoutQuery`, An Pre-Checkout Query.
    - `ShippingQuery`, An Shipping Query

3. You can then add the plugin to the library:
    ```
    Telebot.addPlugin(new ExamplePlugin());
    ```

4. After you've finished adding the plugins, call the following method:
    ```
    Telebot.activatePlugins();
    ```

## Extras
#### IntelliJ IDEA Live Template
```java
public class $name$Plugin extends nl.dead_pixel.telebot.plugin.Plugin<$type$> {
    @java.lang.Override
    public void pluginBody($type$ update) {
        $SELECTION$
        $END$
    }

    @java.lang.Override
    public java.lang.Class<$type$> pluginUpdateType() {
        return $type$.class;
    }
}
```
#### Javadoc
[Javadoc](https://isdp.github.io/Telebot/)

## Plugins
#### Ping Plugin
```java
public class PingPlugin extends Plugin<CommandMessage> {
    /**
     * {@inheritDoc}
     */
    @Override
    public void pluginBody(CommandMessage commandMessage) {
        if (commandMessage.getCommand().equals("")) return;

        if (commandMessage.getCommand().equals("ping")) {
            log("Received command: ping");
            MessageRequest messageRequest = new MessageRequest.Builder(commandMessage.getChatId())
                    .replyTo(commandMessage.getMessage())
                    .text("Pong!")
                    .create();
            ApiService.sendMessage(messageRequest).subscribe(messageApiResponse -> log("Pong sent? " + messageApiResponse.getOk()), Throwable::printStackTrace);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<CommandMessage> pluginUpdateType() {
        return CommandMessage.class;
    }
}
```

## Roadmap
This is a list of the methods and types that still need to be implemented.

#### Methods to be added
*Currently none*

#### Methods to be fixed
- [ ] sendChatAction (Needs a Request Body)
- [ ] sendPhoto (...)
- [ ] sendAudio (...)
- [ ] sendDocument (...)
- [ ] sendSticker (...)
- [ ] sendVideo (...)
- [ ] sendVoice (...)
- [ ] sendVideoNote (...)
- [ ] sendLocation (...)
- [ ] sendVenue (...)
- [ ] sendContact (...)
- [ ] editMessageCaption (...)
- [ ] editMessageReplyMarkup (...)

#### Types to be added
- [ ] InlineQueryResultCachedAudio
- [ ] InlineQueryResultCachedDocument
- [ ] InlineQueryResultCachedGif
- [ ] InlineQueryResultCachedMpeg4Gif
- [ ] InlineQueryResultCachedPhoto
- [ ] InlineQueryResultCachedSticker
- [ ] InlineQueryResultCachedVideo
- [ ] InlineQueryResultCachedVoice
- [x] InlineQueryResultArticle
- [ ] InlineQueryResultAudio
- [ ] InlineQueryResultContact
- [ ] InlineQueryResultGame
- [ ] InlineQueryResultDocument
- [ ] InlineQueryResultGif
- [ ] InlineQueryResultLocation
- [ ] InlineQueryResultMpeg4Gif
- [ ] InlineQueryResultPhoto
- [ ] InlineQueryResultVenue
- [ ] InlineQueryResultVideo
- [ ] InlineQueryResultVoice
- [ ] InputLocationMessageContent
- [ ] InputVenueMessageContent
- [ ] InputContactMessageContent

#### Types to be fixed
- [ ] InlineQueryResultArticle
- [ ] InputTextMessageContent

## License
    Copyright (C) 2017 Remon Schopmeijer (79147FFF4E3C86DE) <support-telebot@dead-pixel.nl>
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
       http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
