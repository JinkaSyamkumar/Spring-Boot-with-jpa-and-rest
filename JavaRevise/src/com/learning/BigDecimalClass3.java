/**
 * 
 */
package com.learning;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author syamkumarj
 * 3
 */
public class BigDecimalClass3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double dValue = 0.012;
		double psum = dValue+dValue+dValue;
		System.out.println("summed double value - actual value - 0.36 but value is -> "+psum);
		
		//To use , Big Decimal , value should be converted to String
		System.out.println("First Step - Converting to String value");
		String str = Double.toString(dValue);
		System.out.println("After conversion :"+str);
		
		//Assigning string to BigDecimal type
		System.out.println("Second Step - Assigning to BigDecimal");
		BigDecimal bigValue = new BigDecimal(str);
		
		System.out.println("BigDecimal value:"+bigValue);
		System.out.println("Third Step - using BigDecimal add method to sum up  ");
		BigDecimal bigSum = bigValue.add(bigValue).add(bigValue);
		System.out.println("Sum Value:"+bigSum);
		//BigInteger bi = new BigInte

	}

}
