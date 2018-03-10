/**
 * 
 */
package com.learning;

import java.util.Scanner;

import com.learning.utility.MathHelper;

/**
 * @author syamkumarj
 *
 */
public class CreatingNestedAndAnonymousClasses19_Calculator {

	//1.Earlier we created custom class which can be accessed anywhere
	//MathHelper class is public and its methods are public so it can be accessed easily

	//2.but we can also define classes that be nested inside another classes
	//these classes are only available to their parent classes

	
	public static void main(String[] args) {	
		//3.We can call calculate like below but lets have a class and instantiate with that
		//calculate();
		
		// 4.Create class object through instantiation - like below
		// {datatype} {variable} = and we instantiate with a keyword ***new AND *** constructor method 
		// {datatype} {variable} = {new keyword} {constructor method}
		CreatingNestedAndAnonymousClasses19_Calculator calculator = new CreatingNestedAndAnonymousClasses19_Calculator();
		// {datatype} {variable} = {new keyword} {constructor method} --> but if you see, there is no constructor method available in this class
		// but np, javacompiler creates a default constructor with no arguments for every class if there is none
		
		//5.if a method is defined with static, it can be accessed only class because its a class method
		//to make it accessible, below we comment it from static..class method to instance method which should be called by instance method
		
		calculator.calculate();
		
	}

	//6.protected - that means this method can be accessed by any class in the same package
	//protected static void calculate() {
	//check 7 below in the end
	protected void calculate() {
		
		InputHelper helper = new InputHelper();
		String s1 = helper.readInput("Enter a numeric value 1: ");
		String s2 = helper.readInput("Enter a numeric value 2: ");
		String op = helper.readInput("Choose An opration to performx-> + - * : ");
		double result =0;
		String msg = null;
		try {
			switch (op) {
			case "+":
				msg="sum of "+s1+" and "+s2+" is ";
				result = MathHelper.addValues(s1,s2);
				break;
			case "-":
				msg="difference of "+s1+" and "+s2+" is ";
				result = MathHelper.diff(s1,s2);
				break;
			case "*":
				msg="multiplication of "+s1+" and "+s2+" is ";
				result = MathHelper.multiply(s1,s2);
				break;
			default:
				msg="unrecognized operation!";
				break;
			}
			System.out.println("Output -"+msg+""+result);
		}catch(Exception e) {
			System.out.println("Number Formatting Exception");
		}
	}

	//7.We make readInput into a new nested class
	//And nested class can not have static methods only super class can have
	//so now getinput is instance method of InputHelper class
	//And this class is only available to CreatingNestedAndAnonymousClasses19_Calculator , BCOZ THATS WHERE IT IS DEFINED.
	//eventhough method is declared private, it can be still accessible by parent
	class InputHelper{
		private String readInput(String string) {
		System.out.println(string);
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
}
}


