package com.gildorymrp.api.event;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Represents a Gildorym-specific event
 * @author Lucariatias
 *
 */
public abstract class GildorymEvent extends Event {
	
	private static final HandlerList handlers = new HandlerList();
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
        return handlers;
    }

}
