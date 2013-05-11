package com.gildorymrp.api.event.deity;

import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

import com.gildorymrp.api.core.Character;
import com.gildorymrp.api.deities.Deity;

/**
 * Called when a player worships a deity
 * @author Lucariatias
 *
 */
public class GildorymDeityWorshipEvent extends GildorymDeityEvent implements Cancellable {
	
	private static final HandlerList handlers = new HandlerList();
	
	private final Character character;
	private int exp;
	private boolean cancel;
	
	public GildorymDeityWorshipEvent(final Deity deity, final Character character, int exp) {
		super(deity);
		this.character = character;
		this.exp = exp;
	}
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
        return handlers;
    }
	
	/**
	 * Gets the character worshipping the deity
	 * 
	 * @return the character
	 */
	public final Character getCharacter() {
		return character;
	}
	
	/**
	 * Gets the experience to be given
	 * 
	 * @return the experience
	 */
	public int getExp() {
		return exp;
	}
	
	/**
	 * Sets the experience to be given
	 * 
	 * @param exp the experience to set
	 */
	public void setExp(int exp) {
		this.exp = exp;
	}

	@Override
	public boolean isCancelled() {
		return cancel;
	}

	@Override
	public void setCancelled(boolean cancel) {
		this.cancel = cancel;
	}

}
