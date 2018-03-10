/**
 * 
 */
package com.learning.demo.entity;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.Table;

/**
 * @author syamkumarj
 *
 */
@Entity
@Table(name="user_2")
public class MapOfBasicValues {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@ElementCollection
	@CollectionTable(name="user2_contacts",
	joinColumns=@JoinColumn(name="id"))
	@MapKeyColumn(name="type")
	@Column(name="contact_no")
	private Map<String, String> contacts = new HashMap<String,String>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getContacts() {
		return contacts;
	}

	public void setContacts(Map<String, String> contacts) {
		this.contacts = contacts;
	}
	
	

}
