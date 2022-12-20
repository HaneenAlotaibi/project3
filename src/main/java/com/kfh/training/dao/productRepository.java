package com.kfh.training.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kfh.training.entities.admin;
import com.kfh.training.entities.product;

@Repository
public interface productRepository extends CrudRepository<product, Integer> {

	product findByName(String name);

	
	
	//List<product> findByLocation(String location);
}