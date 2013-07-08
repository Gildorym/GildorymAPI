package com.gildorymrp.api.plugin.dungeon;

import java.util.Collection;

import org.bukkit.entity.Player;

import com.gildorymrp.api.plugin.regions.ProtectedRegion;

/**
 * Represents a dungeon
 * @author Lucariatias
 *
 */
public interface Dungeon {
	
	/**
	 * Gets a collection of the dungeon masters responsible for the dungeon
	 * 
	 * @return a collection containing the dungeon masters responsible for the dungeon
	 */
	public Collection<Player> getDungeonMasters();
	
	/**
	 * Adds a dungeon master to the dungeon masters responsible for this dungeon
	 * 
	 * @param dungeonMaster the dungeon master to add
	 */
	public void addDungeonMaster(Player dungeonMaster);
	
	/**
	 * Removes a dungeon master from the dungeon masters responsible for this dungeon
	 * 
	 * @param dungeonMaster the dungeon master to remove
	 */
	public void removeDungeonMaster(Player dungeonMaster);
	
	/**
	 * Gets a collection of the players playing in this dungeon
	 * 
	 * @return a collection containing the players playing this dungeon
	 */
	public Collection<Player> getPlayers();
	
	/**
	 * Adds a player to the players playing in this dungeon
	 * 
	 * @param player the player to add
	 */
	public void addPlayer(Player player);
	
	/**
	 * Removes a player from the players playing in this dungeon
	 * 
	 * @param player the player to remove
	 */
	public void removePlayer(Player player);
	
	/**
	 * Gets whether the dungeon is currently active or not
	 * 
	 * @return true if the dungeon is active, otherwise false
	 */
	public boolean isActive();
	
	/**
	 * Sets whether the dungeon is currently active or not
	 * 
	 * @param active true if the dungeon is being started, false if the dungeon is stopping
	 */
	public void setActive(boolean active);
	
	/**
	 * Gets the protected region this dungeon occupies
	 * 
	 * @return the region
	 */
	public ProtectedRegion getRegion();

}
