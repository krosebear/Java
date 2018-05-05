package com.kramirez.JavaSBB.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kramirez.JavaSBB.models.User;



@Repository
public interface UserRepo extends CrudRepository<User, Long> {
	List<User> findAll();
	User findByEmail(String email);
	User findById(Long id);
}
