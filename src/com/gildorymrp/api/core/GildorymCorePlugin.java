package com.gildorymrp.api.core;

import java.util.Collection;

import org.bukkit.entity.Player;
import com.gildorymrp.api.core.Character;

public interface GildorymCorePlugin {
	
	/**
	 * Gets the active character of the given player
	 * 
	 * @param player the player
	 * @return the player's active character
	 */
	public Character getActiveCharacter(Player player);
	
	/**
	 * Sets a player's active character.
	 * Should also manage changing their location, inventory, class, etc.
	 * 
	 * @param player the player
	 * @param character the character to set
	 */
	public void setActiveCharacter(Player player, Character character);
	
	/**
	 * Gets a collection of the player's characters
	 * 
	 * @param player the player
	 * @return a collection containing all of the player's characters
	 */
	public Collection<Character> getCharacters(Player player);

}
