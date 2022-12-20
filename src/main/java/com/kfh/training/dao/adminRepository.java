package com.kfh.training.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.kfh.training.entities.admin;

@Repository
public interface adminRepository extends CrudRepository<admin, Integer> {

	//product findByName(String name);
	
	//List<product> findByLocation(String location);
}