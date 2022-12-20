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

import com.kfh.training.entities.admin;
import com.kfh.training.services.adminService;

@RestController
public class adminController {
	
	@Autowired
	adminService service;
	// update product
		@PutMapping("/admin/{id}")
		public void updateadmin(@RequestBody admin theadmin) {
			service.updateadmin(theadmin);
		}
		}