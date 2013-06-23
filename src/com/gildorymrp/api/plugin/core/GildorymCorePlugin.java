package com.gildorymrp.api.plugin.core;

import java.util.Collection;

import org.bukkit.entity.Player;

import com.gildorymrp.api.plugin.core.Character;

/**
 * Represents a core plugin
 * @author Lucariatias
 *
 */
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
	
	/**
	 * Rolls the given string, in the format [amount]d[sides]±[modifier], printing the result to players within a sixteen block radius of the roller
	 * 
	 * @param roller the player rolling the dice
	 * @param rollString the string to roll, e.g. 1d20 rolls one twenty sided die
	 * @return the total of the dice plus modifiers
	 */
	public int roll(Player roller, String rollString);

}
