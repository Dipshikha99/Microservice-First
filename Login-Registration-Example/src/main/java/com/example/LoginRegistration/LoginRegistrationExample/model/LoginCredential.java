package com.example.LoginRegistration.LoginRegistrationExample.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class LoginCredential {
	
	@Id
	private String userName;
	
	private String password;
	
	@OneToOne(fetch= FetchType.LAZY)
	@JsonIgnore
	private User user;

	public LoginCredential(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public LoginCredential() {
		super();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "LoginCredential [userName=" + userName + ", password=" + password  + "]";
	}

	/**/

	
}

