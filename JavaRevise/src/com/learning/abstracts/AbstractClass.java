/**
 * 
 */
package com.learning.abstracts;

/**
 * @author syamkumarj
 *
 */
public abstract class AbstractClass {
	
	private String name;

	public AbstractClass() {
		super();
	}

	public AbstractClass(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return "Abstract class";
	}
	
	public abstract String sayMyName();

}
