package com.gildorymrp.api.event.classes;

import org.bukkit.event.HandlerList;

import com.gildorymrp.api.event.GildorymEvent;
import com.gildorymrp.api.classes.Class;

/**
 * Represents a class related event
 * @author Lucariatias
 *
 */
public abstract class GildorymClassEvent extends GildorymEvent {
	
	private static final HandlerList handlers = new HandlerList();
	
	private final Class clazz;
	
	public GildorymClassEvent(final Class clazz) {
		this.clazz = clazz;
	}
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
        return handlers;
    }
	
	/**
	 * Gets the class involved in this event
	 * 
	 * @return the class involved in this event
	 */
	public final Class getClazz() {
		return clazz;
	}

}
