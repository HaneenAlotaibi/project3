package com.kfh.training.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kfh.training.dao.reportRepository;
import com.kfh.training.entities.report;

@Service
public class reportService {

	@Autowired
	reportRepository repo;

	public Iterable<report> getAllreport() {
		return repo.findAll();
	}

	public report getreportBydate(String date) {
		return repo.findBydate(date);
	}
	public report getreportBycategory(String category) {
		return repo.findBycategory(category);
	}
}