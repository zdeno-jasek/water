package sk.zdeno.water.application.controller;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;
import sk.zdeno.water.application.dto.PersonDto;
import sk.zdeno.water.domain.applicant.Person;

@Component
class PersonDtoMapper {
    PersonDto toDto(Person person) {
        if (person == null) {
            return null;
        }
        PersonDto result = new PersonDto();
        result.id = person.getId() == null ? 0 : person.getId().getId();
        result.givenName = person.getGivenName();
        result.familyName = person.getFamilyName();
        result.birthNumber = person.getBirthNumber().getBirthNumber();
        return result;
    }

}
