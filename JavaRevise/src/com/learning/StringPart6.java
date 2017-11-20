/**
 * 
 */
package com.learning;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author syamkumarj
 *
 */
public class StringPart6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//how to start with a string and convert it to primtives using parse method
		//and also we can go from primitive to string
		
		double doubleValue = 1_234_678.89;
		
		NumberFormat numF = NumberFormat.getInstance();
		System.out.println(numF.format(doubleValue));
		
		Locale locale = new Locale("da", "DK");
		NumberFormat numF1 = NumberFormat.getInstance(locale);
		System.out.println("with locale - "+numF1.format(doubleValue));
		
		Locale locale1 = new Locale("en", "IN");
		NumberFormat numF2 = NumberFormat.getCurrencyInstance(locale1);
		System.out.println("with lcurrency - "+numF2.format(doubleValue));
		
		//we also have IntegerInstance
		NumberFormat numF3 = NumberFormat.getIntegerInstance();
		System.out.println("with integer - "+numF3.format(doubleValue)); //no decimal values will be shown
	}

}
