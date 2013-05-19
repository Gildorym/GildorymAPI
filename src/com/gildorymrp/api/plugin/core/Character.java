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
	 * Gets the name of the character 
	 * 
	 * @return the character's name
	 */
	public String getName();
	
	/**
	 * Sets the name of the character 
	 * 
	 * @param name the name to set
	 */
	public void setName(String name);
	
	/**
	 * Gets the age of the character 
	 * 
	 * @return the character's age
	 */
	public int getAge();
	
	/**
	 * Sets the age of the character 
	 * 
	 * @param age the age to set
	 */
	public void setAge(int age);
	
	/**
	 * Gets the gender of the character 
	 * 
	 * @return the character's gender
	 */
	public Gender getGender();
	
	/**
	 * Sets the gender of the character 
	 * 
	 * @param gender the gender to set
	 */
	public void setGender(Gender gender);
	
	/**
	 * Gets the race of the character 
	 * 
	 * @return the character's race
	 */
	public Race getRace();
	
	/**
	 * Sets the race of the character 
	 * 
	 * @param race the race to set
	 */
	public void setRace(Race race);
	
	/**
	 * Gets the description of the character 
	 * 
	 * @return the character's description
	 */
	public String getDescription();
	
	/**
	 * Sets the description of the character 
	 * 
	 * @param info the info to set
	 */
	public void setDescription(String info);
	
	/**
	 * Adds to the description of the character 
	 * 
	 * @param info the info to add
	 */
	public void addDescription(String info);
	
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
	 * Sets the character's strength
	 * 
	 * @param strength the strength to set
	 */
	public void setStrength(int strength);
	
	/**
	 * Gets the character's dexterity
	 * 
	 * @return the dexterity
	 */
	public int getDexterity();
	
	/**
	 * Sets the character's dexterity
	 * 
	 * @param dexterity the dexterity to set
	 */
	public void setDexterity(int dexterity);
	
	/**
	 * Gets the character's constitution
	 * 
	 * @return the constitution
	 */
	public int getConstitution();
	
	/**
	 * Sets the character's constitution
	 * 
	 * @param constitution the constitution to set
	 */
	public void setConstitution(int constitution);
	
	/**
	 * Gets the character's intelligence
	 * 
	 * @return the intelligence
	 */
	public int getIntelligence();
	
	/**
	 * Sets the character's intelligence
	 * 
	 * @param intelligence the intelligence to set
	 */
	public void setIntelligence(int intelligence);
	
	/**
	 * Gets the character's wisdom
	 * 
	 * @return the wisdom
	 */
	public int getWisdom();
	
	/**
	 * Sets the character's wisdom
	 * 
	 * @param wisdom the wisdom to set
	 */
	public void setWisdom(int wisdom);
	
	/**
	 * Gets the character's charisma
	 * 
	 * @return the charisma
	 */
	public int getCharisma();
	
	/**
	 * Sets the character's charisma
	 * 
	 * @param charisma the charisma to set
	 */
	public void setCharisma(int charisma);
	
	/**
	 * Gets the modifier for a stat
	 * 
	 * @param stat the stat
	 * @return the modifier for the stat
	 */
	public int getModifier(int stat);
	
	/**
	 * Gets the character's attack bonus
	 * 
	 * @return the attack bonus
	 */
	public int getAttackBonus();
	
	/**
	 * Sets the character's attack bonus
	 * 
	 * @param attackBonus the attack bonus to set
	 */
	public void setAttackBonus(int attackBonus);
	
	/**
	 * Gets the maximum amount of skills this character may have
	 * 
	 * @return the max skills
	 */
	public int getMaxSkills();
	
	/**
	 * Sets the maximum amount of skills this character may have
	 * 
	 * @param maxSkills the max skills to set
	 */
	public void setMaxSkills(int maxSkills);
	
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
	 * Sets whether the character is dead or not
	 * 
	 * @param dead whether the character should be dead or not. Use false for resurrections and true when the character is killed.
	 */
	public void setDead(boolean dead);

}
