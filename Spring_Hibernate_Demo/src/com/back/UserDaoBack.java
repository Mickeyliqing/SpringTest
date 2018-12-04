package com.back;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.spring.demo.user.User;

public class UserDaoBack {
//	private static SessionFactory factory;
//	static {
//		factory = new Configuration().configure().buildSessionFactory();
//	}
	public void save(User user){
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
	}
}
