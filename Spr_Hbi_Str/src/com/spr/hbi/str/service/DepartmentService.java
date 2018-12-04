package com.spr.hbi.str.service;

import java.io.Serializable;

import com.spr.hbi.str.Department;
import com.spr.hbi.str.dao.DepartmentDao;

public class DepartmentService {

	private DepartmentDao departmentDao;
	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}
	
	public void save(Department department){
		departmentDao.save(department);
	}
	
	public Department findById(Serializable id){
		return departmentDao.findById(id);
	}
}
