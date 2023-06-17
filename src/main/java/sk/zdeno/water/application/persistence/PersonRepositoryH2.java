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
    @Override
    public void create(Person person) {
        repository.save(person);
    }

    @Override
    public void update(Person person) {
        repository.save(person);
    }

    @Override
    public Person read(PersonId id) {
        Optional<Person> personJpa = repository.findById(id.getId());
        return personJpa.orElse(null);
    }

}
