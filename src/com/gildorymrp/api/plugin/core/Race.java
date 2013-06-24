package com.gildorymrp.api.plugin.core;

/**
 * An enum containing races
 * @author Lucariatias
 *
 */
public enum Race {
	
	DROW(0),
	DWARF(1),
	ELF(0),
	GNOME(1),
	HALFELF(0),
	HALFLING(1),
	HALFORC(0),
	HUMAN(0),
	UNKNOWN(0),
	OTHER(0);
	
	private final int sizeModifier;
	
	private Race(final int sizeModifier) {
		this.sizeModifier = sizeModifier;
	}
	
	/**
	 * Gets the size modifier of the race
	 * 
	 * @return the race's size modifier
	 */
	public int getSizeModifier() {
		return sizeModifier;
	}

}
