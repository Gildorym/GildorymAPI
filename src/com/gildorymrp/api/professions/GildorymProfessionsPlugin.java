package com.gildorymrp.api.professions;

import org.bukkit.Material;
import org.bukkit.entity.Player;

import com.gildorymrp.api.core.Character;

/**
 * Represents a professions plugin
 * @author Lucariatias
 *
 */
public interface GildorymProfessionsPlugin {
	
	/**
	 * Gets the profession of a player's active character
	 * 
	 * @param player the player
	 * @return the profession of the player's active character
	 */
	public Profession getProfession(Player player);
	
	/**
	 * Gets the profession of a character
	 * 
	 * @param character the character
	 * @return the profession of the character
	 */
	public Profession getProfession(Character character);
	
	/**
	 * Gets whether a player can craft the given material
	 * 
	 * @param player the player
	 * @param material the material
	 * @return true if the player can craft the material, otherwise false
	 */
	public boolean canCraft(Player player, Material material);
	
	/**
	 * Gets whether a player can smelt the given material
	 * 
	 * @param player the player
	 * @param material the material
	 * @return true if the player can smelt the material, otherwise false
	 */
	public boolean canSmelt(Player player, Material material);
	
	/**
	 * Gets whether a player can use the given material
	 * 
	 * @param player the player
	 * @param material the material
	 * @return true if the player can use the material, otherwise false
	 */
	public boolean canUse(Player player, Material material);
	
	/**
	 * Gets whether a player can interact with the given material
	 * 
	 * @param player the player
	 * @param material the material
	 * @return true if the player can use the material, otherwise false
	 */
	public boolean canInteract(Player player, Material material);
	
	/**
	 * Gets whether a profession can craft the given material
	 * 
	 * @param profession the profession
	 * @param material the material
	 * @return true if the profession can craft the material, otherwise false
	 */
	public boolean canCraft(Profession profession, Material material);
	
	/**
	 * Gets whether a profession can smelt the given material
	 * 
	 * @param profession the profession
	 * @param material the material
	 * @return true if the profession can smelt the material, otherwise false
	 */
	public boolean canSmelt(Profession profession, Material material);
	
	/**
	 * Gets whether a profession can use the given material
	 * 
	 * @param profession the profession
	 * @param material the material
	 * @return true if the profession can use the material, otherwise false
	 */
	public boolean canUse(Profession profession, Material material);
	
	/**
	 * Gets whether a profession can interact with the given material
	 * 
	 * @param profession the profession
	 * @param material the material
	 * @return true if the profession can use the material, otherwise false
	 */
	public boolean canInteract(Profession profession, Material material);

}
