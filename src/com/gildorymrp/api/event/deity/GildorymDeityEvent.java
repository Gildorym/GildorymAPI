package com.gildorymrp.api.event.deity;

import org.bukkit.event.HandlerList;

import com.gildorymrp.api.event.GildorymEvent;
import com.gildorymrp.api.plugin.deities.Deity;

/**
 * Represents a deity related event
 * @author Lucariatias
 *
 */
public abstract class GildorymDeityEvent extends GildorymEvent {
	
	private static final HandlerList handlers = new HandlerList();
	
	private final Deity deity;
	
	public GildorymDeityEvent(final Deity deity) {
		this.deity = deity;
	}
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
        return handlers;
    }
	
	/**
	 * Gets the deity involved in this event
	 * 
	 * @return the deity involved in this event
	 */
	public final Deity getDeity() {
		return deity;
	}

}
