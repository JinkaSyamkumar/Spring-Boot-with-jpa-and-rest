/**
 * 
 */
package com.learning;

import java.util.Scanner;

/**
 * @author syamkumarj
 *
 */
public class ConditionalProgramming9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int monthNumber =8;
		
		//Conditional
		if(monthNumber>8) {
			System.out.println("if");
		}else if(monthNumber>6) {
			System.out.println("else if");
		}else {
			System.out.println("else");
		}

		//return value must be assigned
		String s=(monthNumber>8)?"true":"false";
		
		//with switch we can write more efficient code than multiple else if 
		//place the value you want to examine in () - switch()
		//each case starts with the value you want to match followed by a colon
		//code you want to execute goes after : , unlike if else no need of ;
		//every case should have break except default
		//if no break it goes through executing code inside every case
		//default will be executed if no match found
		switch(monthNumber) {
		
		case 1:
			System.out.println("This is a");
			break;
		case 2:
			System.out.println("This is b");
			break;
		case 3:
			System.out.println("This is c");
			break;
		default:
			System.out.println("This is d");
			
		}
		
		//Prior to java7 only primitives, numerics and char were supported in switch cases
		//but with 7 and later we can try strings also
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter a value: ");
		String letter =scanner.nextLine();
		
	switch(letter) {
		
		case "A":
			System.out.println("This is a");
			break;
		case "B":
			System.out.println("This is b");
			break;
		case "C":
			System.out.println("This is c");
			break;
		default:
			System.out.println("nOT SURE");
			
		}
	String s1="c";
	
	//we have continue keyword, it should be used inside loops not in switch
	//continue skips  continues the current flow of the program and skips the remaining code at specified condition.
	//In case of inner loop, it continues only inner loop.
	//below prints everything except 5
	for(int i=1;i<=10;i++){  
        if(i==5){  
            continue;  
        }  
        System.out.println(i);  
    }  
}
}