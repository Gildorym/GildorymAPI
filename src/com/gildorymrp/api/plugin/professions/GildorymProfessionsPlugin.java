package com.gildorymrp.api.plugin.professions;

import org.bukkit.entity.Player;

import com.gildorymrp.api.plugin.core.Character;
import com.gildorymrp.api.plugin.equipment.DnDMaterial;

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
	 * Sets the profession of a player's active character
	 * 
	 * @param player the player
	 * @param profession the profession to set
	 */
	public void setProfession(Player player, Profession profession);
	
	/**
	 * Sets the profession of a character
	 * 
	 * @param character the character
	 * @param profession the profession to set
	 */
	public void setProfession(Character character, Profession profession);
	
	/**
	 * Gets whether a player can craft the given material
	 * 
	 * @param player the player
	 * @param material the material
	 * @return true if the player can craft the material, otherwise false
	 */
	public boolean canCraft(Player player, DnDMaterial material);
	
	/**
	 * Gets whether a player can smelt the given material
	 * 
	 * @param player the player
	 * @param material the material
	 * @return true if the player can smelt the material, otherwise false
	 */
	public boolean canSmelt(Player player, DnDMaterial material);
	
	/**
	 * Gets whether a player can use the given material
	 * 
	 * @param player the player
	 * @param material the material
	 * @return true if the player can use the material, otherwise false
	 */
	public boolean canUse(Player player, DnDMaterial material);
	
	/**
	 * Gets whether a player can interact with the given material
	 * 
	 * @param player the player
	 * @param material the material
	 * @return true if the player can use the material, otherwise false
	 */
	public boolean canInteract(Player player, DnDMaterial material);
	
	/**
	 * Gets whether a character can craft the given material
	 * 
	 * @param character the character
	 * @param material the material
	 * @return true if the character can craft the material, otherwise false
	 */
	public boolean canCraft(Character character, DnDMaterial material);
	
	/**
	 * Gets whether a character can smelt the given material
	 * 
	 * @param character the character
	 * @param material the material
	 * @return true if the character can smelt the material, otherwise false
	 */
	public boolean canSmelt(Character character, DnDMaterial material);
	
	/**
	 * Gets whether a character can use the given material
	 * 
	 * @param character the character
	 * @param material the material
	 * @return true if the character can use the material, otherwise false
	 */
	public boolean canUse(Character character, DnDMaterial material);
	
	/**
	 * Gets whether a character can interact with the given material
	 * 
	 * @param character the character
	 * @param material the material
	 * @return true if the character can use the material, otherwise false
	 */
	public boolean canInteract(Character character, DnDMaterial material);
	
	/**
	 * Gets whether a profession can craft the given material
	 * 
	 * @param profession the profession
	 * @param material the material
	 * @return true if the profession can craft the material, otherwise false
	 */
	public boolean canCraft(Profession profession, DnDMaterial material);
	
	/**
	 * Gets whether a profession can smelt the given material
	 * 
	 * @param profession the profession
	 * @param material the material
	 * @return true if the profession can smelt the material, otherwise false
	 */
	public boolean canSmelt(Profession profession, DnDMaterial material);
	
	/**
	 * Gets whether a profession can use the given material
	 * 
	 * @param profession the profession
	 * @param material the material
	 * @return true if the profession can use the material, otherwise false
	 */
	public boolean canUse(Profession profession, DnDMaterial material);
	
	/**
	 * Gets whether a profession can interact with the given material
	 * 
	 * @param profession the profession
	 * @param material the material
	 * @return true if the profession can use the material, otherwise false
	 */
	public boolean canInteract(Profession profession, DnDMaterial material);

}
