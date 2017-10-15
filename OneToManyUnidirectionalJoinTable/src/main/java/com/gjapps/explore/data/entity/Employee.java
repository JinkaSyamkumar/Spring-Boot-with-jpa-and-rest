/**
 * 
 */
package com.gjapps.explore.data.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Syam
 *
 */
@Entity
@Table(name = "employee4")
public class Employee {

	@Id
	@Column(name = "emp_id")
	private String id;

	@Column(name = "name")
	private String name;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name = "emp4_skill1", 
			   joinColumns = @JoinColumn(name = "emp_id"), 
			   inverseJoinColumns = @JoinColumn(name = "skill_id"))
	private List<SkillSet> skillSets;

	public Employee() {

	}

	//SkillSets is not part of employee table so it wont be part of constructor
	public Employee(String id, String name) {

		this.id = id;
		this.name = name;
	}

	/**
	 * @return the skillSets
	 */

	
	public List<SkillSet> getSkillSets() {
		return skillSets;
	}

	/**
	 * @param skillSets
	 *            the skillSets to set
	 */
	public void setSkillSets(List<SkillSet> skillSets) {
		this.skillSets = skillSets;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
