package com.gjapps.explore.data.vo;

import java.util.Set;

import com.gjapps.explore.data.entity.Employee;

public class SkillSetVO {
	
	private int id;
	private String techName;
	private Set<Employee> employee;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the techName
	 */
	public String getTechName() {
		return techName;
	}
	/**
	 * @param techName the techName to set
	 */
	public void setTechName(String techName) {
		this.techName = techName;
	}
	/**
	 * @return the employee
	 */
	public Set<Employee> getEmployee() {
		return employee;
	}
	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}

	
	
}
