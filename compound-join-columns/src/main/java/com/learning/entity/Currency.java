/**
 * 
 */
package com.learning.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.learning.ids.CurrencyId;

/**
 * @author syamkumarj
 *
 */
@Entity
@Table(name="currency", schema="public")
@IdClass(value=CurrencyId.class)
public class Currency {
	@Id
	@Column(name="name")
	private String name;
	
	@Id
	@Column(name="country_name")
	private String countryName;
	
	@Column(name="symbol")
	private String symbol;

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

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	
}
