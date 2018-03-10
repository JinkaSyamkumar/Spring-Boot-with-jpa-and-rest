/**
 * 
 */
package com.learning.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author syamkumarj
 *
 */
@Entity
@Table(name="transactions")
public class Transact {

	@Id
	@Column(name="transaction_id")
	private Long id;

	
	@Temporal(TemporalType.DATE)
	@Column(name="insert_date")
	private Date insertTime;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getInsertTime() {
		return insertTime;
	}


	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}


	@Override
	public String toString() {
		return "Transact [id=" + id + ", insertTime=" + insertTime + "]";
	}
	
	
}
