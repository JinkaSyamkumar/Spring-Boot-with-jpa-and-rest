package com.learning.demo.entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="user_1")
public class ElementCollectionBasicValueTypes {
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
/*	ElementCollection defines its going to be collection of elements
	CollectionTable defines details about join table and joining column details
	Column defines column where the collection values will be saved*/
	@ElementCollection
	@CollectionTable(name="user1_contacts",
	joinColumns=@JoinColumn(name="id"))
	@Column(name="contact_no")
	private Collection<String> contacts = new ArrayList<String>();

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

	public Collection<String> getContacts() {
		return contacts;
	}

	public void setContacts(Collection<String> contacts) {
		this.contacts = contacts;
	}
	
	
}
