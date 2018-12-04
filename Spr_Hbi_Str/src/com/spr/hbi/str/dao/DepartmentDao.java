package com.spr.hbi.str.dao;

import java.io.Serializable;

import org.hibernate.SessionFactory;

import com.spr.hbi.str.Department;

public class DepartmentDao {

	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void save (Department department){
		sessionFactory.getCurrentSession().save(department);
	}
	
	public Department findById(Serializable id){
		return (Department) sessionFactory.getCurrentSession().get(Department.class, id);
	}
}
