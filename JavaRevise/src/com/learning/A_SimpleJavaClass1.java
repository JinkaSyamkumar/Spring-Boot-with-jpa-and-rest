
package com.learning; //package declaration



//1
public class A_SimpleJavaClass1 { //class declaration

	
	public static void main(String[] args) { //main method
		//public - means METHOD is accessible to entire application
		//static - means this METHOD can be called directly from class definition rather than by instance of the class
		//void - mean this method wont written anything
		//main name must
		//String[] - expects array of strings
		//args - user defined, not necessarily "args", can be anything
		
		System.out.println();//executable body
		System.out.println(Runtime.getRuntime().maxMemory());
		
		System.out.println(long.class.getPackage());
		System.out.println(String.class.getPackage());
	    System.out.println(Object[].class.getPackage());
	   
	    //int  i =2;
	    //boolean true1= (i instanceof java.lang.Integer);
	}

}
