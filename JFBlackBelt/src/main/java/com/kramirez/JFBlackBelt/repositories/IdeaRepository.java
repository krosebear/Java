package com.kramirez.JFBlackBelt.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kramirez.JFBlackBelt.models.Idea;

@Repository
public interface IdeaRepository extends CrudRepository<Idea, Long> {
	List<Idea> findAll();
	List<Idea> findAllByOrderByLikesDesc();
	
}