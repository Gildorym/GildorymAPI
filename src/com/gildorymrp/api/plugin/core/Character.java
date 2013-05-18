package com.gildorymrp.api.plugin.core;

import java.util.Collection;
import java.util.Map;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * Represents a character
 * @author Lucariatias
 *
 */
public interface Character {
	
	/**
	 * Gets the player currently playing this character
	 * 
	 * @return the player currently playing this character, or null if this character is not being played
	 */
	public Player getPlayer();
	
	/**
	 * Sets the player currently playing this character
	 * 
	 * @param player the player to set, or null if no player is playing this character
	 */
	public void setPlayer(Player player);
	
	/**
	 * Gets the alignment of the character
	 * 
	 * @return the alignment
	 */
	public Alignment getAlignment();
	
	/**
	 * Sets the alignment of the character
	 * 
	 * @param alignment the alignment to set
	 */
	public void setAlignment(Alignment alignment);
	
	/**
	 * Gets the health of the character
	 * 
	 * @return the health
	 */
	public int getHealth();
	
	/**
	 * Sets the health of the character
	 * 
	 * @param health the health to set
	 */
	public void setHealth(int health);
	
	/**
	 * Gets the max health of the character
	 * 
	 * @return the max health
	 */
	public int getMaxHealth();
	
	/**
	 * Sets the max health of the character
	 * 
	 * @param maxHealth the max health to set
	 */
	public void setMaxHealth(int maxHealth);
	
	/**
	 * Gets the location of the character
	 * 
	 * @return the location of the character
	 */
	public Location getLocation();
	
	/**
	 * Sets the location of the character
	 * 
	 * @param location the location to set
	 */
	public void setLocation(Location location);
	
	/**
	 * Gets the inventory contents of this character
	 * 
	 * @return an array of itemstacks containing the inventory contents of this character
	 */
	public ItemStack[] getInventoryContents();
	
	/**
	 * Sets the inventory contents of this character
	 * 
	 * @param contents the contents to set
	 */
	public void setInventoryContents(ItemStack[] contents);
	
	/**
	 * Gets the skill points of the character
	 * 
	 * @return the skill points
	 */
	public int getSkillPoints();
	
	/**
	 * Sets the skill points of the character
	 * 
	 * @param points the skill points to set
	 */
	public void setSkillPoints(int points);
	
	/**
	 * Gets a map of skills to the amount of points that have been spent on upgrading the skill on this character
	 * 
	 * @return a map of skills to the amount of points that have been used on each skill on this character
	 */
	public Map<Skill, Integer> getSkills();
	
	/**
	 * Adds skill points to the given skill from the character's skill points
	 * 
	 * @param skill the skill
	 * @param amount the amount to assign to the skill
	 * @return whether successful
	 */
	public boolean addSkillPoints(Skill skill, int amount);
	
	/**
	 * Gets a collection containing the feats this character has
	 * 
	 * @return a collection of the feats obtained by this character
	 */
	public Collection<Feat> getFeats();
	
	/**
	 * Gets the character's strength
	 * 
	 * @return the strength
	 */
	public int getStrength();
	
	/**
	 * Gets the character's dexterity
	 * 
	 * @return the dexterity
	 */
	public int getDexterity();
	
	/**
	 * Gets the character's constitution
	 * 
	 * @return the constitution
	 */
	public int getConstitution();
	
	/**
	 * Gets the character's intelligence
	 * 
	 * @return the intelligence
	 */
	public int getIntelligence();
	
	/**
	 * Gets the character's wisdom
	 * 
	 * @return the wisdom
	 */
	public int getWisdom();
	
	/**
	 * Gets the character's charisma
	 * 
	 * @return the charisma
	 */
	public int getCharisma();
	
	/**
	 * Gets the modifier for a stat
	 * 
	 * @param stat the stat
	 * @return the modifier for the stat
	 */
	public int getModifier(int stat);
	
	/**
	 * Recursively rolls the stats of this character
	 * 
	 * @param countdown the amount of times to roll stats before settling
	 */
	public void rollStats(int countdown);
	
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
