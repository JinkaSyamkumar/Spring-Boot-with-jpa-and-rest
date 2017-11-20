/**
 * 
 */
package com.learning.utility;

/**
 * @author syamkumarj
 *
 */
public class SubUser extends UserModel_4 {
	
	//comment the no arg constructor in usermodel4, then we will get error below
	//because, we have implicit constructor is not there, because we have defined explicit constructor
	//so you have to MUST CALL Explicit constructor with Super key word
	//WHEN YOU CALL subuser constructor, it will create object for subuser and also to usermodel
	//both will be called
	//whether u have explicit or implicit constructor of parent
	public SubUser() {
		super("syam", 25, 'C', 800, EnumClass.INFY);
		System.out.println("no arg constructor - parent and child called");
	}
	
	private String name1;
	
	//here in below case we will have both initialized , because we added instance variable
	public SubUser(String name) {
		super("syam1", 25, 'C', 800, EnumClass.INFY);
		this.name1=name;
		System.out.println("arg constructor - parent and child called");
	}
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	
	

}
