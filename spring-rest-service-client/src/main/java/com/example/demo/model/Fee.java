package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Fee {
	private int id;
	private String branch;
	private String year;
	private double amount;
}
