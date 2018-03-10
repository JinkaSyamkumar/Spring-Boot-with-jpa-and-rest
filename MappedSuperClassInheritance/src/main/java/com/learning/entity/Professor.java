package com.learning.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prof")
public class Professor extends CommonProps{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="prof_id")
	private int id;
	
	@Column(name="exp")
	private int exp;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
}
