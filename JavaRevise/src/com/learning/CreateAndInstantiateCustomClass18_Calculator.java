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
public class CreateAndInstantiateCustomClass18_Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//bELOW IS BROKEN INTO CLASS CONCEPT CHECK CreateAndInstantiateCustomClass18_Calculator
		
/*		here we created a new class MathHelper , so it can be accessed from anywhere.
		Thats the first rule of encapsulation - breaking methods in to classes*/
		
		/*Creating and Instantiating Custom Classes*/
		for (int i = 0; i < 10; i++) {

		String s1 = readInput("Enter a numeric value 1: ");
		String s2 = readInput("Enter a numeric value 2: ");
		String op = readInput("Choose An opration to performx-> + - * : ");
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
	}

	private static String readInput(String string) {

		System.out.println(string);
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

}
