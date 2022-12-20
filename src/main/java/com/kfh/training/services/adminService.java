package com.kfh.training.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kfh.training.dao.adminRepository;
import com.kfh.training.entities.admin;

@Service
public class adminService {
	
	@Autowired
	adminRepository repo;


	public void updateadmin(admin theadmin) {
		repo.save(theadmin);
	}


	
}