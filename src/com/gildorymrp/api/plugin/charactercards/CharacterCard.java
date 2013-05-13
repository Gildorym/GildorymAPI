package com.gildorymrp.api.plugin.charactercards;

/**
 * Represents a character card
 * @author Lucariatias
 *
 */
public interface CharacterCard {
	
	/**
	 * Gets the name of the character this card corresponds to
	 * 
	 * @return the character's name
	 */
	public String getName();
	
	/**
	 * Sets the name of the character this card corresponds to
	 * 
	 * @param name the name to set
	 */
	public void setName(String name);
	
	/**
	 * Gets the age of the character this card corresponds to
	 * 
	 * @return the character's age
	 */
	public int getAge();
	
	/**
	 * Sets the age of the character this card corresponds to
	 * 
	 * @param age the age to set
	 */
	public void setAge(int age);
	
	/**
	 * Gets the gender of the character this card corresponds to
	 * 
	 * @return the character's gender
	 */
	public String getGender();
	
	/**
	 * Sets the gender of the character this card corresponds to
	 * 
	 * @param gender the gender to set
	 */
	public void setGender(Gender gender);
	
	/**
	 * Gets the race of the character this card corresponds to
	 * 
	 * @return the character's race
	 */
	public Race getRace();
	
	/**
	 * Sets the race of the character this card corresponds to
	 * 
	 * @param race the race to set
	 */
	public void setRace(Race race);
	
	/**
	 * Gets the description of the character this card corresponds to
	 * 
	 * @return the character's description
	 */
	public String getDescription();
	
	/**
	 * Sets the description of the character this card corresponds to
	 * 
	 * @param info the info to set
	 */
	public void setDescription(String info);
	
	/**
	 * Adds to the description of the character this card corresponds to
	 * 
	 * @param info the info to add
	 */
	public void addDescription(String info);

}
