package sk.zdeno.water.domain.waterconnection;

import sk.zdeno.water.domain.events.DomainEventPublisher;

public final class WaterConnectionFactory {

	private final DomainEventPublisher publisher;
	private final ValidateAddress validateAddress;

	public WaterConnectionFactory(DomainEventPublisher publisher, ValidateAddress validateAddress){
		this.publisher = publisher;
		this.validateAddress = validateAddress;
	}

	public WaterConnection create(WaterConnectionBuilder applicationBuilder){
		return null;
	}

}