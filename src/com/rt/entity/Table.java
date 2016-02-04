package com.rt.entity;

/**
 * Table entity. @author MyEclipse Persistence Tools
 */

public class Table implements java.io.Serializable {

	// Fields

	private Integer idtable;
	private String tableName;
	private String tableNum;
	private Boolean tableState;

	// Constructors

	/** default constructor */
	public Table() {
	}

	/** full constructor */
	public Table(String tableName, String tableNum, Boolean tableState) {
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

	public String getTableNum() {
		return this.tableNum;
	}

	public void setTableNum(String tableNum) {
		this.tableNum = tableNum;
	}

	public Boolean getTableState() {
		return this.tableState;
	}

	public void setTableState(Boolean tableState) {
		this.tableState = tableState;
	}

}