package com.moviesflex.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	String email;
	String password;
	String gender;
	private long phone;
	String addresh;
	boolean isPremium;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, String email, String password, String gender, long phone, String addresh,
			boolean isPremium) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.phone = phone;
		this.addresh = addresh;
		this.isPremium = isPremium;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getAddresh() {
		return addresh;
	}

	public void setAddresh(String addresh) {
		this.addresh = addresh;
	}

	public boolean isPremium() {
		return isPremium;
	}

	public void setPremium(boolean isPremium) {
		this.isPremium = isPremium;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", gender="
				+ gender + ", phone=" + phone + ", addresh=" + addresh + ", isPremium=" + isPremium + "]";
	}

	
	

}
