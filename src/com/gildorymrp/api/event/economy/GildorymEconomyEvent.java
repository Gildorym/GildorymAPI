package com.gildorymrp.api.event.economy;

import org.bukkit.event.HandlerList;

import com.gildorymrp.api.event.GildorymEvent;

/**
 * Represents an economy related event
 * @author Lucariatias
 *
 */
public abstract class GildorymEconomyEvent extends GildorymEvent {
	
	private static final HandlerList handlers = new HandlerList();
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
        return handlers;
    }

}
