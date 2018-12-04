package com.spring.demo.service;

import com.spring.demo.dao.UserDao;
import com.spring.demo.user.User;

public class UserService {

	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void save(User user){
		userDao.save(user);
	}
}
