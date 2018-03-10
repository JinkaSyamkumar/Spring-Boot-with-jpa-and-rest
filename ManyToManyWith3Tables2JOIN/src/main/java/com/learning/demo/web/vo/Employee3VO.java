/**
 * 
 */
package com.learning.demo.web.vo;

import java.util.Set;

import com.learning.demo.data.entity.Skillset3;
import com.learning.demo.data.entity.Sme3;

/**
 * @author syamkumarj
 *
 */
public class Employee3VO {
	private long empId;
	private String name;
	private Set<Sme3> sme3s;
	private Set<Skillset3> skillset3s;
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Sme3> getSme3s() {
		return sme3s;
	}
	public void setSme3s(Set<Sme3> sme3s) {
		this.sme3s = sme3s;
	}
	public Set<Skillset3> getSkillset3s() {
		return skillset3s;
	}
	public void setSkillset3s(Set<Skillset3> skillset3s) {
		this.skillset3s = skillset3s;
	}
	
}
