package com.spring.demo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.demo.dao.UserDao;

@Service
public class UserService {

	@Resource
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
