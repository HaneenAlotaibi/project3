package com.kfh.training.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kfh.training.entities.category;

@Repository
public interface categoryRepository extends CrudRepository<category, Integer> {

	category findByName(String name);
	
	//List<product> findByLocation(String location);
}