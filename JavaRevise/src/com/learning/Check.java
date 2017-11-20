/**
 * 
 */
package com.learning;

/**
 * @author syamkumarj
 *
 */
public class Check {

	private String s;
	private static String name="syam";
	
	public Check() {
		this.s="hello";
	}
	public Check(String s) {
		this.s="hello";
	}
	
	public String getS() {
		return s;
	}


	public void setS(String s) {
		this.s = s;
	}


	public static String getName() {
		return name;
	}


	public static void setName(String name) {
		Check.name = name;
	}


	public void display() {
		System.out.println(this.s);
		
	}
}
