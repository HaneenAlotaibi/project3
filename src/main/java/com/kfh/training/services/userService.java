package com.kfh.training.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kfh.training.dao.userRepository;
import com.kfh.training.entities.user;

@Service
public class userService {

	@Autowired
	userRepository repo;

	public Iterable<user> getAlluser() {
		return repo.findAll();
	}

	public Optional<user> getuserById(Integer id) {
		return repo.findById(id);
	}

//	public user getuserByName(String username) {
//		return repo.findByName(username);
//	}                                                

}