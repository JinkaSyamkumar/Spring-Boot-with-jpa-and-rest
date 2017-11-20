/**
 * 
 */
package com.learning.utility;

/**
 * @author syamkumarj
 *
 */
public class MathHelper {

	public static double multiply(String s1, String s2) {
		// TODO Auto-generated method stub
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1*d2;
	}
	public static double diff(String s1, String s2) {
		// TODO Auto-generated method stub
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1-d2;
	}

	public static double addValues(String s1, String s2) {
		// TODO Auto-generated method stub
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1+d2;
	}
}
