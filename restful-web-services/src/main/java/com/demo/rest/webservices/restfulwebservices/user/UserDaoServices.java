package com.demo.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoServices {
	
	private static List<User> users= new ArrayList<>();
	
	private static int usersCount=3;
	
	static{
		
		users.add(new User(1,"jack", new Date()));
		users.add(new User(2,"jill", new Date()));
		users.add(new User(3,"jarry", new Date()));
	}
	
	//find all users
	public List<User> findAll()
	{
		return users;
	}
	//save a user
	public User save(User user)
	{
		if(user.getId() == 0)
		{
			user.setId(++usersCount);
		}
		users.add(user);
		return user;
	}
	//findOne user
	public User findOne(int id)
	{
		for(User user : users)
		{
			if(user.getId()==id)
			{
				return user;
			}
		}
		return null;
	}
	
	public User deleteUserById(int id)
	{
		Iterator<User> iterator=users.iterator();
		while(iterator.hasNext())
		{
			User user=iterator.next();
			if(user.getId()==id)
			{
				iterator.remove();
				return user;
			}
		}
		return null;
	}
	
}
