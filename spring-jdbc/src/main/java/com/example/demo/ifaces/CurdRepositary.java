package com.example.demo.ifaces;

import java.util.List;

import com.example.demo.model.Customer;

public interface CurdRepositary<T> {
	    public boolean save(T t);
	    public List<Customer> findAll();



	
}
