/**
 * 
 */
package com.learning.utility;

/**
 * @author syamkumarj
 *
 */
public class UserModel_2 {

	private String name="syam";
	private int age=25;
	private char gender='M';
	private int savings=600;
	
/*	1.A CONSTRUCTOR METHOD starts with public access modifier
	2.we no need to return any value
	3.Name of the constructor method should be same as class name*/
	
	public UserModel_2() {} //- is no argument constructor
	
	//with arguments
	//to distinguish between parameters and instance variables we use this keyword which indicates that this is instance variabele of this class
	public UserModel_2(String name,int age,char gender,int savings) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.savings=savings;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getSavings() {
		return savings;
	}
	public void setSavings(int savings) {
		this.savings = savings;
	}
}
