package com.spring.demo.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.spring.demo.service.UserService;

@Controller
public class UserAction {

	@Resource
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void showAction(){
		userService.showService();
	}
}
