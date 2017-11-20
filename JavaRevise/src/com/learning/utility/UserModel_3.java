/**
 * 
 */
package com.learning.utility;

/**
 * @author syamkumarj
 *
 */
public class UserModel_3 {
	
	
	//1.here each of the const is public, because we need to access it in another class, it is upto req.
	//2.static keyword - so we can refer to it from class declaration
	//3.final keyword- marking it can not be changed
	//4.datatype
	//5.name - ALLL CAPS
	
	//here company
	public static final String TCS="TCS Ltd";
	public static final String INFY="Infosys Ltd";
	
	
	private String name="syam";
	private String company="TCS Ltd";
	private int age=25;
	private char gender='M';
	private int savings=600;
	
	public UserModel_3() {}
	
	public UserModel_3(String name,int age,char gender,int savings,String company) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.savings=savings;
		this.company=company;
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
}
