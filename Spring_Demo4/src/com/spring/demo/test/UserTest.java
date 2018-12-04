package com.spring.demo.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.dao.IUserDao;

public class UserTest {

	ApplicationContext context = new ClassPathXmlApplicationContext("applicationBean.xml");
	
	@Test
	public void testUser(){
		IUserDao userDao = (IUserDao) context.getBean("userDao");
		userDao.save();
	}
}
