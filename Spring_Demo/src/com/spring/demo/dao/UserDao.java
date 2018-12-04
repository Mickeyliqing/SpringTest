package com.spring.demo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao implements IUserDao{

	public void save() {
		System.out.println("这是一个保存方法");
	}
}
