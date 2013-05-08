package com.gildorymrp.api.lock;

import java.util.Collection;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;

/**
 * Represents a lock plugin
 * @author Lucariatias
 *
 */
public interface GildorymLockPlugin {
	
	/**
	 * Checks whether the block is locked
	 * 
	 * @param block the block
	 * @return true if the block is locked, otherwise false
	 */
	public boolean isLocked(Block block);
	
	/**
	 * Gets the owner of a block
	 * 
	 * @param block the block
	 * @return the player, or null if the block is not locked
	 */
	public Player getOwner(Block block);
	
	/**
	 * Gets a collection of the players who can access this block
	 * 
	 * @return a collection of players who can access this block
	 */
	public Collection<Player> getAccessors();

}
