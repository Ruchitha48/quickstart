package com.example.demo.ifaces;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import com.example.demo.model.Customer;
@Mapper
public interface CrudRepositary {
	@Insert(value="insert into tieto_customer(customerId,customerName,email)"+"values(#{customerId},#{customerName},#{email})")
	    public boolean save(Customer entity) ;
	    
	    @Select(value="select * from tieto_customer")
	    public List<Customer> findAll();



	
}
