package com.learning.demo.data.entity;



import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.Set;


/**
 * The persistent class for the sme_3 database table.
 * 
 */
@Entity
@Table(name="sme_3")
//@NamedQuery(name="Sme3.findAll", query="SELECT s FROM Sme3 s")
public class Sme3 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="app_id", unique=true, nullable=false, precision=131089)
	private long appId;

	@Column(name="app_name", nullable=false, length=2147483647)
	private String appName;

	//bi-directional many-to-many association to Employee3
	@ManyToMany(mappedBy="sme3s", cascade={CascadeType.ALL})
	@JsonBackReference
	private Set<Employee3> employee3s;

	public Sme3() {
	}

	/**
	 * @param appId
	 * @param appName
	 */
	public Sme3(long appId, String appName) {
		super();
		this.appId = appId;
		this.appName = appName;
	}

	public long getAppId() {
		return this.appId;
	}

	public void setAppId(long appId) {
		this.appId = appId;
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public Set<Employee3> getEmployee3s() {
		return this.employee3s;
	}

	public void setEmployee3s(Set<Employee3> employee3s) {
		this.employee3s = employee3s;
	}

}