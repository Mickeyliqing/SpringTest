package com.spring.demo.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.demo.user.User;
@Repository
public class UserDao {

	@Resource
	private JdbcTemplate jdbcTemplate;
	public void save(User user){
		jdbcTemplate.update("insert into user(name,sex,age,date) values (?,?,?,?)",new Object[]{user.getName(),user.getSex(),user.getAge(),user.getDate()});
	}
}
