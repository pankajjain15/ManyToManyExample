package com.org.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/users")
public class UserController {

	@Autowired
	UserDAO userDao;
	
	@RequestMapping(method=RequestMethod.POST)
	public User save(User user){
		return userDao.save(user);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<User>getAllUsers(){
		return userDao.getAllUsers();
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public User update(User user){
		return userDao.save(user);
	}
	
	
	
	
}
