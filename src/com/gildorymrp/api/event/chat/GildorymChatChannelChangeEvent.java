package com.gildorymrp.api.event.chat;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

import com.gildorymrp.api.plugin.chat.Channel;

/**
 * Called when a player changes which chat channel they are talking in
 * @author Lucariatias
 *
 */
public class GildorymChatChannelChangeEvent extends GildorymChatEvent implements Cancellable {
	
	private static final HandlerList handlers = new HandlerList();
	
	private final Player player;
	private final Channel oldChannel;
	private final Channel newChannel;
	private boolean cancel;
	
	public GildorymChatChannelChangeEvent(final Player who, final Channel oldChannel, final Channel newChannel) {
		this.player = who;
		this.oldChannel = oldChannel;
		this.newChannel = newChannel;
	}
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
        return handlers;
    }
	
	/**
	 * Gets the player changing channel
	 * 
	 * @return the player changing channel
	 */
	public final Player getPlayer() {
		return player;
	}
	
	/**
	 * Gets the channel the player is changing from
	 * 
	 * @return the old channel
	 */
	public final Channel getOldChannel() {
		return oldChannel;
	}
	
	/**
	 * Gets the channel the player is changing to
	 * 
	 * @return the new (current) channel
	 */
	public final Channel getNewChannel() {
		return newChannel;
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
