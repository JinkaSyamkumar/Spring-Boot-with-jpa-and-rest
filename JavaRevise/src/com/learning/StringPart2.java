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
public class StringPart2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intValue=23;
		String fromInt = Integer.toString(intValue);
		//is equivalent to
		Integer intObject = new Integer(intValue);
		String fromIntObj = intObject.toString(); //		String s = new Integer(x).toString();
		System.out.println("from int - "+fromInt);
		
		boolean boolValue = true;
		String fromBoolean = Boolean.toString(boolValue);
		System.out.println("from boolean - "+fromBoolean);
		
		float floatValue = 2.13f;
		String fromFloat = Float.toString(floatValue);
		System.out.println("from float value - "+fromFloat);
		
		long longValue = 1_000_000; //1000000; _ feature added in java7
		String fromLong = Long.toString(longValue);
		System.out.println("from Long"+fromLong);
		
		//Suppose u formatted string to readable value with underscrores
		//but when we converted, it went back to being same
		//how to change it?
		//Locale bLocale = new Locale.Builder().setLanguage("en").setRegion("IN").build();
		NumberFormat formatter = NumberFormat.getInstance();
		String formatted = formatter.format(longValue);
		System.out.println("formatted "+formatted);
	}

}
