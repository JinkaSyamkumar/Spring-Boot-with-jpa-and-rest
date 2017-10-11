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
public class Sme3VO {
	private long appId;
	private String appName;
	private Set<Employee3> employee3s;
	public long getAppId() {
		return appId;
	}
	public void setAppId(long appId) {
		this.appId = appId;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public Set<Employee3> getEmployee3s() {
		return employee3s;
	}
	public void setEmployee3s(Set<Employee3> employee3s) {
		this.employee3s = employee3s;
	}
	
}
