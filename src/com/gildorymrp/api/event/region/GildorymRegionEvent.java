package com.gildorymrp.api.event.region;

import org.bukkit.event.HandlerList;

import com.gildorymrp.api.event.GildorymEvent;
import com.gildorymrp.api.regions.Region;

/**
 * Represents a region related event
 * @author Lucariatias
 *
 */
public abstract class GildorymRegionEvent extends GildorymEvent {
	
	private static final HandlerList handlers = new HandlerList();
	
	private final Region region;
	
	public GildorymRegionEvent(final Region region) {
		this.region = region;
	}
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
        return handlers;
    }
	
	/**
	 * Gets the region involved in this event
	 * 
	 * @return the region involved in this event
	 */
	public final Region getRegion() {
		return region;
	}

}
