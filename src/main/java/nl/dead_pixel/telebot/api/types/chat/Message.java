package nl.dead_pixel.telebot.api.types.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import nl.dead_pixel.telebot.api.types.files.*;
import nl.dead_pixel.telebot.api.types.games.Game;
import nl.dead_pixel.telebot.api.types.payment.Invoice;
import nl.dead_pixel.telebot.api.types.payment.SuccessfulPayment;

import java.util.List;

/**
 * Created by @iSDP
 * A Telegram Bot Library for Java
 */
public class Message {
    @JsonProperty("message_id")
    private int messageId;
    private User from;
    private int date;
    private Chat chat;
    @JsonProperty("forward_from")
    private User forwardFrom;
    @JsonProperty("forward_from_chat")
    private Chat forwardFromChat;
    @JsonProperty("forward_from_message_id")
    private int forwardFromMessageId;
    @JsonProperty("forward_date")
    private int forwardDate;
    @JsonProperty("reply_to_message")
    private Message replyToMessage;
    @JsonProperty("edit_date")
    private int editDate;
    private String text;
    private List<MessageEntity> entities;
    private Audio audio;
    private Document document;
    private Game game;
    private List<PhotoSize> photo;
    private Sticker sticker;
    private Video video;
    private Voice voice;
    @JsonProperty("video_note")
    private VideoNote videoNote;
    @JsonProperty("new_chat_member")
    private List<User> newChatMembers;
    private String caption;
    private Contact contact;
    private Location location;
    private Venue venue;
    @JsonProperty("new_chat_member")
    private User newChatMember;
    @JsonProperty("left_chat_member")
    private User leftChatMember;
    @JsonProperty("new_chat_title")
    private String newChatTitle;
    @JsonProperty("new_chat_photo")
    private List<PhotoSize> newChatPhoto;
    @JsonProperty("delete_chat_photo")
    private boolean deleteChatPhoto;
    @JsonProperty("group_chat_created")
    private boolean groupChatCreated;
    @JsonProperty("supergroup_chat_created")
    private boolean supergroupChatCreated;
    @JsonProperty("channel_chat_created")
    private boolean channelChatCreated;
    @JsonProperty("migrate_to_chat_id")
    private long migrateToChatId;
    @JsonProperty("migrate_from_chat_id")
    private long migrateFromChatId;
    @JsonProperty("pinned_message")
    private Message pinnedMessage;
    private Invoice invoice;
    @JsonProperty("successful_payment")
    private SuccessfulPayment successfulPayment;

    public int getMessageId() {
        return messageId;
    }

    public Message setMessageId(int messageId) {
        this.messageId = messageId;
        return this;
    }

    public User getFrom() {
        return from;
    }

    public Message setFrom(User from) {
        this.from = from;
        return this;
    }

    public int getDate() {
        return date;
    }

    public Message setDate(int date) {
        this.date = date;
        return this;
    }

    public Chat getChat() {
        return chat;
    }

    public Message setChat(Chat chat) {
        this.chat = chat;
        return this;
    }

    public User getForwardFrom() {
        return forwardFrom;
    }

    public Message setForwardFrom(User forwardFrom) {
        this.forwardFrom = forwardFrom;
        return this;
    }

    public Chat getForwardFromChat() {
        return forwardFromChat;
    }

    public Message setForwardFromChat(Chat forwardFromChat) {
        this.forwardFromChat = forwardFromChat;
        return this;
    }

    public int getForwardFromMessageId() {
        return forwardFromMessageId;
    }

    public Message setForwardFromMessageId(int forwardFromMessageId) {
        this.forwardFromMessageId = forwardFromMessageId;
        return this;
    }

    public int getForwardDate() {
        return forwardDate;
    }

    public Message setForwardDate(int forwardDate) {
        this.forwardDate = forwardDate;
        return this;
    }

    public Message getReplyToMessage() {
        return replyToMessage;
    }

    public Message setReplyToMessage(Message replyToMessage) {
        this.replyToMessage = replyToMessage;
        return this;
    }

    public int getEditDate() {
        return editDate;
    }

    public Message setEditDate(int editDate) {
        this.editDate = editDate;
        return this;
    }

    public String getText() {
        return text;
    }

    public Message setText(String text) {
        this.text = text;
        return this;
    }

    public List<MessageEntity> getEntities() {
        return entities;
    }

    public Message setEntities(List<MessageEntity> entities) {
        this.entities = entities;
        return this;
    }

    public Audio getAudio() {
        return audio;
    }

    public Message setAudio(Audio audio) {
        this.audio = audio;
        return this;
    }

    public Document getDocument() {
        return document;
    }

    public Message setDocument(Document document) {
        this.document = document;
        return this;
    }

    public Game getGame() {
        return game;
    }

    public Message setGame(Game game) {
        this.game = game;
        return this;
    }

    public List<PhotoSize> getPhoto() {
        return photo;
    }

    public Message setPhoto(List<PhotoSize> photo) {
        this.photo = photo;
        return this;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public Message setSticker(Sticker sticker) {
        this.sticker = sticker;
        return this;
    }

    public Video getVideo() {
        return video;
    }

    public Message setVideo(Video video) {
        this.video = video;
        return this;
    }

    public Voice getVoice() {
        return voice;
    }

    public Message setVoice(Voice voice) {
        this.voice = voice;
        return this;
    }

    public VideoNote getVideoNote() {
        return videoNote;
    }

    public Message setVideoNote(VideoNote videoNote) {
        this.videoNote = videoNote;
        return this;
    }

    public List<User> getNewChatMembers() {
        return newChatMembers;
    }

    public Message setNewChatMembers(List<User> newChatMembers) {
        this.newChatMembers = newChatMembers;
        return this;
    }

    public String getCaption() {
        return caption;
    }

    public Message setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    public Contact getContact() {
        return contact;
    }

    public Message setContact(Contact contact) {
        this.contact = contact;
        return this;
    }

    public Location getLocation() {
        return location;
    }

    public Message setLocation(Location location) {
        this.location = location;
        return this;
    }

    public Venue getVenue() {
        return venue;
    }

    public Message setVenue(Venue venue) {
        this.venue = venue;
        return this;
    }

    public User getNewChatMember() {
        return newChatMember;
    }

    public Message setNewChatMember(User newChatMember) {
        this.newChatMember = newChatMember;
        return this;
    }

    public User getLeftChatMember() {
        return leftChatMember;
    }

    public Message setLeftChatMember(User leftChatMember) {
        this.leftChatMember = leftChatMember;
        return this;
    }

    public String getNewChatTitle() {
        return newChatTitle;
    }

    public Message setNewChatTitle(String newChatTitle) {
        this.newChatTitle = newChatTitle;
        return this;
    }

    public List<PhotoSize> getNewChatPhoto() {
        return newChatPhoto;
    }

    public Message setNewChatPhoto(List<PhotoSize> newChatPhoto) {
        this.newChatPhoto = newChatPhoto;
        return this;
    }

    public boolean isDeleteChatPhoto() {
        return deleteChatPhoto;
    }

    public Message setDeleteChatPhoto(boolean deleteChatPhoto) {
        this.deleteChatPhoto = deleteChatPhoto;
        return this;
    }

    public boolean isGroupChatCreated() {
        return groupChatCreated;
    }

    public Message setGroupChatCreated(boolean groupChatCreated) {
        this.groupChatCreated = groupChatCreated;
        return this;
    }

    public boolean isSupergroupChatCreated() {
        return supergroupChatCreated;
    }

    public Message setSupergroupChatCreated(boolean supergroupChatCreated) {
        this.supergroupChatCreated = supergroupChatCreated;
        return this;
    }

    public boolean isChannelChatCreated() {
        return channelChatCreated;
    }

    public Message setChannelChatCreated(boolean channelChatCreated) {
        this.channelChatCreated = channelChatCreated;
        return this;
    }

    public long getMigrateToChatId() {
        return migrateToChatId;
    }

    public Message setMigrateToChatId(long migrateToChatId) {
        this.migrateToChatId = migrateToChatId;
        return this;
    }

    public long getMigrateFromChatId() {
        return migrateFromChatId;
    }

    public Message setMigrateFromChatId(long migrateFromChatId) {
        this.migrateFromChatId = migrateFromChatId;
        return this;
    }

    public Message getPinnedMessage() {
        return pinnedMessage;
    }

    public Message setPinnedMessage(Message pinnedMessage) {
        this.pinnedMessage = pinnedMessage;
        return this;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public Message setInvoice(Invoice invoice) {
        this.invoice = invoice;
        return this;
    }

    public SuccessfulPayment getSuccessfulPayment() {
        return successfulPayment;
    }

    public Message setSuccessfulPayment(SuccessfulPayment successfulPayment) {
        this.successfulPayment = successfulPayment;
        return this;
    }
}
