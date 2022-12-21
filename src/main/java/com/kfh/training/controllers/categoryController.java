package com.kfh.training.controllers;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kfh.training.entities.category;
import com.kfh.training.services.categoryService;

@RestController
public class categoryController {
	
	@Autowired
	categoryService service;

	@GetMapping("/category")
	Iterable<category> getAllcategory() {
		return service.getAllcategory();
	}

	@GetMapping("/category/{id}")
	Optional<category> getcategoryById(@PathVariable int id) {
		return service.getcategoryById(id);
	}
//	add product
	@PostMapping("/category")
	public void addNewcategory(@RequestBody category thecategory) {
		service.addNewcategory(thecategory);
	}
// update product
	@PutMapping("/category/{id}")
	public void updatecategory(@RequestBody category thecategory) {
		service.updatecategory(thecategory);
	}
	
//find by name
	@GetMapping("/category/name/{name}")
	public category getcategoryByName(@PathVariable String name) {
		return service.getcategoryByName(name);
	}
	
	
}