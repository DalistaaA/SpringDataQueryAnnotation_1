package com.sgic.peopleManagement.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.sgic.peopleManagement.entities.Person;

public interface PersonRepository extends Repository<Person, Integer>{

	@Query(value="SELECT p FROM Person p WHERE p.lastName=?1")
	List<Person> PersonInfoByLastName(String lastName);
	
	@Query(value="SELECT p FROM Person p WHERE p.firstName=?1 AND email=?2")
	List<Person> getPersonInfoByFirstNameAndEmail(String firstName, String email);
	
}
