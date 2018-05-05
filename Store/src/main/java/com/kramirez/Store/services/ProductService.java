package com.kramirez.Store.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kramirez.Store.models.Product;
import com.kramirez.Store.repositories.ProductRepository;

@Service
public class ProductService {
	private final ProductRepository productRepo;
	
	public ProductService(ProductRepository productRepo) {
		this.productRepo = productRepo;
	}
	public List<Product> allProducts(){
		return productRepo.findAll();
	}
	public void addProduct(Product product) {
		productRepo.save(product);
	}
	public Product findOne(Long id) {
		return productRepo.findById(id);
	}
}
