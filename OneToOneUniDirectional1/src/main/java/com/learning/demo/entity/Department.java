/**
 * 
 */
package com.learning.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author syamkumarj
 *
 */
@Entity
@Table(name="department")
public class Department {

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String deptName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	

	
	
	
}
