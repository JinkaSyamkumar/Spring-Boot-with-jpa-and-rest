/**
 * 
 */
package com.learning.apitest.vo;

/**
 * @author syamkumarj
 *
 */
public class ProductItemVO {

	private int id;
	private int upc;
	private String brand;
	private String brandDesc;
	private int size;
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
	public String getBrandDesc() {
		return brandDesc;
	}
	public void setBrandDesc(String brandDesc) {
		this.brandDesc = brandDesc;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	/**
	 * @param id
	 * @param upc
	 * @param brand
	 * @param brandDesc
	 * @param size
	 */
	public ProductItemVO(int id, int upc, String brand, String brandDesc, int size) {
		super();
		this.id = id;
		this.upc = upc;
		this.brand = brand;
		this.brandDesc = brandDesc;
		this.size = size;
	}

	
	
}
