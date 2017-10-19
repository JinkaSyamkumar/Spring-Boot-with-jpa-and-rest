/**
 * 
 */
package com.learning.ids;

import java.io.Serializable;



/**
 * @author syamkumarj
 *
 */
public class CurrencyId implements Serializable{


	private String name;
	
	private String countryName;

	
	/**
	 * 
	 */
	public CurrencyId() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param countryName
	 */
	public CurrencyId(String name, String countryName) {
		super();
		this.name = name;
		this.countryName = countryName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	
}
