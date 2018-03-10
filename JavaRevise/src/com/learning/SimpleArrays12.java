/**
 * 
 */
package com.learning;

import java.util.Arrays;

/**
 * @author syamkumarj
 *
 */
public class SimpleArrays12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arrays can point to any variable Primitives or Objects
		//you can declare int[] intArray or int intArray[]
		//PREFERRED WAY IS int[] intArray
		//values should be given in {} with , separated
		
		//*****once set, you can not increase the size
		
		System.out.println("Array of primitives");
		int[] intArray = {4,3,2,1};
		for (int i : intArray) {
			System.out.println(i);
		}
		
		//***here if you uncomment, you get exception - ArrayIndexOutOfBoundsException 
		//	intArray[4]=7;
		
		//Sorting array
		Arrays.sort(intArray);
		for (int i : intArray) {
			System.out.println(i);
		}
		
		System.out.println("Array of strings");
		String[] stringArray = {"a","b","c"};
		for (String string : stringArray) {
			System.out.println(string);
		}
		
		System.out.println("Setting an initial size");
		int[] intSized = new int[4];
		for (int i = 0; i < intSized.length; i++) {
			intSized[i]=i;
			
		}
		for (int i : intSized) {
			System.out.println(i);
		}
		
		//*****when you copy array, original also will be effected like below
		//so we should always "clone" which copies entire array
		//and if you want to copy from specific position you can use System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		
		System.out.println("Copying an array");
		int[] copiedArray = intArray;
		copiedArray[0]=99;
		for (int i : copiedArray) {
			System.out.println(i);
		}
		for (int i : intArray) {
			System.out.println(i);
		}
		
		System.out.println("Cloning an array");
		int[] cloneArray = intArray.clone();
		cloneArray[0]=999;
		for (int i : cloneArray) {
			System.out.println(i);
		}
		for (int i : intArray) {
			System.out.println(i);
		}
		
		System.out.println("Array copying wiyh System.arraycopy");
		int[] syscopyArray = new int[4];
		int[] y;
		System.arraycopy(intArray, 0, syscopyArray, 0, 4);
		for (int i : syscopyArray) {
			System.out.println(i);
		}
		for (int i : intArray) {
			System.out.println(i);
		}
	}

}
