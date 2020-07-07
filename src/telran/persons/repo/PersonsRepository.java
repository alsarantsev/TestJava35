package telran.persons.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import telran.persons.dto.Person;

@Repository // we could not indicate this annotation, but in means that will be create a new bean
/* in databases framework spring-boot we have interface MongoRepository with methods (for example 
 * how to put our object to database) that help us create a new beans, but do it himself. 
 * Our interface don't have anything! 
 */
public interface PersonsRepository extends MongoRepository<Person, Integer> {
	
}
