package com.spring.demo.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.demo.action.UserAction;

public class SpringDemoAuTest {

	String path = "applicationBean.xml";
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
	
	@Test
	public void MainTest(){
		UserAction userAction = (UserAction) applicationContext.getBean("userAction");
		userAction.showAction();
	}
}
