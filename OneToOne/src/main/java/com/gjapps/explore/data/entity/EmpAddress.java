/**
 * 
 */
package com.gjapps.explore.data.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * @author Syam
 *
 */
@Entity
@Table(name="employee_address")
public class EmpAddress {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_address")
	@SequenceGenerator(name="seq_address", sequenceName="seq_address",allocationSize=1)
	@Column(name="id")
	private int id;
	
	@Column(name="address")
	private String address;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="emp_id")
	@JsonBackReference
	private Employee employee;
	
	public EmpAddress() {
		
		super();
	}

	/**
	 * @param id
	 * @param address
	 */
	public EmpAddress(int id, String address) {
		this.id = id;
		this.address = address;
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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
}
