/**
 * 
 */
package com.learning.demo.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author syamkumarj
 *
 */
@Entity
@Table(name="user_details")
public class CompositeTypeUserEntity {
	
	@Id
	@Column(name="user_id")
	private int id;
	
	@Column(name="name_")
	private String name;
	
/*	Below are fields which can be added just like below
 * but having it separate class helps us to maintain better
 * so we take all and move to new class AddressCompositeClass - this called Composite Value type
 * After the class is created annotate the AddressCompositeClass.java with @Embeddable
 * @Embeddable - indicates this class is Composite class and can be embedded in other class
 * @Embedded -  * and also in the parent class variable use @Embedded on the composite value type
 * 			 -  it is optional, if not mentioned hibernate will go to mention datatype of the class and looks for embeddable annotation
 * 
 * 
 * 	@Column(name="address_line1")
	private String addressLine1;
	
	@Column(name="address_line2")
	private String addressLine2;
	
	@Column(name="city")
	private String city;*/
	
	@Embedded
	private AddressCompositeClass address = new AddressCompositeClass();

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

	public AddressCompositeClass getAddress() {
		return address;
	}

	public void setAddress(AddressCompositeClass address) {
		this.address = address;
	}
	
	
	

}
