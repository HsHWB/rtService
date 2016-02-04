package com.rt.service;

import java.util.List;
import java.util.Map;

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
	
	/**
	 * 获取某个tableNum的table
	 * @param table
	 * @param tag
	 * @return
	 */
	public List<Object> getItemByTableNum(String table, int tableNum){

		List<Object> list = dao.queryTableNum(table, tableNum);
		return list;
	}
	
	/**
	 * 获取某些tableState的table
	 * @param table
	 * @param tag
	 * @return
	 */
	public List<Object> getItemByTableState(String table, int tableState){

		List<Object> list = dao.queryTableState(table, tableState);
		return list;
	}
	
	/**
	 * 更新table的state
	 * @param table
	 * @param tableName
	 * @param tableNum
	 * @param tableState
	 */
	public void setTableState(String table, String tableName, int tableNum, int tableState){
		dao.setTableState(table, tableName, tableNum, tableState);
	}
}
