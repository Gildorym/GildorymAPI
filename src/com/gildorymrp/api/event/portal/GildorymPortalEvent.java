package com.gildorymrp.api.event.portal;

import org.bukkit.event.HandlerList;

import com.gildorymrp.api.event.GildorymEvent;

/**
 * Represents a portal related event
 * @author Lucariatias
 *
 */
public abstract class GildorymPortalEvent extends GildorymEvent {
	
	private static final HandlerList handlers = new HandlerList();
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
        return handlers;
    }

}
