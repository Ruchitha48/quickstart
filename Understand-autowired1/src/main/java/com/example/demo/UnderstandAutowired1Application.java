package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
public class UnderstandAutowired1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=	SpringApplication.run(UnderstandAutowired1Application.class, args);
	Invoice in=ctx.getBean(Invoice.class);
	System.out.println(in);}
	@Bean 
	public Customer shyam() {
		return new Customer(202,"shyam","shyam@yz.com");
	
	
	}
	@Bean
	//@Primary
	public Customer sam() {
		return new Customer(205,"sam","sam@yz.com");
	
	
	}
	@Bean
	public Product tv() {
		return new Product(2020,"samsung",50000);
	}
	

}
