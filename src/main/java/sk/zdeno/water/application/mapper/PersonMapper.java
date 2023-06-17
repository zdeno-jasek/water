package sk.zdeno.water.application.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sk.zdeno.water.application.controller.Mapper;
import sk.zdeno.water.application.dto.PersonDto;
import sk.zdeno.water.domain.applicant.Person;

@Component
final class PersonMapper implements Mapper<Person, PersonDto> {
    @Autowired
    private AddressMapper addressMapper;

    public PersonDto toDto(Person person) {
        if (person == null) {
            return null;
        }
        PersonDto result = new PersonDto();
        result.id = person.getId();
        result.givenName = person.getGivenName();
        result.familyName = person.getFamilyName();
        result.birthNumber = person.getBirthNumber().getBirthNumber();
        result.address = addressMapper.toDto(person.getAddress());
        return result;
    }

    public Person fromDto(PersonDto personDto) {
        throw new UnsupportedOperationException("Use factory method to create new Person");
    }

}
