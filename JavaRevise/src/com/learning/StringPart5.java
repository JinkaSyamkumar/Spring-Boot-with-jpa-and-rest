/**
 * 
 */
package com.learning;

/**
 * @author syamkumarj
 *
 */
public class StringPart5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String class, we can parse string and find substrings

		String s1 = "Jinka Syamkumar";
		System.out.println("Length of string - "+s1.length());
		
		//we can get position of substring
		int position = s1.indexOf("Syamkumar");
		System.out.println("position of substring - "+position);
		
		//splitting with positions ..has 3 different parameters
		
		String s2 = s1.substring(6, s1.length());
		System.out.println("substring - "+s2);
		
		//below string has bunch of spaces at the end
		String s3="hello          ";
		int length = s3.length();
		System.out.println("with space - "+length);
		//to trim, we can call trim()
		String s4=s3.trim();
		int length1 =s4.length();
		System.out.println("trim - "+length1);
		
		//how to start with a string and convert it to primtives using parse method
		String s5 ="123";
		//Now i want to convert it to primitive types, we use helper class
		int fromString = Integer.parseInt(s5);
		double d = Double.parseDouble(s5);
		System.out.println("parsed from string to int - "+fromString);
		System.out.println("parsed from string to double - "+d);
	}

}
