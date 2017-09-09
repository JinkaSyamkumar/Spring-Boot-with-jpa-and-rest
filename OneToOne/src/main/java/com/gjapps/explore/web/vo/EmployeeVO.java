/**
 * 
 */
package com.gjapps.explore.web.vo;

import com.gjapps.explore.data.entity.EmpAddress;

/**
 * @author Syam
 *
 */
public class EmployeeVO {
	
	private String id;
	private String name;
	private EmpAddress empAddress;
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
