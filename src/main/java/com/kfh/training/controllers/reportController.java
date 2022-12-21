package com.kfh.training.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
