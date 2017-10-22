package com.tesla.solution.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

@Entity
public class Restaurant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotBlank
	private String name;
	@NotBlank
	private String category;
	@NotBlank
	private String address;
	@Length(min = 2, max = 2, message= "state should be of length 2")
	@NotBlank
	private String state;
	@NotBlank
	private String city;
	@NotBlank
	@Length(min = 5, max = 5, message= "zipcode should be of length 5")
	private String zipcode;
	protected Restaurant(){
		
	}
	
	public Restaurant(String name, String category, String address, String state, String city, String zipcode) {
		super();
		this.name = name;
		this.category = category;
		this.address = address;
		this.state = state;
		this.city = city;
		this.zipcode = zipcode;
	}
	
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
}
