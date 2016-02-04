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
	
	/**
	 * 获取某个tableNum的table
	 * @param table
	 * @param tag
	 * @return
	 */
	public List<Object> queryTableNum(String table, int tableNum){
		Map<String, Object> map = null;
		String query = String.format("from %s where table_num=%d", table, tableNum);
		return super.queryAll(query, map);
	}
	
	/**
	 * 获取某个tableState的table
	 * @param table
	 * @param tag
	 * @return
	 */
	public List<Object> queryTableState(String table, int tableState){
		Map<String, Object> map = null;
		String query = String.format("from %s where table_state=%d", table, tableState);
		return super.queryAll(query, map);
	}
	
	/**
	 * 更新table的state
	 * @param table
	 * @param tableName
	 * @param tableNum
	 * @param tableState
	 */
	public void setTableState(String table, String tableName, int tableNum, int tableState){
		Table updateTable = new Table();
		updateTable.setTableName(tableName);
		updateTable.setTableNum(tableNum);
		updateTable.setTableState(tableState);
		super.update(updateTable);
	}
	public Session getSession() {
		// TODO Auto-generated method stub
		return super.getCurrentSession();
	}
}
