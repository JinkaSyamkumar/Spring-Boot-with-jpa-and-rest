/**
 * 
 */
package com.learning;

/**
 * @author syamkumarj
 *
 */
public class PassArgsByRefOrPassByValue11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//is whether arguments passed to a method are passed by reference or by value?
		
		//Passing to a method by Copy mean
			//The method receives a copy of the variable
		    //As it is copied to a new variable, whatever you change you make it to the variable, wont affect the original
		//Passing to a method by reference
			//The method receives a reference to the original object.
			//As you are passing reference of the original, whatever change you make to the variable in the method, will reflect on the original
		
	//****In JAVA, Primitive VARIABLES ARE ALWAYS PASSED BY COPY!!!!!! BUT makes you think you are passing by refeRENCE BUT IT NOT!! It is always BY copy
	//1.Primitives
		//original value wont change as it is by copy, it creates new variable
		int originalValue=10;
		System.out.println("Calling method");
		increment(originalValue);
		System.out.println("original value - "+originalValue);
		
	//****In JAVA, Complex Objects are always passed BY REFERENCE
	//2.Objects - Primitives wrapped in Complex objects- array is complex object but values referenced by array are primitives
	//here original array also changes
	//**object variable reference points to a location in memory
	//when object variable is passed to function, a new reference is always created
	//so below originalValue1 and methods arrayObject points to the same location in memory
	//so whatever you change will reflect back
		int[] originalValue1 = {1,5,10};
		System.out.println("Calling method");
		increment(originalValue1);
		System.out.println("original value - "+originalValue1[0]);
		
	//***String even though it is also complex object, but it is SPECIAL
	//As String is Immutable, it is always PASS BY VALUE - a new copy is created always
		String original="original";
		System.out.println("Calling method");
		print(original);
		System.out.println("original value - "+original);
	}

	
	public static void increment(int s) {
		s++;
		System.out.println("in method - value - "+s);
	}
	
	public static void increment(int[] arrayObject) {
		arrayObject[0]++;
		System.out.println("in method - value - "+arrayObject[0]);
	}
	public static void print(String s) {
		s="new";
		System.out.println("in method - value - "+s);
	}

}
