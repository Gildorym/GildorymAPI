package com.gildorymrp.api.moderation;

import java.util.Collection;
import java.util.Date;
import java.util.Map;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public interface GildorymModerationPlugin {
	
	/**
	 * Gets a map of dates to the type of material which the block in question changed to at the given date.
	 * 
	 * @param block the block to get material changes for
	 * @return a map of dates to materials at the given date
	 */
	public Map<Date, Material> getBlockMaterialChanges(Block block);
	
	/**
	 * Gets a map of dates to the data associated with the block at the given date. 
	 * 
	 * @param block the block to get the data changes for
	 * @return a map of the dates to the data at the given date
	 */
	public Map<Date, Byte> getBlockDataChanges(Block block);
	
	/**
	 * Gets a map of dates to the content changes
	 * 
	 * @param inventory
	 * @return
	 */
	public Map<Date, ItemStack> getInventoryContentChanges(Inventory inventory);
	
	/**
	 * Gets a block's material at a given time
	 * 
	 * @param block the block to get the material of
	 * @param date the date to get the material of the block at
	 * @return the block's material at the given date
	 */
	public Material getBlockMaterialAtTime(Block block, Date date);
	
	/**
	 * Gets a block's data at a given time
	 * 
	 * @param block the block to check the data of
	 * @param date the date to get the data at
	 * @return the block's data at the given date
	 */
	public Byte getBlockDataAtTime(Block block, Date date);
	
	/**
	 * Gets an inventory's contents at a given time
	 * 
	 * @param inventory the inventory to get the contents of
	 * @param date the date to get the contents at
	 * @return an array containing the contents of the inventory at the given date
	 */
	public ItemStack[] getInventoryContentsAtTime(Inventory inventory, Date date);
	
	/**
	 * Returns whether a player is vanished
	 * 
	 * @param player the player to check
	 * @return true if the player is vanished, false if the player is visible
	 */
	public boolean isVanished(Player player);
	
	/**
	 * Sets whether a player is vanished
	 * 
	 * @param player the player
	 * @param vanished the vanished state to set the player to
	 */
	public void setVanished(Player player, boolean vanished);
	
	/**
	 * Gets the warnings a player has recieved
	 * 
	 * @return a collection of the warnings
	 */
	public Collection<String> getWarnings(Player player);
	
	/**
	 * Adds a warning to the player
	 * 
	 * @param player the player to add a warning to
	 * @param warning the warning to add
	 */
	public void addWarning(Player player, String warning);
	
	/**
	 * Gets the tickets filed
	 * 
	 * @return a collection of all the tickets filed
	 */
	public Collection<String> getTickets();
	
	/**
	 * Gets the tickets filed by a specific player
	 * 
	 * @param player the player to get tickets from
	 * @return a collection of the tickets filed by the given player
	 */
	public Collection<String> getTickets(Player player);
	
	/**
	 * Files a ticket
	 * 
	 * @param player the player who is filing the ticket
	 * @param ticket a string containing the ticket information
	 */
	public void addTicket(Player player, String ticket);

}
