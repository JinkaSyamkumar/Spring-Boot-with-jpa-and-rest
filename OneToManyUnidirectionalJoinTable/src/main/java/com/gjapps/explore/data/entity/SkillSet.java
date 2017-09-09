/**
 * 
 */
package com.gjapps.explore.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Syam
 *
 */
@Entity
@Table(name="skillset")
public class SkillSet {

	@Id
	@Column(name="tech_id")
	private int id;
	
	@Column(name="tech_name")
	private String techName;

	
	/**
	 * 
	 */
	public SkillSet() {
	}

	public SkillSet(int id, String techName) {
		this.id=id;
		this.techName=techName;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SkillSet [id=" + id + ", techName=" + techName + "]";
	}
	
	
	
	
}
