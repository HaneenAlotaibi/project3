package com.kfh.training.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kfh.training.dao.categoryRepository;
import com.kfh.training.entities.category;

@Service
public class categoryService {

	@Autowired
	categoryRepository repo;

	public Iterable<category> getAllcategory() {
		return repo.findAll();
	}

	public Optional<category> getcategoryById(Integer id) {
		return repo.findById(id);
	}

	public void addNewcategory(category thecategory) {
		repo.save(thecategory);
	}

	public void updatecategory(category thecategory) {
		repo.save(thecategory);
	}
	public category getcategoryByName(String name) {
		return repo.findByName(name);
	}

}