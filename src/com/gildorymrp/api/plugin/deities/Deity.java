package com.gildorymrp.api.plugin.deities;

import java.util.Collection;
import java.util.Map;

import com.gildorymrp.api.plugin.core.Character;

/**
 * Represents a deity
 * @author Lucariatias
 *
 */
public interface Deity {
	
	/**
	 * Gets the name of this deity
	 * 
	 * @return the name
	 */
	public String getName();
	
	/**
	 * Sets the name of this deity
	 * 
	 * @param name the name to set
	 */
	public void setName(String name);
	
	/**
	 * Gets a collection containing the worshippers of this deity
	 * 
	 * @return a collection of this deity's worshippers
	 */
	public Collection<Character> getWorshippers();
	
	/**
	 * Gets the power of the deity
	 * 
	 * @return this deity's power
	 */
	public int getPower();
	
	/**
	 * Sets the power of the deity
	 * 
	 * @param power the power to set
	 */
	public void setPower(int power);
	
	/**
	 * Gets a map of each worshipper of this deity to the amount of times they have prayed
	 * 
	 * @return a map of players to the times the player has prayed to this deity
	 */
	public Map<Character, Integer> getPrayers();
	
	/**
	 * Gets the high priest of this deity (if any)
	 * 
	 * @return the high priest of this deity, or null if none
	 */
	public Character getHighPriest();
	
	/**
	 * Sets the high priest of this deity
	 * 
	 * @param priest the high priest to set
	 */
	public void setHighPriest(Character priest);

}
