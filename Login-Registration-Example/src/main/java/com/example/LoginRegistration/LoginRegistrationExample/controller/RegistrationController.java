package com.example.LoginRegistration.LoginRegistrationExample.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.LoginRegistration.LoginRegistrationExample.dao.UserDaoServices;
import com.example.LoginRegistration.LoginRegistrationExample.model.LoginCredential;
import com.example.LoginRegistration.LoginRegistrationExample.model.User;

@RestController
public class RegistrationController {
	
	@Autowired
	private UserDaoServices userDaoServices;
	
	/*@Autowired
	private PasswordEncoder passwordEncoder;*/

	
	@PostMapping("/register")
	public ModelAndView register(@RequestParam("username") final String username,
		    @RequestParam("password") final String password
		    ,@RequestParam("name") final String name
		    ,@RequestParam("details") final String details) 
	{
		User user=new User();
		LoginCredential login=new LoginCredential();
		user.setName(name);
		user.setDetails(details);
		login.setUserName(username);
		login.setPassword(password);
		
		User result=userDaoServices.userRegistration(user, login);
		
		if(result==null)
		{
			return new ModelAndView("register.jsp","User already exist.", user);
		}
		else
		{
			return new ModelAndView("login.jsp","User Registered.Now login.",login);
		}
	}
	
}
