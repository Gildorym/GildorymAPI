package com.gildorymrp.api.plugin.deities;

import java.util.Collection;
import org.bukkit.entity.Player;

import com.gildorymrp.api.plugin.core.Character;

/**
 * Represents a deities plugin
 * @author Lucariatias
 *
 */
public interface GildorymDeitiesPlugin {
	
	/**
	 * Gets a player's active character's preferred deity
	 * 
	 * @param player the player
	 * @return the player's active character's preferred deity
	 */
	public Deity getPreferredDeity(Player player);
	
	/**
	 * Sets a player's active character's preferred deity
	 * 
	 * @param player the player
	 * @param deity the deity to set
	 */
	public void setPreferredDeity(Player player, Deity deity);
	
	/**
	 * Gets a deity by name
	 * 
	 * @param name the name
	 * @return the deity with the given name
	 */
	public Deity getDeity(String name);
	
	/**
	 * Gets a collection containing all the active deities
	 * 
	 * @return a collection containing all the active deities
	 */
	public Collection<Deity> getDeities();
	
	/**
	 * Gets the last time a player's active character prayed
	 * 
	 * @param player the player
	 * @return the last time the player's active character prayed (system time in milliseconds)
	 */
	public Long getLastPray(Player player);
	
	/**
	 * Gets a character's preferred deity
	 * 
	 * @param character the character
	 * @return the character's preferred deity
	 */
	public Deity getPreferredDeity(Character character);
	
	/**
	 * Sets a character's preferred deity
	 * 
	 * @param character the character
	 * @param deity the deity to set
	 */
	public void setPreferredDeity(Character character, Deity deity);
	
	/**
	 * Gets the last time a character prayed
	 * 
	 * @param character the character
	 * @return the last time a player's active character prayed (system time in milliseconds)
	 */
	public Long getLastPray(Character character);

}
