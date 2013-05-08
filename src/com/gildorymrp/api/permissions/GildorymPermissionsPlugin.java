package com.gildorymrp.api.permissions;

import org.bukkit.entity.Player;

public interface GildorymPermissionsPlugin {
	
	/**
	 * Gets the name of the group of which the player is in
	 * 
	 * @param player the player
	 * @return the name of the player's group
	 */
	public String getGroup(Player player);
	
	/**
	 * Sets a player's group to the one of the given name
	 * 
	 * @param player the player
	 * @param groupName the name of the group
	 */
	public void setGroup(Player player, String groupName);
	
	/**
	 * Adds a group to a player
	 * 
	 * @param player the player
	 * @param groupName the name of the group
	 */
	public void addGroup(Player player, String groupName);
	
	/**
	 * Checks if a player has a permission
	 * 
	 * @param player the player
	 * @param node the permissions node
	 * @return whether the player has permission
	 */
	public boolean hasPermission(Player player, String node);
	
	

}
