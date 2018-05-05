package com.kramirez.Store.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kramirez.Store.models.Category;
import com.kramirez.Store.repositories.CategoryRepository;

@Service
public class CategoryService {
	private final CategoryRepository catRepo;
	
	public CategoryService(CategoryRepository catRepo) {
		this.catRepo = catRepo;
	}
	public List<Category> allCategories(){
		return catRepo.findAll();
	}
	public void addCategory(Category category) {
		catRepo.save(category);
	}
	public Category findOne(Long id) {
		return catRepo.findById(id);
	}

}
