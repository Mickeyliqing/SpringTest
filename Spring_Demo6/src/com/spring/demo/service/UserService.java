package com.spring.demo.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.demo.dao.UserDao;
import com.spring.demo.user.User;
@Service
public class UserService {

	@Resource
	private UserDao userDao;
	
	public void save(User user){
		userDao.save(user);
	}
}
