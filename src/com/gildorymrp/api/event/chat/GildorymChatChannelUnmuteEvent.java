package com.gildorymrp.api.event.chat;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

import com.gildorymrp.api.chat.Channel;

/**
 * Called when a player unmutes a channel
 * @author Lucariatias
 *
 */
public class GildorymChatChannelUnmuteEvent extends GildorymChatEvent implements Cancellable {
	
	private static final HandlerList handlers = new HandlerList();
	
	private final Player player;
	private final Channel channel;
	private boolean cancel;
	
	public GildorymChatChannelUnmuteEvent(final Player who, final Channel channel) {
		this.player = who;
		this.channel = channel;
	}
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
        return handlers;
    }

	/**
	 * Gets the player unmuting the channel
	 * 
	 * @return the player unmuting the channel
	 */
	public final Player getPlayer() {
		return player;
	}
	
	/**
	 * Gets the channel the player is unmuting
	 * 
	 * @return the channel being unmuted
	 */
	public final Channel getChannel() {
		return channel;
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
