package com.spr.hbi.str.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.spr.hbi.str.Department;
import com.spr.hbi.str.Enployee;
import com.spr.hbi.str.service.DepartmentService;
import com.spr.hbi.str.service.EnployeeService;

@SuppressWarnings("serial")
public class EnpAndDepAction extends ActionSupport{

	private EnployeeService enployeeService;
	private DepartmentService departmentService;
	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	public void setEnployeeService(EnployeeService enployeeService) {
		this.enployeeService = enployeeService;
	}

	@Override
	public String execute() throws Exception {
		Enployee enployee = new Enployee();
		Department department = new Department();
		
		enployee.setEnployeeName("莉莉");
		enployee.setEnployeeDesc("表现就是很好");
		enployee.setDate(new Date());
		
		department.setDepartmentName("人事部");
		department.setDepartmentDesc("负责招人");
		department.setDate(new Date());
		
		department.getEnployees().add(enployee);
		
		enployeeService.save(enployee);
		departmentService.save(department);
		return SUCCESS;
	}
}
