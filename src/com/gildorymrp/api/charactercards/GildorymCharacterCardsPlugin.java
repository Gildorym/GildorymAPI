package com.gildorymrp.api.charactercards;

import org.bukkit.entity.Player;
import com.gildorymrp.api.core.Character;

/**
 * Represents a character cards plugin
 * @author Lucariatias
 *
 */
public interface GildorymCharacterCardsPlugin {
	
	/**
	 * Gets the character card of the player's active character
	 * 
	 * @param player the player
	 * @return the character card of the player's active character
	 */
	public CharacterCard getCharacterCard(Player player);
	
	/**
	 * Gets the character card of the given character
	 * 
	 * @param character the character
	 * @return the character's character card
	 */
	public CharacterCard getCharacterCard(Character character);
	
	/**
	 * Resets the player's active character's character card
	 * 
	 * @param player the player
	 */
	public void resetCharacterCard(Player player);
	
	/**
	 * Resets the character's character card
	 * 
	 * @param character the character
	 */
	public void resetCharacterCard(Character character);

}
