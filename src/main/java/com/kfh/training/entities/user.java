package com.kfh.training.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity // Tells JPA this is our class : table
public class user {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

//	@Column("Name")
	private String username;
	private Integer password;

	private String email;

	user() {

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

	public Integer getPassword() {
		return password;
	}

	public void setPassword(Integer password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "user [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + "]";
	}

	public user(Integer id, String username, Integer password, String email) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}

}