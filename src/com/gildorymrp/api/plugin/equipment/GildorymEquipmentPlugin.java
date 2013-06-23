package com.gildorymrp.api.plugin.equipment;

import org.bukkit.inventory.ItemStack;

/**
 * Represents an equipment plugin
 * @author Lucariatias
 *
 */
public interface GildorymEquipmentPlugin {
	
	/**
	 * Creates a new DnDItemStack with all fields empty
	 * 
	 * @return a new DnDItemStack
	 */
	public DnDItemStack createItemStack();
	
	/**
	 * Creates a new DnDItemStack of a given material and amount
	 * 
	 * @param type the DnD material
	 * @param amount the amount of items in the stack
	 * @return a new DnDItemStack of the given material and amount
	 */
	public DnDItemStack createItemStack(DnDMaterial type, int amount);
	
	/**
	 * Attempts to convert a Bukkit ItemStack into a DnDItemStack
	 * 
	 * @param itemStack the bukkit itemstack
	 * @return the DnDItemStack
	 */
	public DnDItemStack fromItemStack(ItemStack itemStack);
	
	/**
	 * Converts a DnDItemStack into a Bukkit ItemStack, setting lore and name automatically
	 * 
	 * @param itemStack the DnDItemStack
	 * @return the Bukkit ItemStack
	 */
	public ItemStack toItemStack(DnDItemStack itemStack);

}
