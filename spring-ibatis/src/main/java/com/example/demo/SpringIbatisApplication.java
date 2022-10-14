package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Customer;
import com.example.demo.services.CustomerService;

@SpringBootApplication
public class SpringIbatisApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringIbatisApplication.class, args);
		Customer obj=ctx.getBean(Customer.class);
	    obj.setCustomerId(103);
	    obj.setCustomerName("Ruchitha");
	    obj.setEmail("rdt@ng.com");
	    ctx.getBean(CustomerService.class).findAll().forEach(System.out::println);
	    CustomerService service=ctx.getBean(CustomerService.class);
	    System.out.println("is added "+service.save(obj));
	    service.findAll().forEach(System.out::println);
	    ctx.close();
	
	}

}
