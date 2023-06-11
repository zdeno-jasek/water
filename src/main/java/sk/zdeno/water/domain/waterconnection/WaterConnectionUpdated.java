package sk.zdeno.water.domain.waterconnection;

import java.time.LocalDateTime;

import sk.zdeno.water.domain.events.DomainEvent;

/**
 * The event occurs when the attributes in the WaterConnection object change.
 */
public class WaterConnectionUpdated implements DomainEvent {

	private WaterConnection beforeUpdate;
	private WaterConnection afterUpdate;

	public LocalDateTime getOccuredOn(){
		return null;
	}

}