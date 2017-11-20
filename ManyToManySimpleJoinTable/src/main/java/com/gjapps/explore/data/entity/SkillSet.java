/**
 * 
 */
package com.gjapps.explore.data.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * @author Syam
 *
 */
@Entity
@Table(name="skillset5")
public class SkillSet {
	
	@Id
	@Column(name="tech_id")
	private int id;
	
	@Column(name="tech_name")
	private String techName;
	
	@ManyToMany(mappedBy="skillSet",cascade=CascadeType.ALL)
	@JsonBackReference
	private Set<Employee> employee;

	
	/**
	 * 
	 */
	public SkillSet() {
	}

	/**
	 * @param id
	 * @param techName
	 */
	public SkillSet(int id, String techName) {
		this.id = id;
		this.techName = techName;
	}

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

	/**
	 * @return the employee
	 */
/*	public Employee getEmployee() {
		return employee;
	}

	*//**
	 * @param employee the employee to set
	 *//*
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}*/
	
	

}
