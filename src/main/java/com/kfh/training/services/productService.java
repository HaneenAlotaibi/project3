package com.kfh.training.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kfh.training.dao.productRepository;
import com.kfh.training.entities.product;

@Service
public class productService {

	@Autowired
	productRepository repo;

	public Iterable<product> getAllproduct() {
		return repo.findAll();
	}

	public Optional<product> getproductById(Integer id) {
		return repo.findById(id);
	}

	public void addNewproduct(product theproduct) {
		repo.save(theproduct);
	}

	public void updateproduct(product theproduct) {
		repo.save(theproduct);
	}

	public void deleteproduct(Integer id) {
		repo.deleteById(id);
	}

	public product getproductByName(String name) {
		return repo.findByName(name);
	}

}