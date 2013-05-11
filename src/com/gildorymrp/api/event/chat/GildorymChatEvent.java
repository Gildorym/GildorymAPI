package com.gildorymrp.api.event.chat;

import org.bukkit.event.HandlerList;

import com.gildorymrp.api.event.GildorymEvent;

/**
 * Represents a chat related event
 * @author Lucariatias
 *
 */
public abstract class GildorymChatEvent extends GildorymEvent {
	
	private static final HandlerList handlers = new HandlerList();
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
        return handlers;
    }

}
