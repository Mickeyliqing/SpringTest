package com.spring.demo.dao;


public class UserDao implements IUserDao{

	@Override
	public void save() {
		System.out.println("这是一个保存方法！");
		
	}
}
