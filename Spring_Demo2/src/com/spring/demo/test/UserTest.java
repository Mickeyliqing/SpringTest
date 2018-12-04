package com.spring.demo.test;

import com.spring.demo.dao.IUserDao;
import com.spring.demo.dao.UserDao;
import com.spring.demo.utils.ProxyFactory;

public class UserTest {
public static void main(String[] args) {
	IUserDao userDao = new UserDao();
	IUserDao proxyFactory = (IUserDao) new ProxyFactory(userDao).getProxyFactory();
	proxyFactory.save();
}
}
