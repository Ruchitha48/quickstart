package com.example.demo;

import com.examle.demo.entity.student;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("api/v1/students")

public class studentServices {
	
@GET
@Produces(value=MediaType.APPLICATION_JSON)
public student getName() {
	return new student(12,"ruchi",28);
}
}
