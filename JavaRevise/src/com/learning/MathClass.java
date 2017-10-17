/**
 * 
 */
package com.learning;

/**
 * @author syamkumarj
 *
 */
public class MathClass {

	//Math class is part of java.lang.math - so does not require any import - provided by default by java.lang
	
	public static void main(String[] args) {
		
		int intValue1=56;
		int intValue2=34;
		
		int sum = intValue1 + intValue2;
		System.out.println("sum - "+sum);
		
		int diff = intValue1 - intValue2;
		System.out.println("diff - "+diff);
		
		double division = (double)intValue1/intValue2;
		System.out.println("div - "+division);
		
		double remainder = (double)intValue1 % intValue2;
		System.out.println("remainder - "+remainder);
		
		int multiply = intValue1 * intValue2;
		System.out.println("multiply - "+multiply);
		
		double dvalue = -3.999999;
		long round = Math.round(dvalue);
		
/*		Round - Returns the closest long to the argument, with ties rounding to positive infinity.
		Special cases:
		If the argument is NaN, the result is 0.
		If the argument is negative infinity or any value less than or equal to the value of Long.MIN_VALUE, 
			the result is equal to the value of Long.MIN_VALUE.
		If the argument is positive infinity or any value greater than or equal to the value of Long.MAX_VALUE, 
			the result is equal to the value of Long.MAX_VALUE.*/
		System.out.println("round"+round);
		
		System.out.println("abs"+Math.abs(dvalue));
/*		Abs - Returns the absolute value of a double value. 
 * 			If the argument is not negative, the argument is returned. 
 * 			If the argument is negative, the negation of the argument is returned. 
 * 		Special cases:
			If the argument is positive zero or negative zero, the result is positive zero.
			If the argument is infinite, the result is positive infinity.
			If the argument is NaN, the result is NaN.*/
		
		System.out.println("Adding numbers - AddExact - for int and long - "+Math.addExact(2, 3));
		
		System.out.println("Arc sin - "+Math.asin(.55));
		
		
	}
}
