package com.example.restexplore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name) {
		return "Hello " + name;
	}
	
	@GetMapping("/multiply/{num1}/{num2}")
	public Integer hello(@PathVariable("num1") int num1, @PathVariable("num2") int num2) {
		return num1*num2;
	}
}