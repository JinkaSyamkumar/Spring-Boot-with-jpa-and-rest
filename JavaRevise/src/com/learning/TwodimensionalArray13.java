/**
 * 
 */
package com.learning;

/**
 * @author syamkumarj
 *
 */
public class TwodimensionalArray13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//works similar to simple array but instead of taking single param, it takes multiple params
		String[][] states = new String[3][2];
		//String[3][2] here first [3] means it has three arrays
		//[2] means each arary has 2 elements l
		//just like matrix
		
		states[0][0] ="Andhra";
		states[0][1] ="AMR";
		states[1][0] ="TN";
		states[1][1] ="CHENNAI";
		states[2][0] ="TS";
		states[2][1] ="HYD";
		
		for (int i = 0; i < states.length; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append("The capital of ")
				.append(states[i][0])
				.append(" is ")
				.append(states[i][1]);
			System.out.println(sb);
		}
		for (String[] strings : states) {//it fetches first array which has two elements
			for (String string : strings) {
				System.out.println(string);
			}
			
		}
		
	}

}
