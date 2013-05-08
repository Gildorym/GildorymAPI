package com.gildorymrp.api.regions;

import java.util.Collection;

import org.bukkit.Chunk;

public interface ChunkRegion {
	
	/**
	 * Gets the chunks that this region contains
	 * 
	 * @return a collection containing the chunks in this region
	 */
	public Collection<Chunk> getChunks();

}
