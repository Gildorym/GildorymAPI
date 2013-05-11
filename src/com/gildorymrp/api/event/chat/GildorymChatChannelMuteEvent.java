package com.gildorymrp.api.event.chat;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

import com.gildorymrp.api.chat.Channel;

/**
 * Called when a player mutes a channel
 * @author Lucariatias
 *
 */
public class GildorymChatChannelMuteEvent extends GildorymChatEvent implements Cancellable {
	
	private static final HandlerList handlers = new HandlerList();
	
	private final Player player;
	private final Channel channel;
	private boolean cancel;
	
	public GildorymChatChannelMuteEvent(final Player who, final Channel channel) {
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
	 * Gets the player muting the channel
	 * 
	 * @return the player muting the channel
	 */
	public final Player getPlayer() {
		return player;
	}
	
	/**
	 * Gets the channel the player is muting
	 * 
	 * @return the channel being muted
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
