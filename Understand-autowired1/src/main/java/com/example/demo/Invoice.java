package com.example.demo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level=AccessLevel.PRIVATE)

@Data
@Component
public class Invoice {
	Customer customer;
	Product product;
	public Invoice(@Qualifier("sam")Customer customer, Product product) {
		super();
		this.customer = customer;
		this.product = product;
	}
	
}
