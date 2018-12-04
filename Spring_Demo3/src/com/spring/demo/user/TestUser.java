package com.spring.demo.user;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

	@SuppressWarnings("resource")
	@Test
	public void testMain(){
		
		String path = "applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
		User user = (User) applicationContext.getBean("user");
		System.out.println(user);
	}
}
