package com.gildorymrp.api.event.lock;

import org.bukkit.event.HandlerList;

import com.gildorymrp.api.event.GildorymEvent;

/**
 * Represents a lock related event
 * @author Lucariatias
 *
 */
public abstract class GildorymLockEvent extends GildorymEvent {
	
	private static final HandlerList handlers = new HandlerList();
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
        return handlers;
    }

}
