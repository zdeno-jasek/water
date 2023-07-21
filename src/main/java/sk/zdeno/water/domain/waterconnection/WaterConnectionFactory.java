package sk.zdeno.water.domain.waterconnection;

import sk.zdeno.water.domain.datatypes.User;
import sk.zdeno.water.domain.events.DomainEventPublisher;

import java.util.Collection;

public final class WaterConnectionFactory {

	private final DomainEventPublisher publisher;
	private final Collection<WaterConnectionRule> waterConnectionRules;

	public WaterConnectionFactory(DomainEventPublisher publisher, Collection<WaterConnectionRule> rules){
		this.publisher = publisher;
		this.waterConnectionRules = rules;
	}

	public WaterConnection create(WaterConnectionBuilder waterConnectionBuilder) throws WaterConnectionException {
		Collection<String> errors = waterConnectionRules.stream()
				.filter( rule -> !rule.test( waterConnectionBuilder ) )
				.map( rule -> rule.getErrorMessage( waterConnectionBuilder ) )
				.toList();
		if ( !errors.isEmpty() ) {
			throw new WaterConnectionException( errors );
		}

		User user = waterConnectionBuilder.getCreatedBy();
		DeliveryPoint deliveryPoint = new DeliveryPoint(
				waterConnectionBuilder.getDeliveryParcel(),
				waterConnectionBuilder.getDeliveryProperty(),
				waterConnectionBuilder.getDeliveryArea(),
				waterConnectionBuilder.getDeliveryAddress()
		);
		Applicant applicant;
		if ( waterConnectionBuilder.getCompanyId() == null ) {
			applicant = new Applicant( waterConnectionBuilder.getPersonId() );
		} else {
			applicant = new Applicant( waterConnectionBuilder.getCompanyId() );
		}
		applicant.update( waterConnectionBuilder.getContact() );
		WaterConnection waterConnection = new WaterConnection( user, applicant, deliveryPoint, waterConnectionBuilder.getConnectionType() );
		waterConnection.setWaterSewerageType( waterConnectionBuilder.getWaterSewerageType() );
		waterConnection.setProjectStatus( waterConnectionBuilder.getProjectStatus() );
		WaterConnectionCreated waterConnectionCreated = new WaterConnectionCreated( waterConnection );
		publisher.publish( waterConnectionCreated );
		return waterConnection;
	}

}