package com.gildorymrp.api.core;

import com.gildorymrp.api.core.Character;

/**
 * Represents a feat
 * @author Lucariatias
 *
 */
public interface Feat {
	
	/**
	 * Gets the description of the feat
	 * 
	 * @return the description of the feat
	 */
	public String getDescription();
	
	/**
	 * Gets whether a given character has the prerequisites to use this feat
	 * 
	 * @param character the character
	 * @return true if the character has the prerequisites, otherwise false
	 */
	public boolean hasPrerequisites(Character character);
	
	/**
	 * Gets whether the feat is a fighter bonus feat
	 * 
	 * @return true if the feat is a fighter bonus feat, otherwise false
	 */
	public boolean isFighterBonusFeat();

}
