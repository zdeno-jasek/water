package sk.zdeno.water.application.infrastructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sk.zdeno.water.domain.events.DomainEvent;
import sk.zdeno.water.domain.events.DomainEventPublisher;

@Component
public class DomainEventPublisherMessaging implements DomainEventPublisher {
    @Override
    public void publish(DomainEvent domainEvent) {
        // TODO send message to message broker
    }
}
