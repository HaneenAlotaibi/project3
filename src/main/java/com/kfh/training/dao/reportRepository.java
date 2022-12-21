package com.kfh.training.dao;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kfh.training.entities.report;

@Repository
public interface reportRepository extends CrudRepository<report, Integer> {
	report findBydate(String date);
	report findBycategory(String category);
	
}