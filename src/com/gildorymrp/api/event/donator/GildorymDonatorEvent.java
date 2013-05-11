package com.gildorymrp.api.event.donator;

import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;

import com.gildorymrp.api.event.GildorymEvent;

/**
 * Represents a donator related event
 * @author Lucariatias
 *
 */
public abstract class GildorymDonatorEvent extends GildorymEvent {
	
	private static final HandlerList handlers = new HandlerList();
	
	private final Player donator;
	
	public GildorymDonatorEvent(final Player donator) {
		this.donator = donator;
	}
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
        return handlers;
    }
	
	/**
	 * Gets the donator involved in this event
	 * 
	 * @return the donator involved in this event
	 */
	public final Player getDonator() {
		return donator;
	}

}
