package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1")
public class WelcomeController {
@GetMapping(path="/students")
public String getStudent() {
	
	return "student ruchitha";
}
@GetMapping(path="/teachers")
public String getTeacher() {
	
	return "Teacher srivatsan";
}
@GetMapping(path="/staff")
public String getStaff() {
	
	return "staff shilpa";
}
}
