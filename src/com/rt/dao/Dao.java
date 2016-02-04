package com.rt.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.rt.entity.Table;

@Repository
public class Dao extends BaseDao{
	public List<Object> queryAll(String table) {
		// TODO Auto-generated method stub
		Map<String, Object> map = null;
		String query = String.format("from %s", table);
		return super.queryAll(query, map);
	}
	
	public Session getSession() {
		// TODO Auto-generated method stub
		return super.getCurrentSession();
	}
}
