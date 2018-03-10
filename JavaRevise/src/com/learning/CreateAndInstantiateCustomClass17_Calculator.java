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
public class CreateAndInstantiateCustomClass17_Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//bELOW IS BROKEN INTO CLASS CONCEPT CHECK CreateAndInstantiateCustomClass18_Calculator
		
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
			result = addValues(s1,s2);
			break;
		case "-":
			msg="difference of "+s1+" and "+s2+" is ";
			result = diff(s1,s2);
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
	private static double multiply(String s1, String s2) {
		// TODO Auto-generated method stub
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1*d2;
	}
	private static double diff(String s1, String s2) {
		// TODO Auto-generated method stub
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1-d2;
	}

	private static double addValues(String s1, String s2) {
		// TODO Auto-generated method stub
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1+d2;
	}

	private static String readInput(String string) {

		System.out.println(string);
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}

	//ABOVE IS BROKEN INTO CLASS CONCEPT CHECK CreateAndInstantiateCustomClass18_Calculator
}
