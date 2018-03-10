/**
 * 
 */
package com.learning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.learning.utility.UserModel_4;

/**
 * @author syamkumarj
 *
 */
public class Interface26 {

/*	In object oriented programming Interface is a contract
	It defines methods with particular signature and any class that implements that interface must implement those methods
	if you take List<> and Map<> are interfaces*/
	
	
	public static void main(String[] args) {
		//Below List<UserModel_4> userList -- means we are declaring object "userList" which is instance of List 
		List<UserModel_4> userList = new ArrayList<>();
		//but then we are using the concrete implementation that List ie ARRAYlIST
		//like -- Polymorphism is declaring a uniform interface that isn't type aware, leaving implementation details to concrete types that implement the interface.
		//List will have all the methods or properties that needed to be called a list ie it defines Contract
		//AND ITs  UPTO concrete classes how they make use of that mean ArrayList if you take , 
		//it wants ordering ie ****how you insert,will come in the same way( NOT LIKE ordering by firstname or last name )when you add,, so
		//it implements List interface so it has to override or provide implemtation for add method..it writes such a way that when you add the add logic takes care od ordering
		//similarly linked list is different, so when you add..it has itw own mechanism
			
		//ordering means - how insert will come in the same way..not like order by name/age like..it just outputs value the same order how you inserted
		List<String> myList = new ArrayList<>();
		myList.add("A");
		myList.add("C");
		myList.add("B");
		for (Iterator iterator = myList.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}
		
	//****	All variables declared inside interface is implicitly *****public final variable or constants. 
	//****  All methods declared inside Java Interfaces are implicitly ****** public and abstract, 
		
		//********check com.learning.interfaces package
	}

}
