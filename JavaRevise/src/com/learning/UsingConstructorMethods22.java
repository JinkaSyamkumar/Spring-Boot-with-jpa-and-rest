package com.learning;

import java.util.ArrayList;
import java.util.List;

import com.learning.utility.UserModel_2;
import com.learning.utility.UsersSavings;

public class UsingConstructorMethods22 {

	public static void main(String[] args) {
		
		//1.when we create a instance of class - we typically call its constructor method
		//below we are calling constructor 3 times
		//but we have not created any constructor in usermodel 
		//but because of java compiler you get default constructor, javac creates it for you
		
		//***2.And if you have a constructor that receives argument,Then no argument constructor wont be GENERATED
		
		//3.After creating Argument constructor, if you access NO ARG CONST like below, you will get compilation error saying there is no such constructor
		//so if you have argument constructor, u need to create default constructor manually
		//UserModel_2 userModel1 = new UserModel_2();
		
		//4.We can have as many as constructors untill their signature differs
		
		//5.Check UserModel_2.java
		
		List<UserModel_2> userModels = new ArrayList<>();
		
		//6.now we makke use of arg constructor
		UserModel_2 userModel1 = new UserModel_2("jinka",25,'M',1000);
		userModels.add(userModel1);
		
		UserModel_2 userModel2 = new UserModel_2("SYAM",25,'M',1000); 
		userModels.add(userModel2);
		
		UserModel_2 userModel3 = new UserModel_2("jinkaSY",25,'M',1000); 
		userModels.add(userModel3);
		
		//7.aBOVE WE ARE CREATED object and then adding 
		//instead of two lines, we can do it in single line
		//userModels.add(new UserModel_2("jinkaSY",25,'M',1000));
		//even with above we still have 3 objects created but the advantage is no need to refrence variables
		
		UsersSavings usersSavings = new UsersSavings();
		int totalSavings = usersSavings.getSavingSS(userModels);
		System.out.println(totalSavings);
	}
}
