/**
 * 
 */
package com.learning.primitivestream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author syamkumarj
 *
 */
public class PrimitiveStreams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntStream.range(1,4)
		.forEach(System.out::println);
		
		//find the average of the nos squared
		Arrays.stream(new int[] {1,2,3,4})
		.map(n->n*n)
		.average()
		.ifPresent(System.out::println);
		
		//map doubles to int
		Stream.of(1.5,2.3,3.7)
		.mapToInt(Double::intValue)
		.forEach(System.out::println);

	}
	

}
