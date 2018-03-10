/**
 * 
 */
package com.learning;

/**
 * @author syamkumarj
 *
 */
public class SyntaxErrorsVsRuntimeExceptions8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String welcome = "Welcome!";
		char[] chars = welcome.toCharArray();
		try {
			char lastChar = chars[chars.length];
		} catch (Exception e) {
			e.printStackTrace();
		}

		// to throw custom exception

		try {
			if (chars.length < 10) {
				throw (new Exception("My Exception"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}

}
