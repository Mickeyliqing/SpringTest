package com.spr.hbi.str.service;

import java.io.Serializable;

import com.spr.hbi.str.Enployee;
import com.spr.hbi.str.dao.EnployeeDao;

public class EnployeeService {

	private EnployeeDao enployeeDao;
	public void setEnployeeDao(EnployeeDao enployeeDao) {
		this.enployeeDao = enployeeDao;
	}
	
	public void save(Enployee enployee){
		enployeeDao.save(enployee);
	}
	
	public Enployee findById(Serializable id){
		return enployeeDao.findById(id);
	}
}
