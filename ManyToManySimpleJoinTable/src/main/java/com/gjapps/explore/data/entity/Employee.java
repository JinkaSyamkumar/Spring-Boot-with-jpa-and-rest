/**
 * 
 */
package com.gjapps.explore.data.entity;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="emp_skill",
	joinColumns=@JoinColumn(name="emp_id"),
	inverseJoinColumns=@JoinColumn(name="skill_id"))
	@JsonBackReference
	private Set<SkillSet> skillSet;
	
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
	 * @return the skillSet
	 */
	public Set<SkillSet> getSkillSet() {
		return skillSet;
	}

	/**
	 * @param skillSet the skillSet to set
	 */
	public void setSkillSet(Set<SkillSet> skillSet) {
		this.skillSet = skillSet;
	}
	
	

}
