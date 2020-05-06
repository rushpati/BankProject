package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@RequestMapping("/welcome")

	public String testMethoad(Integer I) {

		return "welcome controller";
	}
}
