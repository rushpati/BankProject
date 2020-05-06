package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class EmployeeController {

	@RequestMapping("/showemp")
	
	public String showListOfEmployees() {
		return "emp";
	}
	
	public void y() {
		
	}
}
