package com.kfh.training.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity  
public class category {
	
	@Id
	private Integer id;

	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "category [id=" + id + ", name=" + name + "]";
	}

	public category(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public category() {
		
	}
	
}