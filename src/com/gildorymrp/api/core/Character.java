package com.gildorymrp.api.core;

public interface Character {
	
	/**
	 * Gets whether the character is dead or not
	 * 
	 * @return true if the character is dead, otherwise false
	 */
	public boolean isDead();
	
	/**
	 * Resurrects this character
	 */
	public void resurrect();
	
	/**
	 * Kills this character
	 */
	public void kill();

}
