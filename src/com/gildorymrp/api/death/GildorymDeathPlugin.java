package com.gildorymrp.api.death;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * Represents a death management plugin
 * @author Lucariatias
 *
 */
public interface GildorymDeathPlugin {
	
	/**
	 * Gets an array of itemstacks containing the contents of the player's inventory when they died.
	 * If they have not died or if they have reclaimed their items, this should return an empty array.
	 * 
	 * @param player the player
	 * @return an array of itemstacks containing the contents of their inventory the last time they died. If they have not died, or have reclaimed their items, this should return an empty array.
	 */
	public ItemStack[] getDeathInventory(Player player);
	
	/**
	 * Restores the items a player lost on death back to the player
	 * 
	 * @param player the player
	 */
	public void restoreItems(Player player);

}
