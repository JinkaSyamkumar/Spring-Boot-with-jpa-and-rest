package com.nielsen;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
//### 1
public class FunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		//Predicate Functional Interface - using test method
		//Predicate - takes one argument and returns boolean result - true/false
		//Predicate is a interface so we will override test method
		//stringLen here is the REFERENCE to the logic ie method reference
		//can be used FI's abstract method to invoke - stringLen.test();
		Predicate<String> stringLen= (s) -> s.length() < 10;
		//(s) - have not given any type, but as the predicate/any has already defined type Predicae<String>
		// (s) type will be auto infered
		//above s is a string so we can access all string class related functions
		System.out.println(stringLen.test("apples") +"- apples length less than 10");
		
		//Consumer Functional Interface - useing accept method
		//Consumer - takes a argument and does NOT return any.
		Consumer<String> consumer= (s) -> System.out.println(s.toLowerCase());
		consumer.accept("JINKA SYAMKUMAR");
		
		//Function interface - using apply method
		//takes one INPUT - converter.apply(26))
		//Function takes two arguments - Function<Integer,String> - 1 is input coming to and 2 is value returning
		//below takes Integer input and covertes it to String
		Function<Integer,String> fun = (num) -> Integer.toString(num);
		System.out.println("String"+fun.apply(26));
		System.out.println("length - "+fun.apply(26).length());
		
		//Supplier - using get() method
		//used to produce results
		//takes no argument - () - must to use - ()
		Supplier<String> supp = () -> "I can produce result without input args!!";
		System.out.println(supp.get()+"- done");
		
		//BinaryOperator - using apply method
		//takes two arguments - works on it and produces a single result
		BinaryOperator<Integer> s = (a , b)-> a+b;
		System.out.println("add 10 and 12 - "+s.apply(10, 12));
		
		UnaryOperator<String> str = (msg) -> msg.toUpperCase();
		System.out.println(str.apply("my message - "));
		
	}

}
