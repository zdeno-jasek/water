package sk.zdeno.water.application.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import sk.zdeno.water.domain.applicant.Person;
import sk.zdeno.water.domain.applicant.PersonId;
import sk.zdeno.water.domain.applicant.PersonRepository;

import java.util.Optional;

@Repository
class PersonRepositoryH2 implements PersonRepository {
    @Autowired
    private PersonRepositorySpring repository;
    @Autowired
    private PersonMapper personMapper;
    @Override
    public void create(Person person) {
        PersonJpa personJpa = personMapper.toJpa(person);
        repository.save(personJpa);
        person.setId( personJpa.id);
    }

    @Override
    public void update(Person person) {
        PersonJpa personJpa = personMapper.toJpa(person);
        repository.save(personJpa);
    }

    @Override
    public Person read(PersonId id) {
        Optional<PersonJpa> personJpa = repository.findById(id.getId());
        if (personJpa.isPresent()) {
            return personMapper.fromJpa( personJpa.get() );
        }
        return null;
    }

}
