 /**
 * 
 */
package com.learning;

/**
 * @author syamkumarj
 * 6
 */
public class StringPart1_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] chars= {'h','e','l','l','o'};
		String s = new String(chars);
		System.out.println("char to string - "+s);
		
		//same in reverse
		String name ="syam";
		char[] chars1 = name.toCharArray();
		for(char c:chars1) {
			System.out.println("string to char - "+c);
		}
		
	}

}
