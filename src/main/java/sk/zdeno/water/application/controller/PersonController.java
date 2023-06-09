package sk.zdeno.water.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sk.zdeno.water.application.dto.AddressDto;
import sk.zdeno.water.application.dto.PersonDto;
import sk.zdeno.water.domain.applicant.Address;
import sk.zdeno.water.domain.applicant.Person;
import sk.zdeno.water.domain.applicant.PersonId;
import sk.zdeno.water.domain.applicant.PersonRepository;

@RestController
@RequestMapping("/persons")
public class PersonController {
	@Autowired
	private PersonRepository personRepository;
	@Autowired
	private Mapper<Person,PersonDto> personMapper;
	@Autowired
	private Mapper<Address, AddressDto> addressMapper;

	@GetMapping("/{id}")
	public PersonDto getPerson(@PathVariable long id) {
		Person person = personRepository.read( new PersonId( id ));
		return personMapper.toDto(person);
	}

	@PostMapping
	public long createPerson(@RequestBody PersonDto personDto) {
		Person person = new Person( personDto.givenName, personDto.familyName, personDto.birthNumber );
		person.setAddress( addressMapper.fromDto( personDto.address ));
		personRepository.create(person);
		return person.getId();
	}


}
