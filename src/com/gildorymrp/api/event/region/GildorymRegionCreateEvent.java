package com.gildorymrp.api.event.region;

import org.bukkit.event.Cancellable;

import com.gildorymrp.api.plugin.regions.Region;

/**
 * Called when a region is created
 * @author Lucariatias
 *
 */
public class GildorymRegionCreateEvent extends GildorymRegionEvent implements Cancellable {

	private boolean cancel;
	
	public GildorymRegionCreateEvent(final Region region) {
		super(region);
	}

	@Override
	public boolean isCancelled() {
		return cancel;
	}

	@Override
	public void setCancelled(boolean cancel) {
		this.cancel = cancel;
	}

}
