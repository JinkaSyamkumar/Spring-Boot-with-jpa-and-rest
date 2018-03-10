/**
 * 
 */
package com.learning.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author syamkumarj
 *
 */
public class CollectionLambda {
	
	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("Jinka","Syam","Kumar","A","z");
		//How it is before java 8
		Collections.sort(names, new Comparator<String>(){

			@Override
			public int compare(String a, String b) {
				// TODO Auto-generated method stub
				return b.compareTo(a);
			}
		
	});
		
		System.out.println(names);
		
		//first iteration with lambda
		Collections.sort(names,(String a, String b) -> b.compareTo(a));
		System.out.println(names);
		
		//remove the data types and allow the compiler to infer the type
		Collections.sort(names,(a,b)->b.compareTo(a));
		
		//Creating book objects
		List<Books> books = Arrays.asList(new Books("Title1","Fname1","Lname1",35),new Books("Title2","Fname2","Lname2",35));
		
		//Using .collect to aggregate values
		int total=books.stream().collect(Collectors.summingInt(Books::getPages));
		System.out.println(total);
		
		//Using .collect to aggregate firstnames into a list
		//**Using .map to get the last name of the author
		List<String> fnames=books.stream().map(Books::getAuthorFName).collect(Collectors.toList());
		System.out.println(fnames);
		
		Books book1 = new Books("Title1","Fname1","Lname1",35);
		Books book2 = new Books("Title2","Fname2","Lname2",35);
		
		//Create a list with duplicates
		//2 ways - one with constructor like below
/*	1	List<Books> dupbooks = Arrays.asList(new Books("Title1","Fname1","Lname1",35),new Books("Title2","Fname2","Lname2",35),
				new Books("Title1","Fname1","Lname1",35),new Books("Title2","Fname2","Lname2",35));*/
		//2 with objects
		List<Books> dupbooks = Arrays.asList(book2,book1,book1,book2);

		System.out.println("With dups:");
		System.out.println(dupbooks.toString());
		
		//remove duplicates using a set
		//if we use 2 way, it will delete duplicates and shows only unique
		//if we use 1 , it wont remove any dups so follow second approach
		Collection<Books> noDups = new HashSet<>(dupbooks);
		System.out.println("Without dups:");
		System.out.println(noDups.toString());
		
		//using Set<> instead of Collection<>
		List<Integer> dupbooks1 = Arrays.asList(2,3,4,5,8,7);
		Set<Integer> nodupsSet=new HashSet<>(dupbooks1);
		System.out.println("Without dups:");
		System.out.println(nodupsSet.toString());
		
		//*****in JAVA 8, preferred way of iterating over a collections
		//is to use Stream and aggregator on it
		
		
	}
}
