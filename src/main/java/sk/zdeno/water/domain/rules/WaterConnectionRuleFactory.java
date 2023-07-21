package sk.zdeno.water.domain.rules;

import sk.zdeno.water.domain.applicant.PersonRepository;
import sk.zdeno.water.domain.waterconnection.WaterConnectionRule;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class WaterConnectionRuleFactory {


    private final PersonRepository personRepository;

    public WaterConnectionRuleFactory(PersonRepository personRepository) {
        this.personRepository = Objects.requireNonNull( personRepository, "personRepository" );
    }

    public Collection<WaterConnectionRule> create() {
        return Arrays.asList( new RulePersonValid( personRepository ), new RuleConnectionTypeMandatory() );
    }
}
