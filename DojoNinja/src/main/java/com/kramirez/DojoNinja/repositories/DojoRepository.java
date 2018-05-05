package com.kramirez.DojoNinja.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kramirez.DojoNinja.models.Dojo;
import com.kramirez.DojoNinja.models.Ninja;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long>{
	List<Dojo> findAll();
	Dojo findById(Long id);
}
