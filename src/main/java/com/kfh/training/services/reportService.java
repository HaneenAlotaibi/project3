package com.kfh.training.services;

import java.util.Optional;
import java.util.Optional;

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
}