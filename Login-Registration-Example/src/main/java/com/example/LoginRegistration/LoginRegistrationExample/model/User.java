package com.example.LoginRegistration.LoginRegistrationExample.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;

@Entity
public class User {

	@Id
	@GeneratedValue
	private int userId;
	
	@Size(min=2, message="Name should have atleast 2 characters")
	private String name;
	
	@Size(min=6, message="detail should have atleast 6 characters")
	private String details;
	
	@OneToOne(mappedBy="user")
	private LoginCredential loginCredential;
	
	public User() {
		super();
	}

	public User(int userId, String name, String details) {
		super();
		this.userId = userId;
		this.name = name;
		this.details = details;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public LoginCredential getLoginCredential() {
		return loginCredential;
	}

	public void setLoginCredential(LoginCredential loginCredential) {
		this.loginCredential = loginCredential;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", details=" + details + "]";
	}
	
	
}

