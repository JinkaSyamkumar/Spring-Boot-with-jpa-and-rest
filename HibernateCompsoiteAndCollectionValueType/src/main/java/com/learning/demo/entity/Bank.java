/**
 * 
 */
package com.learning.demo.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author syamkumarj
 *
 */
@Entity
@Table(name="bank_details")
public class Bank {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
/*	here - if we use directly addresscompositeclass, we will get error
	because in addressCompositeclass they are mapped addressLine1 ATTRIBUTE TO to a column named "address_line1"
	but in bank entity we have column named"bank_address_line 1"
	so we use below annotation to override
	we have 3 attributes in AddressCompositeClass - but we rae overriding only two
	because third column name - city - same in bank entity also */
	
	@AttributeOverrides({
		@AttributeOverride(name="addressLine1",column=@Column(name="bank_address_line1")),
		@AttributeOverride(name="addressLine2",column=@Column(name="bank_address_line2"))
	})
	private AddressCompositeClass addressCompositeClass;

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

	public AddressCompositeClass getAddressCompositeClass() {
		return addressCompositeClass;
	}

	public void setAddressCompositeClass(AddressCompositeClass addressCompositeClass) {
		this.addressCompositeClass = addressCompositeClass;
	}

	
}
