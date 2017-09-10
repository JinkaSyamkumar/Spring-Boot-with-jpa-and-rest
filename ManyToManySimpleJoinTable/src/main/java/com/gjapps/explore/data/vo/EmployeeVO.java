package com.gjapps.explore.data.vo;

import java.util.Set;

import com.gjapps.explore.data.entity.SkillSet;

public class EmployeeVO {

	private String id;
	private String name;
	private Set<SkillSet> skillSet;
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
