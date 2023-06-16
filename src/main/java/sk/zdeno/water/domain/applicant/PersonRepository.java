package sk.zdeno.water.domain.applicant;

public interface PersonRepository {

    void create(Person person);
    void update(Person person);
    Person read(PersonId id) throws NotFoundException;
}
