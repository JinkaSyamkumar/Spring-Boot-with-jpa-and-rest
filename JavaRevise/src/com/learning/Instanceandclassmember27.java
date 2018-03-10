/**
 * 
 */
package com.learning;

/**
 * @author syamkumarj
 *
 */
public class Instanceandclassmember27 {

	//private String s;

	//private static String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Check c = new Check();
		String c1 ="hello";
		System.out.println("instance variable"+c.getS());
		System.out.println("class member eventhough not part of constructor, we can still access - "+c.getName());
		//but should be accessed by Check.getName()
		char x[]= {'h','e','l','l','o'};
		String s[]= {"hello","iam"};
		String s1 = new String(x);
	//	String s2= ['h','e','l','l','o'];
	//	String s2= {'h','e','l','l','o'};
	}

}
