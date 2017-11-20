/**
 * 
 */
package com.learning;

import java.util.ArrayList;
import java.util.List;

/**
 * @author syamkumarj
 *
 */
public class ResizableArrayWithArrayList14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//java collections is a set of interfaces and classes that make managing data in your application easy
		//we can manage ordered or unordered data and we can use one of 4 categories of classes
		//Set,List,Dequeue and Map
		//check Collection Framework.png diagram
		
		//ArrayList and HashMap are most used
		
		//List is a member of java.util package
		//can contain as many items
		//but always declare what type of items it will hold through GENERICS by DIAMOND OPERATOR
		//****EACH ITEM IN LIST MUST BE INSTANCE OF A CLASS..ie ONLY OBJECTS so only INTEGER,String etc
		// and below we are creating instance for CONCRETE IMPLEMENTATION OF list ie ArrayList new ArrayList<>(); not interface
		//if you want to use new List , you need to implement all methods of List interface
		//you can restrict no elements through <>() -> <>(4)
		
		List<String> list = new ArrayList<>();
		//****prior to java7, we have to pass data type to implementation as well but it is not required in java7 and later
		//List<String> list = new ArrayList<String>();
		//Arraylist contains ordered collection of data.
		
		list.add("syam");
		list.add("syam");
		list.add("syam");
		
		System.out.println(list);
		//here when we call sysout on list , it calls toString() automatically
		
		list.add("jinka");
		
		//removing based on index
		list.remove(2);
		System.out.println(list);
		
		//getting
		System.out.println(list.get(2));
		
		//finding a element
		int pos = list.indexOf("jinka");
		System.out.println("jinka at position - "+pos);
	}

}
