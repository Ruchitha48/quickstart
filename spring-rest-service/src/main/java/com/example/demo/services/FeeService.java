package com.example.demo.services;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Fee;
import com.example.demo.repos.FeeRepository;

@Service
public class FeeService {
	@Autowired
	private  FeeRepository repo;
	public FeeService() {
		super();
		
	}
	public Fee add(Fee entity)  {
		return this.repo.save(entity);
	}
public List<Fee> findAll(){
	return this.repo.findAll();
}

public Optional<Fee> findById(int key){
	return this.repo.findById(key);
}
public void deleteById(int key)  {
	if(this.repo.existsById(key)) {
		 this.repo.deleteById(key);
	}
	else {
	throw new RuntimeException("Element not found");	
	}
  
}
//update
//insert
//upsert=save
public Fee update(Fee entity) {
	return this.repo.save(entity);
}
public List<Fee> findByBranch(String branchName){
	return this.repo.findByBranchName(branchName);
}
public int updateAmount(double amount,int id) {
	return this.repo.updateAmount(amount,id);
}
 

}
