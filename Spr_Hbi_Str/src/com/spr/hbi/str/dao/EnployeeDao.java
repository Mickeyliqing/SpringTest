package com.spr.hbi.str.dao;

import java.io.Serializable;

import org.hibernate.SessionFactory;

import com.spr.hbi.str.Enployee;

public class EnployeeDao {

	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void save(Enployee enployee){
		sessionFactory.getCurrentSession().save(enployee);
	}
	
	public Enployee findById(Serializable id){
		return (Enployee) sessionFactory.getCurrentSession().get(Enployee.class, id);
	}
}
