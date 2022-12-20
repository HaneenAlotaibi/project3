package com.kfh.training.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kfh.training.entities.user;
import com.kfh.training.services.userService;

@RestController
public class usersController {

	@Autowired
	userService service;

//view all products
	@GetMapping("/user")
	Iterable<user> getAlluser() {
		return service.getAlluser();
	}

//view one product
	@GetMapping("/user/{id}")
	Optional<user> getuserById(@PathVariable int id) {
		return service.getuserById(id);
	}

//find by name
//	@GetMapping("/user/username/{username}")
//	public user getuserByName(@PathVariable String username) {
//		return service.getuserByName(username);
//	}

}