package com.gildorymrp.api.economy;

import org.bukkit.entity.Player;
import com.gildorymrp.api.core.Character;

public interface GildorymEconomyPlugin {
	
	/**
	 * Gets the money owned by a player's active character
	 * 
	 * @param player the player
	 * @return the money owned by the player's active character
	 */
	public int getMoney(Player player);
	
	/**
	 * Sets the money owned by a player's active character
	 * 
	 * @param player the player
	 * @param amount the amount to set
	 */
	public void setMoney(Player player, int amount);
	
	/**
	 * Gives money to a player's active character
	 * 
	 * @param player the player
	 * @param amount the amount to add
	 */
	public void addMoney(Player player, int amount);
	
	/**
	 * Transfers money from one player's character to another
	 * 
	 * @param takeFrom the player whose character the money should be taken from
	 * @param giveTo the player whose character the money should be given to
	 * @param amount the amount to transfer
	 */
	public void transferMoney(Player takeFrom, Player giveTo, int amount);
	
	/**
	 * Gets the money owned by a character
	 * 
	 * @param character the character
	 * @return the money owned by the character
	 */
	public int getMoney(Character character);
	
	/**
	 * Sets the money owned by a character
	 * 
	 * @param character the character
	 * @param amount the amount to set
	 */
	public void setMoney(Character character, int amount);
	
	/**
	 * Gives money to a character
	 * 
	 * @param character the character
	 * @param amount the amount to add
	 */
	public void addMoney(Character character, int amount);
	
	/**
	 * Transfers money from one character to another
	 * 
	 * @param takeFrom the character to take the money from
	 * @param giveTo the character to give the money to
	 * @param amount the amount to transfer
	 */
	public void transferMoney(Character takeFrom, Character giveTo, int amount);

}
