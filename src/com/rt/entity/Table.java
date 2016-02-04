package com.rt.entity;

/**
 * Table entity. @author MyEclipse Persistence Tools
 */

public class Table implements java.io.Serializable {

	// Fields

	private Integer idtable;
	private String tableName;
	private Integer tableNum;
	private Integer tableState;

	// Constructors

	/** default constructor */
	public Table() {
	}

	/** full constructor */
	public Table(String tableName, Integer tableNum, Integer tableState) {
		this.tableName = tableName;
		this.tableNum = tableNum;
		this.tableState = tableState;
	}

	// Property accessors

	public Integer getIdtable() {
		return this.idtable;
	}

	public void setIdtable(Integer idtable) {
		this.idtable = idtable;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public Integer getTableNum() {
		return this.tableNum;
	}

	public void setTableNum(Integer tableNum) {
		this.tableNum = tableNum;
	}

	public Integer getTableState() {
		return this.tableState;
	}

	public void setTableState(Integer tableState) {
		this.tableState = tableState;
	}

}