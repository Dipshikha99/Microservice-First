package com.example.LoginRegistration.LoginRegistrationExample.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.example.LoginRegistration.LoginRegistrationExample.model.LoginCredential;
import com.example.LoginRegistration.LoginRegistrationExample.model.User;
import com.example.LoginRegistration.LoginRegistrationExample.repository.LoginRepository;
import com.example.LoginRegistration.LoginRegistrationExample.repository.UserRepository;

@Component
public class UserDaoServices {
	
	private static List<User> users= new ArrayList<>();
	
	private static List<LoginCredential> loginDetails= new ArrayList<>();
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private LoginRepository loginRepository;
	
	public User loginCheck(String username,String password)
	{
		User user=null;
		
		loginDetails=loginRepository.findAll();
		
		for(LoginCredential login : loginDetails)
		{
			if(login.getUserName().equalsIgnoreCase(username) && login.getPassword().equals(password))
			{
				user=login.getUser();
			}
		}
		return user;
	}
	
	public User userRegistration(User user,LoginCredential login)
	{
		users=userRepository.findAll();
		for(User u : users)
		{
			if(u.getUserId()==user.getUserId())
			{
				return null;
			}
		}
		login.setUser(user);
		userRepository.save(user);
		loginRepository.save(login);
		return user;
	}
	
}
