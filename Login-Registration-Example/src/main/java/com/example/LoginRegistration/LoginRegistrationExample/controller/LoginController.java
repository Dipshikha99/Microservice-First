package com.example.LoginRegistration.LoginRegistrationExample.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.LoginRegistration.LoginRegistrationExample.dao.UserDaoServices;
import com.example.LoginRegistration.LoginRegistrationExample.model.User;


@RestController
public class LoginController {
	
	@Autowired
	private UserDaoServices userDaoServices;
	
	@PostMapping("/login")
	 public ModelAndView login(@RequestParam("username") final String username,
	    @RequestParam("password") final String password) 
	{
		ModelAndView model=new ModelAndView();
		User user=userDaoServices.loginCheck(username,password);
		if(user==null)
		{
			throw new RuntimeException("Invalid Username or Password.");
			//model=new ModelAndView("login.jsp","errmsg","Invalid Username or Password.");
			//return model;
		}
		else
		{
			model=new ModelAndView("home.jsp");
			return model;
		}
	}
}
