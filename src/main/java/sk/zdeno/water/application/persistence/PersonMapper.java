package sk.zdeno.water.application.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sk.zdeno.water.domain.applicant.Address;
import sk.zdeno.water.domain.applicant.Person;

@Component
final class PersonMapper {
    @Autowired
    private AddressMapper addressMapper;

    PersonJpa toJpa(Person person) {
        if ( person == null ) {
            return null;
        }
        PersonJpa result = new PersonJpa();
        result.id = person.getId() == null ? 0 : person.getId().getId();
        result.birthNumber = person.getBirthNumber() == null ? null : person.getBirthNumber().getBirthNumber();
        result.familyName = person.getFamilyName();
        result.givenName = person.getGivenName();
        result.address = addressMapper.toJpa( person.getAddress() );
        return result;
    }

    public Person fromJpa(PersonJpa personJpa) {
        if ( personJpa == null ) {
            return null;
        }
        Person result = new Person( personJpa.givenName, personJpa.familyName, personJpa.birthNumber);
        result.setId(personJpa.id);
        result.setAddress( addressMapper.fromJpa( personJpa.address ) );

        return result;
    }
}
