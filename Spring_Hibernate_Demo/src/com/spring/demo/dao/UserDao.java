package com.spring.demo.dao;

import org.hibernate.SessionFactory;

import com.spring.demo.user.User;

public class UserDao {

	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public void save(User user){
		sessionFactory.getCurrentSession().save(user);
	}
}
