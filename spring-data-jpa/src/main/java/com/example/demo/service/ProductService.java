package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Product;
import com.example.demo.repos.ProductRepository;
@Service
public class ProductService {
	private ProductRepository repo;
@Autowired
	public ProductService(ProductRepository repo) {
		super();
		this.repo = repo;
	}
	
	public Product save(Product entity) {
		return this.repo.save(entity);
	}
	public Product add(Product entity)  {
		return this.repo.save(entity);
	}
	public List<Product> findAll(){
		return this.repo.findAll();
		
	}
	public List<Product> findByProductName(String srchString){
		return this.repo.findByProductName(srchString);
		
	}
	public List<Product> findByProductRate(double srch) {
		return this.repo.findByProductRate(srch);
	}
	public void deleteById(int id)  {
		if(this.repo.existsById(id)) {
			 this.repo.deleteById(id);
		}
		else {
		throw new RuntimeException("Element not found");	
		}
		
	  
	}
	public Product update(Product entity) {
		return this.repo.save(entity);
	}

	public Optional<Product> findById(int id){
		return this.repo.findById(id);
	}

	

}
//save(entity),findByProductName(srchString)