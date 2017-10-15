package com.learning.demo.entity;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="user_3")
public class ElementCollectionCompositeTypes {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@ElementCollection
	@CollectionTable(name="user3_address",
	joinColumns=@JoinColumn(name="id"))
	private Set<AddressCompositeClass> addresses;

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

	public Set<AddressCompositeClass> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<AddressCompositeClass> addresses) {
		this.addresses = addresses;
	}

	
}
