package com.kfh.training.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity // Tells JPA this is our class : table
public class report {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

//	@Column("Name")
	private String product;
	private String category ;
	private String user;
	private String date;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public report(Integer id, String product, String category, String user, String date) {
		super();
		this.id = id;
		this.product = product;
		this.category = category;
		this.user = user;
		this.date = date;
	}
	public report() {
		
	}
	

}