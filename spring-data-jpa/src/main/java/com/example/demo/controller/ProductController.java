package com.example.demo.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping(path="/api/v1/product")
@CrossOrigin(origins="*")
public class ProductController {
	@Autowired
	private ProductService service;
	@GetMapping
	public List<Product> findAll(){
		return this.service.findAll();
	}
	@GetMapping(path="/{id}")
	public Product findById(@PathVariable("id")int id) {
		return this.service.findById(id).orElseThrow(()->new RuntimeException("element not found"));
}
	
	@PostMapping
	public ResponseEntity<Product> add(@RequestBody Product entity)throws URISyntaxException{
		Product addedEntity=this.service.add(entity);
		int pKey=entity.getId();
		String uri="/api/v1/product/"+pKey;
		return ResponseEntity.created(new URI(uri)).body(addedEntity);
	}
	@DeleteMapping(path="/{id}")
	public void deleteById(@PathVariable("id")int id) {
		this.service.deleteById(id);
}
	
//	@GetMapping(path="/rate/{srch}")
//	public List<Product> findProductRate(@PathVariable("srch")double srch ){
//		return this.service.findByProductRate(srch);
//		
//		
//	}
	@GetMapping(path="/rate")
	public List<Product> findProductRate(@RequestParam("srch")double srch ){
		return this.service.findByProductRate(srch);
		
	}
	
	@PutMapping
	public ResponseEntity<Product> update(@RequestBody Product entity){
		Product updatedEntity=this.service.update(entity);
		
		return ResponseEntity.ok().body(updatedEntity);
	}
}
