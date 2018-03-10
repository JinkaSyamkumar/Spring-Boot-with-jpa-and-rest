/**
 * 
 */
package com.gjapps.explore.data.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * @author Syam
 *
 */
@Entity
@Table(name="employee")
public class Employee {
	@Id
	@Column(name="emp_id")
	private String id;
	
	@Column(name="name")
	private String name;
	
	@OneToOne(mappedBy="employee")
	@JsonBackReference
	private EmpAddress empAddress;
	
	public Employee() {
		super();
	}

	/**
	 * @param id
	 * @param name
	 */
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the empAddress
	 */
	public EmpAddress getEmpAddress() {
		return empAddress;
	}

	/**
	 * @param empAddress the empAddress to set
	 */
	public void setEmpAddress(EmpAddress empAddress) {
		this.empAddress = empAddress;
	}
	
	
}
