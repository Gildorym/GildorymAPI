package com.gildorymrp.api.plugin.classes;

import java.util.Collection;
import java.util.Map;

import org.bukkit.entity.Player;

import com.gildorymrp.api.plugin.classes.Class;
import com.gildorymrp.api.plugin.core.Character;
import com.gildorymrp.api.plugin.core.Skill;

/**
 * Represents a classes plugin
 * @author Lucariatias
 *
 */
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
	 * Gets the total experience a character has on their current class
	 * 
	 * @param character the character
	 * @return the total experience the character has in their current class
	 */
	public int getTotalExperience(Character character);
	
	/**
	 * Sets the total experience of a character in their current class
	 * 
	 * @param character the character
	 * @param amount the amount of experience to set
	 */
	public void setTotalExperience(Character character, int amount);
	
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
	 * Gets the experience towards the next level of a character in their current class
	 * 
	 * @param character the character
	 * @return the experience of the character towards the next level in their current class
	 */
	public int getExperienceTowardsNextLevel(Character character);
	
	/**
	 * Sets the experience towards the next level of a character in their current class
	 * 
	 * @param character the character
	 * @param amount the amount of experience to set
	 */
	public void setExperienceTowardsNextLevel(Character character, int amount);
	
	/**
	 * Gets the experience towards the next level of a character in a given class
	 * 
	 * @param character the character
	 * @param clazz the class
	 * @return the experience of the character towards the next level in the given class
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
	 * Gives a character an amount of experience in their current class
	 * 
	 * @param character the character
	 * @param amount the amount of experience to give
	 */
	public void giveExperience(Character character, int amount);
	
	/**
	 * Gives a character an amount of experience in a given class
	 * 
	 * @param character the character
	 * @param clazz the class
	 * @param amount the amount of experience to give
	 */
	public void giveExperience(Character character, Class clazz, int amount);
	
	/**
	 * Gets the HP bonus given by a particular class
	 * 
	 * @param clazz the class
	 * @return the HP bonus given by that class
	 */
	public int getHpBonus(Class clazz);
	
	/**
	 * Gets a map of levels to a collection containing the skills they grant for a given class
	 * 
	 * @param clazz the class
	 * @return a map of levels to a collection containing the skills they grant
	 */
	public Map<Integer, Collection<Skill>> getGrantedSkills(Class clazz);
	
	/**
	 * Gets the maximum level a character of a given class may reach
	 * 
	 * @param clazz the class
	 * @return the maximum level a character of the given class may reach
	 */
	public int getMaxLevel(Class clazz);
	
	/**
	 * Gets the class skill modifier for a given class
	 * 
	 * @param clazz the class
	 * @return the class skill modifier
	 */
	public int getClassSkillModifier(Class clazz);
	
	/**
	 * Gets the good base save bonus at a given level
	 * 
	 * @param level the level
	 * @return the good base save bonus at the level
	 */
	public int getBaseSaveBonusGood(int level);
	
	/**
	 * Gets the poor base save bonus at a given level
	 * 
	 * @param level the level
	 * @return the poor base save bonus at the level
	 */
	public int getBaseSaveBonusPoor(int level);
	
	/**
	 * Gets the good base attack bonus at a given level
	 * 
	 * @param level the level
	 * @return the good base attack bonus at the level
	 */
	public int getBaseAttackBonusGood(int level);
	
	/**
	 * Gets the average base attack bonus at a given level
	 * 
	 * @param level the level
	 * @return the average base attack bonus at the level
	 */
	public int getBaseAttackBonusAverage(int level);
	
	/**
	 * Gets the poor base attack bonus at a given level
	 * 
	 * @param level the level
	 * @return the poor base attack bonus at the level
	 */
	public int getBaseAttackBonusPoor(int level);
	
	/**
	 * Gets the maximum class skills at a given level
	 * 
	 * @param level the level
	 * @return the maximum class skills at the level
	 */
	public int getMaxClassSkill(int level);
	
	/**
	 * Gets the maximum cross class skills at a given level
	 * 
	 * @param level the level
	 * @return the maximum cross class skills at the level
	 */
	public int getMaxCrossClassSkill(int level);
	
	/**
	 * Gets the attack bonus of a given class at the given level
	 * 
	 * @param clazz the class
	 * @param level the level
	 * @return the class' attack bonus
	 */
	public int getAttackBonus(Class clazz, int level);
	
	/**
	 * Gets the fortitude save of the given class at the given level
	 * 
	 * @param clazz the class
	 * @param level the level
	 * @return the fortitude save of the class
	 */
	public int getFortitudeSave(Class clazz, int level);
	
	/**
	 * Gets the reflex save of a given class at a given level
	 * 
	 * @param clazz the class
	 * @param level the level
	 * @return the reflex save of the class
	 */
	public int getReflexSave(Class clazz, int level);
	
	/**
	 * Gets the will save of a given class at a given level
	 * 
	 * @param clazz the class
	 * @param level the level
	 * @return the will save of the class
	 */
	public int getWillSave(Class clazz, int level);
	
	/**
	 * Gets the maximum skills for a character
	 * 
	 * @param character the character
	 * @return the maximum skills
	 */
	public int maxSkills(Character character);
	
	/**
	 * Gets whether a skill is a class skill for a given class
	 * 
	 * @param clazz the class
	 * @param skill the skill
	 * @return true if the skill is a class skill for the given class, false if the skill is a cross-class skill
	 */
	public boolean isClassSkill(Class clazz, Skill skill);
	
	/**
	 * Gets the total experience required from level one to reach the given level
	 * 
	 * @param level the level
	 * @return the experience to get to the level
	 */
	public int getTotalExperienceForLevel(int level);
	
	/**
	 * Gets the total amount of experience required to get to the next level, from the start of the given level
	 * 
	 * @param level the current level
	 * @return the experience required at this level to reach the next
	 */
	public int getExpToNextLevel(int level);

}
