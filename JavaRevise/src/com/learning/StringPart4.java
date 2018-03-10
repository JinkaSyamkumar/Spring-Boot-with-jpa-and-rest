package com.learning;

public class StringPart4 {

	public static void main(String[] args) {
		/*
		 * Using equality operator like in numbers for string does not work == == It
		 * works great with numbers boolean and char but not with string It looks like
		 * it works
		 */

		String str1 = "syam";
		String str2 = "syam";

		if (str1 == str2) {
			System.out.println("They match");
		} else {
			System.out.println("They dont match");
		}

		// above shows true value but thats not the final

		String str3 = "SYAM";
		if (str1 == str3) {
			System.out.println("They match");
		} else {
			System.out.println("They dont match");
		}

		// Clearly above isfalse as 1 is lowercase and 3 is uppercase

		// Now is the important one
		String part1 = "Syam ";
		String part2 = "kumar";
		String str4 = part1 + part2;
		String str5 = "Syam kumar";
		if (str4 == str5) {
			System.out.println("They match");
		} else {
			System.out.println("They dont match");
		}
		
		//if(str1 == str2) {
	/*	here what happened is when we created str1="Hello", it created a object
	 *  and again str2 = "syam" when you created str2 , it did not create a new object because as the values of str2 is same as str1..it simply pointed str2 to str1 object
	 *  THIS IS CALLED INTERNING, compiler interns the second value , it finds the original value and it finds a match and then INTERNS/MAKE REFERENCE*/ 
		
		//if (str1 == str3) {
		/*In this case, it did not find a match because of upper and lower case diff so it created a new value */
		
		//if (str4 == str5) {
		/*here str4 is part1+part2 , they are their own objects during compilation time compiler does not have enough information to say str5 also be having the same value
		 * so str5 will be created as new object and str4 which is combination of two also be created as a new object because it does not know what part1 and part2 going to be at compilation time
		 * so when we tried to match with == they dont match because they are treated as different objects
		 * INORDER TO DO ACCURATE MATCHING WE SHOULD USE equals/equalsignorecase
		 * so always use EQUALS and EQUALSIGNORECASE
		 * */
		if (str4.equals(str5)) {
			System.out.println("They match");
		} else {
			System.out.println("They dont match");
		}
		if (str1.equalsIgnoreCase(str3)) {
			System.out.println("They match");
		} else {
			System.out.println("They dont match");
		}
		
	}
}
