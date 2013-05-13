package com.gildorymrp.api.plugin.lock;

import java.util.Collection;

import org.bukkit.block.Block;

import com.gildorymrp.api.plugin.core.Character;

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
	 * Sets a block's locked state
	 * 
	 * @param block the block
	 * @param lock whether the block is locked or not
	 */
	public void setLocked(Block block, boolean lock);
	
	/**
	 * Gets the owner of a block
	 * 
	 * @param block the block
	 * @return the character, or null if the block is not locked
	 */
	public Character getOwner(Block block);
	
	/**
	 * Sets the owner of a block
	 * 
	 * @param block the block
	 * @param owner the owner of the block
	 */
	public void setOwner(Block block, Character owner);
	
	/**
	 * Gets a collection of the characters who can access this block
	 * 
	 * @return a collection of characters who can access this block
	 */
	public Collection<Character> getAccessors();

}
