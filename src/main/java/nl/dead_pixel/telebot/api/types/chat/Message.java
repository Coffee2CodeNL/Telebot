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
package nl.dead_pixel.telebot.api.types.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.interfaces.IUpdate;
import nl.dead_pixel.telebot.api.types.files.*;
import nl.dead_pixel.telebot.api.types.games.Game;
import nl.dead_pixel.telebot.api.types.payment.Invoice;
import nl.dead_pixel.telebot.api.types.payment.SuccessfulPayment;

import java.util.ArrayList;
import java.util.List;


/**
 * The type Message.
 */
public class Message implements IUpdate {
    @JsonProperty("message_id")
    private Long messageId;
    @JsonProperty("from")
    private User from;
    @JsonProperty("date")
    private Long date;
    @JsonProperty("chat")
    private Chat chat;
    @JsonProperty("forward_from")
    private User forwardFrom;
    @JsonProperty("forward_from_chat")
    private Chat forwardFromChat;
    @JsonProperty("forward_from_message_id")
    private Long forwardFromMessageId;
    @JsonProperty("forward_date")
    private Long forwardDate;
    @JsonProperty("reply_to_message")
    private Message replyToMessage;
    @JsonProperty("edit_date")
    private Long editDate;
    @JsonProperty("text")
    private String text;
    @JsonProperty("entities")
    private List<MessageEntity> entities = new ArrayList<MessageEntity>();
    @JsonProperty("audio")
    private Audio audio;
    @JsonProperty("document")
    private Document document;
    @JsonProperty("game")
    private Game game;
    @JsonProperty("photo")
    private List<PhotoSize> photo = new ArrayList<PhotoSize>();
    @JsonProperty("sticker")
    private Sticker sticker;
    @JsonProperty("video")
    private Video video;
    @JsonProperty("voice")
    private Voice voice;
    @JsonProperty("video_note")
    private VideoNote videoNote;
    @JsonProperty("new_chat_members")
    private List<User> newChatMembers = new ArrayList<User>();
    @JsonProperty("caption")
    private String caption;
    @JsonProperty("contact")
    private Contact contact;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("venue")
    private Venue venue;
    @JsonProperty("new_chat_member")
    private User newChatMember;
    @JsonProperty("new_chat_participant")
    private User newChatParticipant;
    @JsonProperty("left_chat_participant")
    private User leftChatParticipant;
    @JsonProperty("left_chat_member")
    private User leftChatMember;
    @JsonProperty("new_chat_title")
    private String newChatTitle;
    @JsonProperty("new_chat_photo")
    private List<PhotoSize> newChatPhoto;
    @JsonProperty("delete_chat_photo")
    private Boolean deleteChatPhoto;
    @JsonProperty("group_chat_created")
    private Boolean groupChatCreated;
    @JsonProperty("supergroup_chat_created")
    private Boolean supergroupChatCreated;
    @JsonProperty("channel_chat_created")
    private Boolean channelChatCreated;
    @JsonProperty("migrate_to_chat_id")
    private Long migrateToChatId;
    @JsonProperty("migrate_from_chat_id")
    private Long migrateFromChatId;
    @JsonProperty("pinned_message")
    private Message pinnedMessage;
    @JsonProperty("invoice")
    private Invoice invoice;
    @JsonProperty("successful_payment")
    private SuccessfulPayment successfulPayment;

    /**
     * Gets message id.
     *
     * @return the message id
     */
    public Long getMessageId() {
        return messageId;
    }

    /**
     * Sets message id.
     *
     * @param messageId the message id
     * @return the message id
     */
    private Message setMessageId(Long messageId) {
        this.messageId = messageId;
        return this;
    }

    /**
     * Gets from.
     *
     * @return the from
     */
    public User getFrom() {
        return from;
    }

    /**
     * Sets from.
     *
     * @param from the from
     * @return the from
     */
    private Message setFrom(User from) {
        this.from = from;
        return this;
    }

    /**
     * Gets date.
     *
     * @return the date
     */
    public Long getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     * @return the date
     */
    private Message setDate(Long date) {
        this.date = date;
        return this;
    }

    /**
     * Gets chat.
     *
     * @return the chat
     */
    public Chat getChat() {
        return chat;
    }

    /**
     * Sets chat.
     *
     * @param chat the chat
     * @return the chat
     */
    private Message setChat(Chat chat) {
        this.chat = chat;
        return this;
    }

    /**
     * Gets forward from.
     *
     * @return the forward from
     */
    public User getForwardFrom() {
        return forwardFrom;
    }

    /**
     * Sets forward from.
     *
     * @param forwardFrom the forward from
     * @return the forward from
     */
    private Message setForwardFrom(User forwardFrom) {
        this.forwardFrom = forwardFrom;
        return this;
    }

    /**
     * Gets forward from chat.
     *
     * @return the forward from chat
     */
    public Chat getForwardFromChat() {
        return forwardFromChat;
    }

    /**
     * Sets forward from chat.
     *
     * @param forwardFromChat the forward from chat
     * @return the forward from chat
     */
    private Message setForwardFromChat(Chat forwardFromChat) {
        this.forwardFromChat = forwardFromChat;
        return this;
    }

    /**
     * Gets forward from message id.
     *
     * @return the forward from message id
     */
    public Long getForwardFromMessageId() {
        return forwardFromMessageId;
    }

    /**
     * Sets forward from message id.
     *
     * @param forwardFromMessageId the forward from message id
     * @return the forward from message id
     */
    private Message setForwardFromMessageId(Long forwardFromMessageId) {
        this.forwardFromMessageId = forwardFromMessageId;
        return this;
    }

    /**
     * Gets forward date.
     *
     * @return the forward date
     */
    public Long getForwardDate() {
        return forwardDate;
    }

    /**
     * Sets forward date.
     *
     * @param forwardDate the forward date
     * @return the forward date
     */
    private Message setForwardDate(Long forwardDate) {
        this.forwardDate = forwardDate;
        return this;
    }

    /**
     * Gets reply to message.
     *
     * @return the reply to message
     */
    public Message getReplyToMessage() {
        return replyToMessage;
    }

    /**
     * Sets reply to message.
     *
     * @param replyToMessage the reply to message
     * @return the reply to message
     */
    private Message setReplyToMessage(Message replyToMessage) {
        this.replyToMessage = replyToMessage;
        return this;
    }

    /**
     * Gets edit date.
     *
     * @return the edit date
     */
    public Long getEditDate() {
        return editDate;
    }

    /**
     * Sets edit date.
     *
     * @param editDate the edit date
     * @return the edit date
     */
    private Message setEditDate(Long editDate) {
        this.editDate = editDate;
        return this;
    }

    /**
     * Gets text.
     *
     * @return the text
     */
    public String getText() {
        if(text == null) return "";
        return text;
    }

    /**
     * Sets text.
     *
     * @param text the text
     * @return the text
     */
    private Message setText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Gets entities.
     *
     * @return the entities
     */
    public List<MessageEntity> getEntities() {
        return entities;
    }

    /**
     * Sets entities.
     *
     * @param entities the entities
     * @return the entities
     */
    private Message setEntities(List<MessageEntity> entities) {
        this.entities = entities;
        return this;
    }

    /**
     * Gets audio.
     *
     * @return the audio
     */
    public Audio getAudio() {
        return audio;
    }

    /**
     * Sets audio.
     *
     * @param audio the audio
     * @return the audio
     */
    private Message setAudio(Audio audio) {
        this.audio = audio;
        return this;
    }

    /**
     * Gets document.
     *
     * @return the document
     */
    public Document getDocument() {
        return document;
    }

    /**
     * Sets document.
     *
     * @param document the document
     * @return the document
     */
    private Message setDocument(Document document) {
        this.document = document;
        return this;
    }

    /**
     * Gets game.
     *
     * @return the game
     */
    public Game getGame() {
        return game;
    }

    /**
     * Sets game.
     *
     * @param game the game
     * @return the game
     */
    private Message setGame(Game game) {
        this.game = game;
        return this;
    }

    /**
     * Gets photo.
     *
     * @return the photo
     */
    public List<PhotoSize> getPhoto() {
        return photo;
    }

    /**
     * Sets photo.
     *
     * @param photo the photo
     * @return the photo
     */
    private Message setPhoto(List<PhotoSize> photo) {
        this.photo = photo;
        return this;
    }

    /**
     * Gets sticker.
     *
     * @return the sticker
     */
    public Sticker getSticker() {
        return sticker;
    }

    /**
     * Sets sticker.
     *
     * @param sticker the sticker
     * @return the sticker
     */
    private Message setSticker(Sticker sticker) {
        this.sticker = sticker;
        return this;
    }

    /**
     * Gets video.
     *
     * @return the video
     */
    public Video getVideo() {
        return video;
    }

    /**
     * Sets video.
     *
     * @param video the video
     * @return the video
     */
    private Message setVideo(Video video) {
        this.video = video;
        return this;
    }

    /**
     * Gets voice.
     *
     * @return the voice
     */
    public Voice getVoice() {
        return voice;
    }

    /**
     * Sets voice.
     *
     * @param voice the voice
     * @return the voice
     */
    private Message setVoice(Voice voice) {
        this.voice = voice;
        return this;
    }

    /**
     * Gets video note.
     *
     * @return the video note
     */
    public VideoNote getVideoNote() {
        return videoNote;
    }

    /**
     * Sets video note.
     *
     * @param videoNote the video note
     * @return the video note
     */
    private Message setVideoNote(VideoNote videoNote) {
        this.videoNote = videoNote;
        return this;
    }

    /**
     * Gets new chat members.
     *
     * @return the new chat members
     */
    public List<User> getNewChatMembers() {
        return newChatMembers;
    }

    /**
     * Sets new chat members.
     *
     * @param newChatMembers the new chat members
     * @return the new chat members
     */
    private Message setNewChatMembers(List<User> newChatMembers) {
        this.newChatMembers = newChatMembers;
        return this;
    }

    /**
     * Gets caption.
     *
     * @return the caption
     */
    public String getCaption() {
        return caption;
    }

    /**
     * Sets caption.
     *
     * @param caption the caption
     * @return the caption
     */
    private Message setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    /**
     * Gets contact.
     *
     * @return the contact
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets contact.
     *
     * @param contact the contact
     * @return the contact
     */
    private Message setContact(Contact contact) {
        this.contact = contact;
        return this;
    }

    /**
     * Gets location.
     *
     * @return the location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets location.
     *
     * @param location the location
     * @return the location
     */
    private Message setLocation(Location location) {
        this.location = location;
        return this;
    }

    /**
     * Gets venue.
     *
     * @return the venue
     */
    public Venue getVenue() {
        return venue;
    }

    /**
     * Sets venue.
     *
     * @param venue the venue
     * @return the venue
     */
    private Message setVenue(Venue venue) {
        this.venue = venue;
        return this;
    }

    /**
     * Gets new chat member.
     *
     * @return the new chat member
     */
    @Deprecated
    public User getNewChatMember() {
        return newChatMember;
    }

    /**
     * Sets new chat member.
     *
     * @param newChatMember the new chat member
     * @return the new chat member
     */
    @Deprecated
    private Message setNewChatMember(User newChatMember) {
        this.newChatMember = newChatMember;
        return this;
    }

    /**
     * Gets new chat participant.
     *
     * @return the new chat participant
     */
    @Deprecated
    public User getNewChatParticipant() {
        return newChatParticipant;
    }

    /**
     * Sets new chat participant.
     *
     * @param newChatParticipant the new chat participant
     * @return the new chat participant
     */
    @Deprecated
    private Message setNewChatParticipant(User newChatParticipant) {
        this.newChatParticipant = newChatParticipant;
        return this;
    }

    /**
     * Gets left chat participant.
     *
     * @return the left chat participant
     */
    @Deprecated
    public User getLeftChatParticipant() {
        return leftChatParticipant;
    }

    /**
     * Sets left chat participant.
     *
     * @param leftChatParticipant the left chat participant
     * @return the left chat participant
     */
    @Deprecated
    private Message setLeftChatParticipant(User leftChatParticipant) {
        this.leftChatParticipant = leftChatParticipant;
        return this;
    }

    /**
     * Gets left chat member.
     *
     * @return the left chat member
     */
    public User getLeftChatMember() {
        return leftChatMember;
    }

    /**
     * Sets left chat member.
     *
     * @param leftChatMember the left chat member
     * @return the left chat member
     */
    private Message setLeftChatMember(User leftChatMember) {
        this.leftChatMember = leftChatMember;
        return this;
    }

    /**
     * Gets new chat title.
     *
     * @return the new chat title
     */
    public String getNewChatTitle() {
        return newChatTitle;
    }

    /**
     * Sets new chat title.
     *
     * @param newChatTitle the new chat title
     * @return the new chat title
     */
    private Message setNewChatTitle(String newChatTitle) {
        this.newChatTitle = newChatTitle;
        return this;
    }

    /**
     * Gets new chat photo.
     *
     * @return the new chat photo
     */
    public List<PhotoSize> getNewChatPhoto() {
        return newChatPhoto;
    }

    /**
     * Sets new chat photo.
     *
     * @param newChatPhoto the new chat photo
     * @return the new chat photo
     */
    private Message setNewChatPhoto(List<PhotoSize> newChatPhoto) {
        this.newChatPhoto = newChatPhoto;
        return this;
    }

    /**
     * Is delete chat photo Boolean.
     *
     * @return the Boolean
     */
    public Boolean isDeleteChatPhoto() {
        return deleteChatPhoto;
    }

    /**
     * Sets delete chat photo.
     *
     * @param deleteChatPhoto the delete chat photo
     * @return the delete chat photo
     */
    private Message setDeleteChatPhoto(Boolean deleteChatPhoto) {
        this.deleteChatPhoto = deleteChatPhoto;
        return this;
    }

    /**
     * Is group chat created Boolean.
     *
     * @return the Boolean
     */
    public Boolean isGroupChatCreated() {
        return groupChatCreated;
    }

    /**
     * Sets group chat created.
     *
     * @param groupChatCreated the group chat created
     * @return the group chat created
     */
    private Message setGroupChatCreated(Boolean groupChatCreated) {
        this.groupChatCreated = groupChatCreated;
        return this;
    }

    /**
     * Is supergroup chat created Boolean.
     *
     * @return the Boolean
     */
    public Boolean isSupergroupChatCreated() {
        return supergroupChatCreated;
    }

    /**
     * Sets supergroup chat created.
     *
     * @param supergroupChatCreated the supergroup chat created
     * @return the supergroup chat created
     */
    private Message setSupergroupChatCreated(Boolean supergroupChatCreated) {
        this.supergroupChatCreated = supergroupChatCreated;
        return this;
    }

    /**
     * Is channel chat created Boolean.
     *
     * @return the Boolean
     */
    public Boolean isChannelChatCreated() {
        return channelChatCreated;
    }

    /**
     * Sets channel chat created.
     *
     * @param channelChatCreated the channel chat created
     * @return the channel chat created
     */
    private Message setChannelChatCreated(Boolean channelChatCreated) {
        this.channelChatCreated = channelChatCreated;
        return this;
    }

    /**
     * Gets migrate to chat id.
     *
     * @return the migrate to chat id
     */
    public Long getMigrateToChatId() {
        return migrateToChatId;
    }

    /**
     * Sets migrate to chat id.
     *
     * @param migrateToChatId the migrate to chat id
     * @return the migrate to chat id
     */
    private Message setMigrateToChatId(Long migrateToChatId) {
        this.migrateToChatId = migrateToChatId;
        return this;
    }

    /**
     * Gets migrate from chat id.
     *
     * @return the migrate from chat id
     */
    public Long getMigrateFromChatId() {
        return migrateFromChatId;
    }

    /**
     * Sets migrate from chat id.
     *
     * @param migrateFromChatId the migrate from chat id
     * @return the migrate from chat id
     */
    private Message setMigrateFromChatId(Long migrateFromChatId) {
        this.migrateFromChatId = migrateFromChatId;
        return this;
    }

    /**
     * Gets pinned message.
     *
     * @return the pinned message
     */
    public Message getPinnedMessage() {
        return pinnedMessage;
    }

    /**
     * Sets pinned message.
     *
     * @param pinnedMessage the pinned message
     * @return the pinned message
     */
    private Message setPinnedMessage(Message pinnedMessage) {
        this.pinnedMessage = pinnedMessage;
        return this;
    }

    /**
     * Gets invoice.
     *
     * @return the invoice
     */
    public Invoice getInvoice() {
        return invoice;
    }

    /**
     * Sets invoice.
     *
     * @param invoice the invoice
     * @return the invoice
     */
    private Message setInvoice(Invoice invoice) {
        this.invoice = invoice;
        return this;
    }

    /**
     * Gets successful payment.
     *
     * @return the successful payment
     */
    public SuccessfulPayment getSuccessfulPayment() {
        return successfulPayment;
    }

    /**
     * Sets successful payment.
     *
     * @param successfulPayment the successful payment
     * @return the successful payment
     */
    private Message setSuccessfulPayment(SuccessfulPayment successfulPayment) {
        this.successfulPayment = successfulPayment;
        return this;
    }
}
