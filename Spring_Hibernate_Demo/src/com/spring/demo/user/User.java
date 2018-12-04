package com.spring.demo.user;

import java.util.Date;

public class User {

	private Integer id;
	private String name;
	private String sex;
	private Integer age;
	private Date date;
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public User() {
		super();
	}
	public User(Integer id, String name, String sex, Integer age, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.date = date;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", age="
				+ age + ", date=" + date + "]";
	}
	
}
