package com.spring.demo.test;


import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.service.UserService;
import com.spring.demo.user.User;

public class UserTest {

	@Test
	public void userTest(){
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		User user = new User();
		user.setName("酷狗");
		user.setSex("男");
		user.setAge(24);
		user.setDate(new Date());
		
		UserService userService = (UserService) context.getBean("userService");
		System.out.println(userService);
		userService.save(user);
	}
}
