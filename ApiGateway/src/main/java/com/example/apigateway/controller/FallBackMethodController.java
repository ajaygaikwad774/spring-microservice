package com.example.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	@GetMapping(path = "/userServiceFallBackMethod")
	public String userServiceFallBackMethod() {
		return "User Service is Taking Long Time as Expected";
	}
	
	@GetMapping(path = "/departmentServiceFallBackMethod")
	public String departmentServiceFallBackMethod() {
		return "department Service is Taking Long Time as Expected";
	}
	
	
}
