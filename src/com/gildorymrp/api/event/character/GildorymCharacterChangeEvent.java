package com.gildorymrp.api.event.character;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;

import com.gildorymrp.api.plugin.core.Character;

/**
 * Called when a player changes character
 * @author Lucariatias
 *
 */
public class GildorymCharacterChangeEvent extends GildorymCharacterEvent implements Cancellable {
	
	private static final HandlerList handlers = new HandlerList();
	
	private final Player player;
	private final Character oldCharacter;
	private boolean cancel;
	
	public GildorymCharacterChangeEvent(final Player player, final Character oldCharacter, final Character character) {
		super(character);
		this.player = player;
		this.oldCharacter = oldCharacter;
	}
	
	@Override
	public HandlerList getHandlers() {
		return handlers;
	}
	
	public static HandlerList getHandlerList() {
        return handlers;
    }

	/**
	 * Gets the player changing character
	 * 
	 * @return the player changing character
	 */
	public final Player getPlayer() {
		return player;
	}
	
	/**
	 * Gets the character the player is changing from
	 * 
	 * @return the character the player is changing from
	 */
	public final Character getOldCharacter() {
		return oldCharacter;
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
