package com.gildorymrp.api.classes;

import org.bukkit.entity.Player;

import com.gildorymrp.api.classes.Class;
import com.gildorymrp.api.core.Character;

public interface GildorymClassesPlugin {
	
	/**
	 * Gets a player's active character's class
	 * 
	 * @param player the player
	 * @return the player's active character's class
	 */
	public Class getClass(Player player);
	
	/**
	 * Sets the class of a player's active character
	 * 
	 * @param player the player
	 * @param clazz the class to set
	 */
	public void setClass(Player player, Class clazz);
	
	/**
	 * Gets the level of the player's active character in their current class
	 * 
	 * @param player the player
	 * @return the level of the player's current character in their current class
	 */
	public int getLevel(Player player);
	
	/**
	 * Sets the level of the player's active character in their current class
	 * 
	 * @param player the player
	 * @param level the level to set
	 */
	public void setLevel(Player player, int level);
	
	/**
	 * Gets the total experience a player's active character has on their current class
	 * 
	 * @param player the player
	 * @return the total experience of the player's active character in their current class
	 */
	public int getTotalExperience(Player player);
	
	/**
	 * Sets the total experience a player's active character has on their current class
	 * 
	 * @param player the player
	 * @param amount the amount of experience to set
	 */
	public void setTotalExperience(Player player, int amount);
	
	/**
	 * Gets the experience a player's active character has in their current class towards their next level
	 * 
	 * @param player the player
	 * @return the experience the player's active character has in their current class towards their next level
	 */
	public int getExperienceTowardsNextLevel(Player player);
	
	/**
	 * Sets the experience a player's active character has in their current class towards their next level
	 * 
	 * @param player the player
	 * @param amount the amount of experience
	 */
	public void setExperienceTowardsNextLevel(Player player, int amount);
	
	/**
	 * Gives the player's active character an amount of experience in their current class
	 * 
	 * @param player the player
	 * @param amount the amount of experience to give
	 */
	public void giveExperience(Player player, int amount);
	
	/**
	 * Gets the level of a player's active character in a given class
	 * 
	 * @param player the player
	 * @param clazz the class
	 * @return the player's level in the given class
	 */
	public int getLevel(Player player, Class clazz);
	
	/**
	 * Sets the level of the player's active character in a given class
	 * 
	 * @param player the player
	 * @param clazz the class
	 * @param level the level to set
	 */
	public void setLevel(Player player, Class clazz, int level);
	
	/**
	 * Gets the total experience of a player's active character in a given class
	 * 
	 * @param player the player
	 * @param clazz the class
	 * @return the total experience the player's active character has in the given class
	 */
	public int getTotalExperience(Player player, Class clazz);
	
	/**
	 * Sets the total experience of a player's active character in a given class
	 * 
	 * @param player the player
	 * @param clazz the class
	 * @param amount the amount of experience to set
	 */
	public void setTotalExperience(Player player, Class clazz, int amount);
	
	/**
	 * Gets the experience towards the next level of a player's active character in a given class
	 * 
	 * @param player the player
	 * @param clazz the class
	 * @return the experience of the player's active character in the given class
	 */
	public int getExperienceTowardsNextLevel(Player player, Class clazz);
	
	/**
	 * Sets the experience towards the next level of a player's active character in a given class
	 * 
	 * @param player the player
	 * @param clazz the class
	 * @param amount the amount of experience to set
	 */
	public void setExperienceTowardsNextLevel(Player player, Class clazz, int amount);
	
	/**
	 * Gives the player's active character an amount of experience in a given class
	 * 
	 * @param player the player
	 * @param clazz the class
	 * @param amount the amount of experience to give
	 */
	public void giveExperience(Player player, Class clazz, int amount);
	
	/**
	 * Gets a character's class
	 * 
	 * @param character the character
	 * @return the character's class
	 */
	public Class getClass(Character character);
	
	/**
	 * Sets the class of a character
	 * 
	 * @param character the character
	 * @param clazz the class to set
	 */
	public void setClass(Character character, Class clazz);
	
	/**
	 * Gets the level of a character in their current class
	 * 
	 * @param character the character
	 * @return the level of the character in their current class
	 */
	public int getLevel(Character character);
	
	/**
	 * Sets the level of a character in their current class
	 * 
	 * @param character the character
	 * @param level the level to set
	 */
	public void setLevel(Character character, int level);
	
	/**
	 * Gets the level of a character in a given class
	 * 
	 * @param character the character
	 * @param clazz the class
	 * @return the player's level in the given class
	 */
	public int getLevel(Character character, Class clazz);
	
	/**
	 * Sets the level of a character in a given class
	 * 
	 * @param character the character
	 * @param clazz the class
	 * @param level the level to set
	 */
	public void setLevel(Character character, Class clazz, int level);
	
	/**
	 * Gets the total experience of a character in a given class
	 * 
	 * @param character the character
	 * @param clazz the class
	 * @return the total experience the character has in the given class
	 */
	public int getTotalExperience(Character character, Class clazz);
	
	/**
	 * Sets the total experience of a character in a given class
	 * 
	 * @param character the character
	 * @param clazz the class
	 * @param amount the amount of experience to set
	 */
	public void setTotalExperience(Character character, Class clazz, int amount);
	
	/**
	 * Gets the experience towards the next level of a character in a given class
	 * 
	 * @param character the character
	 * @param clazz the class
	 * @return the experience of the player's active character in the given class
	 */
	public int getExperienceTowardsNextLevel(Character character, Class clazz);
	
	/**
	 * Sets the experience towards the next level of a character in a given class
	 * 
	 * @param character the character
	 * @param clazz the class
	 * @param amount the amount of experience to set
	 */
	public void setExperienceTowardsNextLevel(Character character, Class clazz, int amount);
	
	/**
	 * Gives a character an amount of experience in a given class
	 * 
	 * @param character the character
	 * @param clazz the class
	 * @param amount the amount of experience to give
	 */
	public void giveExperience(Character character, Class clazz, int amount);

}
