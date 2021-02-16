package com.example.departmentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.departmentservice.model.Department;
import com.example.departmentservice.service.DepartmentService;




@RestController
@RequestMapping(path = "/department")
public class DepartmentController {

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(DepartmentController.class);
	
	@Autowired
	DepartmentService departmentService;
	
	@PostMapping(path = "/save")
	public ResponseEntity<Department> save(@RequestBody Department department){
		log.info("Inside save Department Controller");
		return new ResponseEntity<Department>(departmentService.save(department),HttpStatus.ACCEPTED);
	}
	
	@GetMapping(path = "/get/{id}")
	public ResponseEntity<Department> getDepartmentById(@PathVariable("id") Long id){
		log.info("Inside getDepartmentByID Controller");
		return new ResponseEntity<Department>(departmentService.getDepartmentById(id),HttpStatus.OK);
	}
}
