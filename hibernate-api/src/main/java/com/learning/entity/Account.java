/**
 * 
 */
package com.learning.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author syamkumarj
 *
 */
@Entity
@Table(name="account",schema="public")
public class Account {
	@Id
	@Column(name="account_no")
	private Long accountno;
	
	@Column(name="holder_name")
	private String holdername;
	
	@Column(name="holder_bank")
	private String holderbank;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="account_no", nullable=false)
	private List<Transact> transactions = new ArrayList<Transact>();
	public Long getAccountno() {
		return accountno;
	}

	public void setAccountno(Long accountno) {
		this.accountno = accountno;
	}

	public String getHoldername() {
		return holdername;
	}

	public void setHoldername(String holdername) {
		this.holdername = holdername;
	}

	public String getHolderbank() {
		return holderbank;
	}

	public void setHolderbank(String holderbank) {
		this.holderbank = holderbank;
	}

	public List<Transact> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transact> transactions) {
		this.transactions = transactions;
	}

	
}
