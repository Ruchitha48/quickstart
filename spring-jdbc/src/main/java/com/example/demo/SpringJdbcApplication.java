package com.example.demo;

import java.security.Provider.Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Customer;
import com.example.demo.services.CustomerService;

@SpringBootApplication
public class SpringJdbcApplication {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringJdbcApplication.class, args);
		int key=1;
		CustomerService service=ctx.getBean(CustomerService.class);
		if(key==2) {
	Customer obj=ctx.getBean(Customer.class);
	obj.setCustomerId(Integer.parseInt(args[0]));
	obj.setCustomerName(args[1]);
	obj.setEmail(args[2]);
	
	
	System.out.println("Is added :="+service.save(obj));}
		if(key==2) {
			service.findAll().forEach(System.out::println);
		}
	ctx.close();
	}

}
