/**
 * 
 */
package com.learning;

import java.util.Iterator;

/**
 * @author syamkumarj
 *
 */
public class LoopingThrough10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] months = {"A","B","C","D","E","F","G"};
	
		//java provides many ways to loop through data
		
		//1.Incremental loop
		//here i++ is the incremental 
		
		for (int i = 0; i < months.length; i++) {
			String string = months[i];
			System.out.println("Stringvalue : "+string);
		}
		
		//ONE OF THE ADVANTAGE IN INCREMENTING LOOP like this is we can work through from start to end or end to start
		
		// 2.Decremental
		for (int i =months.length-1;i>=0; i--) {
			String string1 = months[i];
			System.out.println("stringvalue"+string1);
			
		}
		
		//3.For each 
		for (String string : months) {
			System.out.println("string value -"+string);
		}
		
		//for each good but not so in decrementing- only one way
		
		//4.while loop
		//a while loop examines a condition and keeps on conditioning as long as condition is true
		//below it executes as long as couner is less than months.length
		//while does not increment in it declaration , we have to ourself
		int counter=0;
		while(counter <months.length) {
			System.out.println(months[counter]);
			counter++;
		}
		
		//5.Do while loop
		//what you want to do, keep it in do block
		//while takes the condition AND ENDS With ;
		//do this sysout , and then increment it and test it
		int counter1=0;
		do {
			System.out.println(months[counter1]);
			counter1++;
		}
		while(counter1 <months.length) ;
	
	
	//difference while and do..while loop check image whileVSdo..while.jpg
	//while executes only condition is true but do while block will be executed at least once
	
	int total=10;
	while(total<10) {
		System.out.println("while - total is "+total);
	}
	
	do {
		System.out.println("do - total is "+total);
		total++;
	}while(total<10);
	

}
}
