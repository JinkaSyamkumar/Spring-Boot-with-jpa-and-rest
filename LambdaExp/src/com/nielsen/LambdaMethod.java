/**
 * 
 */
package com.nielsen;

import java.math.BigInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

/**
 * @author syamkumarj
 *
 */
//##3
public class LambdaMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
/*		in java 8 , any type of method can be converted to lambda
		including static methods, instance methods and even constructors
		below, u can find example for each of above*/
		
		IntFunction<String> intToString = num -> Integer.toString(num);
		System.out.println(intToString.apply(123));
		
/*		Integer::toString - this is the structure that creates lambda from method - called METHODREFERENCE
		METHODREFERENCE - enables us to pass refernces of methods or constructors with the :: colon colon syntax*/
		
		//static METHOD REFERENCE using ::
		//observe we have not specified any variable on the right hand side like num in above
		//Integer::toString - compiler understands that it should expect integer and should return String
		IntFunction<String> intToString1= Integer::toString;
		System.out.println(intToString1.apply(123));
		
		//Constructor METHOD REFERENCE - lambdas made using a constructor
		//BigInteger::new - mean whatever u give, will return new BigInteger object
		Function<String,BigInteger> newBigInt = BigInteger::new;
		System.out.println(newBigInt.apply("1234"));
		
		//Instance METHOD REFERENCE - example of a lambda made from an instance method
		Consumer<String> print=System.out::println;
		print.accept("coming to you directly from lambda...");
		
		UnaryOperator<String> makeGreeting ="Hello"::concat;
		System.out.println(makeGreeting.apply("Syam"));
		
		
		
		
	}

}
