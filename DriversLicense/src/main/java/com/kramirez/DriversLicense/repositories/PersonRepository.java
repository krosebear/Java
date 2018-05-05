package com.kramirez.DriversLicense.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.kramirez.DriversLicense.models.*;


@Repository
public interface PersonRepository extends CrudRepository<Person, Long>{
	List<Person> findAll();
	Person findOne(Long id);
}

