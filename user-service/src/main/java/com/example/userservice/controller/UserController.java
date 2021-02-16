package com.example.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.userservice.model.User;
import com.example.userservice.model.vo.ResponseTemplateVo;
import com.example.userservice.service.UserService;

@RestController
@RequestMapping(path = "/user")
public class UserController {

	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(UserController.class);

	@Autowired
	UserService userService;

	@PostMapping(path = "/save")
	public ResponseEntity<User> save(@RequestBody User user) {
		log.info("Inside save User Controller");
		return new ResponseEntity<User>(userService.save(user), HttpStatus.ACCEPTED);
	}

	@GetMapping(path = "/get/{id}")
	public ResponseEntity<ResponseTemplateVo> getUserWithDepartment(@PathVariable("id") Long id) {
		return new ResponseEntity<ResponseTemplateVo>(userService.getUserWithDepartment(id), HttpStatus.OK);
	}
}
