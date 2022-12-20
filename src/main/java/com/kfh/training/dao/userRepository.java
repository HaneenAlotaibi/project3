package com.kfh.training.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kfh.training.entities.user;

@Repository
public interface userRepository extends CrudRepository<user, Integer> {

	// user findByName(String username);

	// List<product> findByLocation(String location);
}