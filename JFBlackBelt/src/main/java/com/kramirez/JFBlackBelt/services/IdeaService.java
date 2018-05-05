package com.kramirez.JFBlackBelt.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kramirez.JFBlackBelt.models.Idea;
import com.kramirez.JFBlackBelt.models.User;
import com.kramirez.JFBlackBelt.repositories.IdeaRepository;

@Service
public class IdeaService {
	private final IdeaRepository ideaRepo;
	
	public IdeaService(IdeaRepository ideaRepo) {
		this.ideaRepo = ideaRepo;
	}

	public void createIdea(Idea idea, User id) {
		idea.setCreatedBy(id);
		ideaRepo.save(idea);
	}

	public List<Idea> getAll() {
	return ideaRepo.findAll();
	}
	public void createLike(Long idea, User id) {
		Idea curidea = ideaRepo.findOne(idea);
		curidea.getUserLikes().add(id);
		curidea.setLikes(curidea.getLikes() +1 );
		ideaRepo.save(curidea);
	}
	public Idea findOne(Long idea) {
	return ideaRepo.findOne(idea);
	}
	public List<Idea> findOrdered(){
		return ideaRepo.findAllByOrderByLikesDesc();
	}

	public void deleteId(Long id) {
		ideaRepo.delete(id);
		
	}
}
