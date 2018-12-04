package com.spring.demo.action;

import com.spring.demo.service.UserService;

public class UserAction {

	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String showAction(){
		userService.showService();
		return "success";
	}
}
