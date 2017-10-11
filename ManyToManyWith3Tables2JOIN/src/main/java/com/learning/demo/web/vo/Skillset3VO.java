/**
 * 
 */
package com.learning.demo.web.vo;

import java.util.Set;

import com.learning.demo.data.entity.Employee3;

/**
 * @author syamkumarj
 *
 */
public class Skillset3VO {
	private long techId;
	private String techName;
	private Set<Employee3> employee3s;
	public long getTechId() {
		return techId;
	}
	public void setTechId(long techId) {
		this.techId = techId;
	}
	public String getTechName() {
		return techName;
	}
	public void setTechName(String techName) {
		this.techName = techName;
	}
	public Set<Employee3> getEmployee3s() {
		return employee3s;
	}
	public void setEmployee3s(Set<Employee3> employee3s) {
		this.employee3s = employee3s;
	}
	
	
}
