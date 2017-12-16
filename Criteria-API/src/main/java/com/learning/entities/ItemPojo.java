package com.learning.entities;

import javax.persistence.Column;

public class ItemPojo {

	private int id_;
	
	private String name_;
	
	private String description_;

	
	public int getId_() {
		return id_;
	}

	public void setId_(int id_) {
		this.id_ = id_;
	}

	public String getName_() {
		return name_;
	}

	public void setName_(String name_) {
		this.name_ = name_;
	}

	public String getDescription_() {
		return description_;
	}

	public void setDescription_(String description_) {
		this.description_ = description_;
	}

	@Override
	public String toString() {
		return "ItemPojo [id_=" + id_ + ", name_=" + name_ + ", description_=" + description_ + "]";
	}

	/**
	 * 
	 */
	public ItemPojo() {
		super();
	}

	

	
	
	
}
