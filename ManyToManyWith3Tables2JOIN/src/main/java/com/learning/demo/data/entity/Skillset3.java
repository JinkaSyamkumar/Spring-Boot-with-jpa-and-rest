package com.learning.demo.data.entity;



import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.Set;


/**
 * The persistent class for the skillset_3 database table.
 * 
 */
@Entity
@Table(name="skillset_3")
//@NamedQuery(name="Skillset3.findAll", query="SELECT s FROM Skillset3 s")
public class Skillset3 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tech_id", unique=true, nullable=false, precision=131089)
	private long techId;

	@Column(name="tech_name", nullable=false, length=2147483647)
	private String techName;

	//bi-directional many-to-many association to Employee3
	@ManyToMany(mappedBy="skillset3s")
	@JsonBackReference
	private Set<Employee3> employee3s;

	public Skillset3() {
	}

	/**
	 * @param techId
	 * @param techName
	 */
	public Skillset3(long techId, String techName) {
		super();
		this.techId = techId;
		this.techName = techName;
	}

	public long getTechId() {
		return this.techId;
	}

	public void setTechId(long techId) {
		this.techId = techId;
	}

	public String getTechName() {
		return this.techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}

	public Set<Employee3> getEmployee3s() {
		return this.employee3s;
	}

	public void setEmployee3s(Set<Employee3> employee3s) {
		this.employee3s = employee3s;
	}

}