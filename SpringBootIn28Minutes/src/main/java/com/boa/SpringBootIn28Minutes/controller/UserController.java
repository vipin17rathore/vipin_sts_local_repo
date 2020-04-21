package com.boa.SpringBootIn28Minutes.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boa.SpringBootIn28Minutes.bean.User;
import com.boa.SpringBootIn28Minutes.bean.Users;
import com.boa.SpringBootIn28Minutes.service.UserService;

import io.swagger.annotations.Api;


@Api(value="userController",
	   tags="user",
	   consumes="application/json,application/xml",
	   description="service for performing basic operations on user",
	   produces="application/json,application/xml"	   
		)


@RestController
public class UserController {
	
	private  Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	UserService service;
	
	@GetMapping("/getUsers")
	public Users getUsers() {
		logger.info("user controler");
		return service.getUsers();
	}
	
	@GetMapping("/getUser/{id}")
	public User getUser(@PathVariable int id) {
		return service.getUser(id);
	}
	
	@PostMapping("/addUser")
	public String addUser(@RequestBody @Valid User user) {
		return service.addUser(user);
	}

	@PutMapping("/modifyUser/{id}")
	public User modifyUser(@RequestBody User user) throws Exception {
		return service.modifyUser(user);
	}

	@DeleteMapping("/removeUser/{id}")
	public String removeUser(@PathVariable int id) {
		return service.removeUser(id);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable int id) {
		return new ResponseEntity<String>(service.removeUser(id),HttpStatus.CREATED);
	}
}
