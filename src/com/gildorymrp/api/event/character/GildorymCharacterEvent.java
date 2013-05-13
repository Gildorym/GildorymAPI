package com.gildorymrp.api.event.character;

import org.bukkit.event.HandlerList;

import com.gildorymrp.api.event.GildorymEvent;
import com.gildorymrp.api.plugin.core.Character;

/**
 * Represents an event involving a character
 * @author Lucariatias
 *
 */
public abstract class GildorymCharacterEvent extends GildorymEvent {
	
	private static final HandlerList handlers = new HandlerList();
	
	private final Character character;
	
	public GildorymCharacterEvent(Character character) {
		this.character = character;
	}
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
        return handlers;
    }
	
	/**
	 * Gets the character involved in this event
	 * 
	 * @return the character who is involved in this event
	 */
	public final Character getCharacter() {
		return character;
	}

}
