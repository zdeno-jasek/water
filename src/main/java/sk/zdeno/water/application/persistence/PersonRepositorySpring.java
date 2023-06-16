package sk.zdeno.water.application.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface PersonRepositorySpring extends JpaRepository<PersonJpa, Long> {
}
