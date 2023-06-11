package sk.zdeno.water.domain.process;

import sk.zdeno.water.domain.events.DomainEvent;
import sk.zdeno.water.domain.events.DomainEventSubscriber;

/**
 */
public class SendNotification implements DomainEventSubscriber {

	private EmailNotification notification;

	/**
	 */
	public SendNotification(EmailNotification emailNotification){

	}

	/**
	 */
	public void handle(DomainEvent domainEvent){

	}

}