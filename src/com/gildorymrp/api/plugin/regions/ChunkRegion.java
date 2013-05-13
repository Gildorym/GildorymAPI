package com.gildorymrp.api.plugin.regions;

import java.util.Collection;

import org.bukkit.Chunk;

/**
 * Represents a region that occupies an area made up of chunks
 * @author Lucariatias
 *
 */
public interface ChunkRegion {
	
	/**
	 * Gets the chunks that this region contains
	 * 
	 * @return a collection containing the chunks in this region
	 */
	public Collection<Chunk> getChunks();

}
