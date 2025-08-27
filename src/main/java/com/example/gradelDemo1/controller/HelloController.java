package com.example.gradelDemo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	public HelloController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/hello")
	public String CreateUser() {
		return "Rahul Patel is created";
	}

}
