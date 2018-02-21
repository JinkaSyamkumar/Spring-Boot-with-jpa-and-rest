/**
 * 
 */
package com.learning.apitest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author syamkumarj
 *
 */
@Entity
@Table(name = "product_item", schema = "public")
public class ProductItem {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="my_generator")
	@SequenceGenerator(name="my_generator", sequenceName="skillset_seq")
	@Column(name="id")
	private int id;
	
	@Column(name="upc")
	private int upc;
	
	@Column(name="brand")
	private String brand;
	
	@Column(name="brand_description")
	private String brandDescription;
	
	@Column(name="size")
	private int size;
	
	
	
	/**
	 * 
	 */
	public ProductItem() {
		super();
	}
	/**
	 * @param id
	 * @param upc
	 * @param brand
	 * @param brandDescription
	 * @param size
	 */
	public ProductItem(int id, int upc, String brand, String brandDescription, int size) {
		super();
		this.id = id;
		this.upc = upc;
		this.brand = brand;
		this.brandDescription = brandDescription;
		this.size = size;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUpc() {
		return upc;
	}
	public void setUpc(int upc) {
		this.upc = upc;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrandDescription() {
		return brandDescription;
	}
	public void setBrandDescription(String brandDescription) {
		this.brandDescription = brandDescription;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

}

