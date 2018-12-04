package com.spring.demo.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.demo.user.User;

public class UserDao {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void save(User user){
		jdbcTemplate.update("insert into user(name,sex,age,date) values (?,?,?,?)",new Object[]{user.getName(),user.getSex(),user.getAge(),user.getDate()});
	}
}
