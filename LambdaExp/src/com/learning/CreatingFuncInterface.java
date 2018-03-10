package com.learning;

/**
 * @author syamkumarj
 *
 */
//##4
public class CreatingFuncInterface {

	public static void main(String[] args) {
		
		/*Allthoogh java.util.function provides many functional interface but sometimes we have to create our own
		functional interfaces
		We can create it in a new file or can include it in the existing file
		wherever we write FI , we should use @FunctionalInterface */
		
		//example of passing multiple values to a method using lambda
		//here observe that we are specifying data types
		CustomFIInterface add=(a,b)->a+b;
		CustomFIInterface difference = (a,b) -> Math.abs(a-b);
		CustomFIInterface divide = (a,b) -> (b!=0 ?a/b:0);
		//ustomFIInterface add - mean we are creating object for interface fi class and assigning behaviour
		
		System.out.println(add.calc(2,3));
		System.out.println(difference.calc(3,2));
		System.out.println(divide.calc(4,2));
	}
}
