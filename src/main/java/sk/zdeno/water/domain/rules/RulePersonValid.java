package sk.zdeno.water.domain.rules;

import sk.zdeno.water.domain.applicant.PersonRepository;
import sk.zdeno.water.domain.waterconnection.WaterConnectionBuilder;
import sk.zdeno.water.domain.waterconnection.WaterConnectionRule;

import java.util.Objects;

class RulePersonValid implements WaterConnectionRule {

    private final PersonRepository personRepository;

    public RulePersonValid(PersonRepository personRepository) {
        this.personRepository = Objects.requireNonNull( personRepository, "personRepository" );
    }
    @Override
    public boolean test(WaterConnectionBuilder waterConnectionBuilder) {
        if ( waterConnectionBuilder.getPersonId() == null ) {
            return true;
        }
        return personRepository.read( waterConnectionBuilder.getPersonId() ) != null;
    }

    @Override
    public String getErrorMessage(WaterConnectionBuilder waterConnectionBuilder) {
        return "Person is not valid";
    }
}
