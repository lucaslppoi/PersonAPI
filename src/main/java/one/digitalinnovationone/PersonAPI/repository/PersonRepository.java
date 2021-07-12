package one.digitalinnovationone.PersonAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import one.digitalinnovationone.PersonAPI.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
}
