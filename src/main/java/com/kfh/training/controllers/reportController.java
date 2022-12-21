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

import com.kfh.training.entities.report;
import com.kfh.training.services.reportService;

@RestController
public class reportController {
	
	@Autowired
	reportService service;
	@GetMapping("/report")
	Iterable<report> getAllreport() {
		return service.getAllreport();
	}
	
	@GetMapping("/report/date/{date}")
	public report getreportBydate(@PathVariable String date) {
		return service.getreportBydate(date);
	}
	@GetMapping("/report/category/{category}")
	public report getreportBycategory(@PathVariable String category) {
		return service.getreportBycategory(category);
	}
		}
