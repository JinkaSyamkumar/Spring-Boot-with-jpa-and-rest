package com.learning.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author syamkumarj
 *
 */
public class StreamLambda {

	public static void main(String[] args) {
		//few examples
		Arrays.asList("red", "green", "yellow")
				.stream() // creates stream of above
				.sorted() // sorts above stream
				.findFirst() // gets first element
				.ifPresent(System.out::println);

		// another way to create a collection using stream
		// using stream with a filter
		Stream.of("apple", "pear", "banana", "cherry", "apricot")
			.filter(fruit -> {
//			 System.out.println("filter :"+fruit);
			return fruit.startsWith("a"); // predicate
		})
		// if foreach removed, ntng will print
		// the foreach makes it a terminal event
		// without foreach, code wont trigger filter operation
		 .forEach(fruit ->System.out.println("starts with a :"+fruit));
		// check commenting above line and uncommenting sysout line filter above

		// using stream and map operation to create a list of words in caps
		// here collect is terminal , without this intermediate wont be called by the
		// code
		List<String> collected = Stream.of("Java", "Rocks")
				.map(string -> string.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(collected.toString());
		
		//execute below to understand how the filter and foreach work together
		//filter wont happen on entire list, it takes firstelement checks is it starting with a, if yes, passes it to foreach and
		//next takes another element, tests it, if it is not starting, wont pass it to foreach, goes back gets next
		//what we should understand here is filter wont work on entire list, each value goes one time
		//it wont search for element starting with "a" on entire list
		System.out.println("Testing how filter and foreach works");
		Stream.of("apple", "pear", "banana", "cherry", "apricot")
		.filter(fruit -> {
			System.out.println("filter :"+fruit);
		return fruit.startsWith("a"); // predicate
	})
	 .forEach(fruit ->System.out.println("starts with a :"+fruit));

	}
}
