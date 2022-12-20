package com.kfh.training.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kfh.training.entities.product;
import com.kfh.training.services.productService;

@RestController
public class productController {
	
	@Autowired
	productService service;
//view all products
	@GetMapping("/product")
	Iterable<product> getAllproduct() {
		return service.getAllproduct();
	}
//view one product
	@GetMapping("/product/{id}")
	Optional<product> getproductById(@PathVariable int id) {
		return service.getproductById(id);
	}
//	add product
	@PostMapping("/product")
	public void addNewproduct(@RequestBody product theproduct) {
		service.addNewproduct(theproduct);
	}
// update product
	@PutMapping("/product/{id}")
	public void updateproduct(@RequestBody product theproduct) {
		service.updateproduct(theproduct);
	}
// delete product	
	@DeleteMapping("/product/{id}")
	public void deleteproduct(@PathVariable Integer id) {
		service.deleteproduct(id);
	}
	
//find by name
	@GetMapping("/product/name/{name}")
	public product getproductByName(@PathVariable String name) {
		return service.getproductByName(name);
	}
	
	
}