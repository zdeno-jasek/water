package sk.zdeno.water.application.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sk.zdeno.water.domain.applicant.Person;

@Repository
interface PersonRepositorySpring extends JpaRepository<Person, Long> {
}
