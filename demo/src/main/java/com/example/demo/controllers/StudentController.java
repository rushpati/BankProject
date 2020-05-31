package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@RequestMapping("/welcome")
	public String testMethoad(Integer I) {

		return "welcome controller";
	}

	public void m1() {
		System.out.println("i'm happy");
	}

	public void m4() {
		System.out.println("m4 created ");
	}
	
} 
