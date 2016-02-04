package com.rt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rt.dao.Dao;
import com.rt.entity.Table;

@org.springframework.stereotype.Service
public class Service {
	@Autowired
	private Dao dao;
	
	public List<Object> getAll(String table) {
		// TODO Auto-generated method stub
		List<Object> list = dao.queryAll(table);
		return list;
	}
}
