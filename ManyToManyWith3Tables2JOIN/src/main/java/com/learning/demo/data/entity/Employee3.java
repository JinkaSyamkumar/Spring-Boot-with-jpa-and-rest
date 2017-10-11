package com.learning.demo.data.entity;



import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.Set;


/**
 * The persistent class for the employee_3 database table.
 * 
 */
@Entity
@Table(name="employee_3")
//@NamedQuery(name="Employee3.findAll", query="SELECT e FROM Employee3 e")
public class Employee3 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="emp_id", unique=true, nullable=false, precision=131089)
	private long empId;

	@Column(nullable=false, length=2147483647)
	private String name;

	//bi-directional many-to-many association to Skillset3
/*	@ManyToMany
	@JoinTable(
			name="emp3_sme3"
			, joinColumns={
				@JoinColumn(name="emp_id")
				}
			, inverseJoinColumns={
				@JoinColumn(name="app_id", nullable=false)
				}
			)
	private Set<Skillset3> skillset3s;

	//bi-directional many-to-many association to Sme3
	@ManyToMany
	@JoinTable(
		name="emp3_skill3"
		, joinColumns={
			@JoinColumn(name="emp_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="tech_id")
			}
		)
	private Set<Sme3> sme3s;*/
	
	@ManyToMany
	@JoinTable(
			name="emp3_sme3"
			, joinColumns={
				@JoinColumn(name="emp_id")
				}
			, inverseJoinColumns={
				@JoinColumn(name="app_id", nullable=false)
				}
			)
	@JsonBackReference
	private Set<Sme3> sme3s;


	//bi-directional many-to-many association to Sme3
	@ManyToMany
	@JoinTable(
		name="emp3_skill3"
		, joinColumns={
			@JoinColumn(name="emp_id")
			}
		, inverseJoinColumns={
			@JoinColumn(name="tech_id")
			}
		)
	@JsonBackReference
	private Set<Skillset3> skillset3s;
	public Employee3() {
	}

	public long getEmpId() {
		return this.empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Skillset3> getSkillset3s() {
		return this.skillset3s;
	}

	public void setSkillset3s(Set<Skillset3> skillset3s) {
		this.skillset3s = skillset3s;
	}

	public Set<Sme3> getSme3s() {
		return this.sme3s;
	}

	public void setSme3s(Set<Sme3> sme3s) {
		this.sme3s = sme3s;
	}

}