package com.spring.demo.service;

import com.spring.demo.dao.UserDao;


public class UserService {

	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void showService(){
		userDao.showDao();
	}
}
