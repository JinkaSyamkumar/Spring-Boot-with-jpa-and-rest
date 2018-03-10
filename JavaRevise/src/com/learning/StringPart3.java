/**
 * 
 */
package com.learning;

import java.util.Scanner;

/**
 * @author syamkumarj
 *
 */
public class StringPart3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str1 = "jinka";
		String str2 = "syam";
		String str3 = "kumar";

		String str4 = str1 + ", " + str2 + " " + str3;
		System.out.println(str4);

		// when we go with above, we are creating 5 objects because every time you
		// concatenate a new object will be created
		// which is not good to avoid this we can use StringBuilder
		// no special imports
		StringBuilder sb = new StringBuilder("jinka");
		sb.append(", ");
		sb.append("syam ");
		sb.append("kumar");
		System.out.println(sb);

		// main advantage is here only one object is created.
		// with string builder object, each of method we call like append , it return
		// reference a refrence to that string builder object
		// so we can chain calls together that means
		StringBuilder sb1 = new StringBuilder("jinka")
								.append(", ")
								.append("syam ")
								.append("kumar");
		System.out.println(sb1);
		
		//We can also use string builder to capture the data
		Scanner scanner = new Scanner(System.in); 
		//Scanner takes different inputs, we use inputstream one such is system.in, 
		//system.out prints to console similarly ssytem.in takes from console
		System.out.print("Enter value : ");
		String input = scanner.nextLine();
		System.out.println(input);
		
		sb.delete(0, sb.length());
		for (int i = 0; i < 3; i++) {
			//input = scanner.nextLine();
			sb.append(scanner.nextLine()+"\n");
		}
		System.out.println(sb); //when we print sb, it auto calls sb.toString() so no need to call explicitly
		
		//String Builder class to put strings together at runtime while minimizing the no of objects that we create in memory 
	}

}
