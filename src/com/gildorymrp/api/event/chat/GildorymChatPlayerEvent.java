package com.gildorymrp.api.event.chat;

import java.util.Collection;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

import com.gildorymrp.api.chat.Channel;

/**
 * Called when a player chats
 * @author Lucariatias
 *
 */
public class GildorymChatPlayerEvent extends GildorymChatEvent implements Cancellable {
	
	private static final HandlerList handlers = new HandlerList();
	
	private final Player player;
	private Channel channel;
	private String message;
	private Collection<Player> recipients;
	private boolean cancel;
	
	public GildorymChatPlayerEvent(final Player who, Channel channel, String message, Collection<Player> recipients) {
		this.player = who;
		this.channel = channel;
		this.message = message;
		this.recipients = recipients;
	}
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
        return handlers;
    }

	/**
	 * Gets the player chatting
	 * 
	 * @return the player chatting
	 */
	public final Player getPlayer() {
		return player;
	}
	
	/**
	 * Gets the channel the player is chatting in
	 * 
	 * @return the channel the player is chatting in
	 */
	public Channel getChannel() {
		return channel;
	}
	
	/**
	 * Sets the channel the player is chatting in
	 * 
	 * @param channel the channel the player is chatting in
	 */
	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	
	/**
	 * Gets the message being sent
	 * 
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	
	/**
	 * Sets the message to be sent
	 * 
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	/**
	 * Gets the recipients of this message
	 * 
	 * @return a collection containing the players whom this message is being sent to
	 */
	public Collection<Player> getRecipients() {
		return recipients;
	}
	
	@Override
	public boolean isCancelled() {
		return cancel;
	}

	@Override
	public void setCancelled(boolean cancel) {
		this.cancel = cancel;
	}

}
