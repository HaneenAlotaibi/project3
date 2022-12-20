package com.kfh.training.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity  
public class admin {
	
	@Id
	private Integer id;
	
	private String username;
	private String email;
	
	private Integer password;
	
	admin(){
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPassword() {
		return password;
	}

	public void setPassword(Integer password) {
		this.password = password;
	}

	public admin(Integer id, String username, String email, Integer password) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "admin [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password + "]";
	}

}