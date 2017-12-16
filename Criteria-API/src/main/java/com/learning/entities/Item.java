package com.learning.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class Item {
	
	@Id
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="initial_price")
	private int initialValue;
	
	@Column(name="max_price")
	private int maxValue;
	
	/**
	 * 
	 */
	public Item() {
		super();
	}
	
	/**
	 * @param id
	 * @param name
	 */
//	public Item(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}
	

	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param initialValue
	 * @param maxValue
	 */
	public Item(int id, String name, String description, int initialValue, int maxValue) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.initialValue = initialValue;
		this.maxValue = maxValue;
	}
	/**
	 * @param id
	 * @param name
	 * @param description
	 */
/*	public Item(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}*/

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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getInitialValue() {
		return initialValue;
	}
	public void setInitialValue(int initialValue) {
		this.initialValue = initialValue;
	}
	public int getMaxValue() {
		return maxValue;
	}
	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", description=" + description + ", initialValue=" + initialValue
				+ ", maxValue=" + maxValue + "]";
	}
	
	

}
