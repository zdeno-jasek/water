package sk.zdeno.water.domain.waterconnection;

import java.time.LocalDateTime;

import sk.zdeno.water.domain.events.DomainEvent;

/**
 * A domain event that occurs when a WaterConnection object is created.
 */
public class WaterConnectionCreated implements DomainEvent {

	private WaterConnection waterConnection;

	public LocalDateTime getOccuredOn(){
		return null;
	}

}