/**
 * 
 */
package com.learning;

import com.learning.utility.SubUser;

/**
 * @author syamkumarj
 *
 */
public class InheritanceAndPolymorphism25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Apart from Encapsulation, Inheritance and Polymorphism is another two big topics that we need to master OOPS
		
		/*A.Inheritance in JAVA means
		 * 1.There is Relationship between classes in your application that let you inherit and extend functionality from one class to other class
		 * 2.C++ supports multiple inheritance but ****JAVA supports only Single Inheritance
		 * 3.Each class can extend or inherit functionality from only one class
		 * 4.This actually a advantage because if you run into a bug, it will be either in parent or child in a liner way
		 * 5.Java supports classes can implement multiple interfaces */
		
		/*B.About Inheritance
		 * 1.Inheritance relation can be described as
		 * 		parent/child
		 * 		base/derived
		 * 		superclass/subclass - Preferred*/
		
		/*C.About Polymorphism
		 * 1.an object either be addressed as either super type or subtype 
		 * 2.List, ArrayList - here List is interface, ArrayList implements the interface
		 * 3.This is similar to super class and subclass
		 * 4.I declare a object as List but instantiate it as ArrayList, so it is an arraylist but also a List
		 * 5.same for polymorphism - super and sub type
		 * **like 4 -->polymorphism -  Writes methods that accepts supertype(like list) as arguments And passes instances of subtypes(like arraylist)
		 * 	 It increases code flexibility and reusability
		 * 
		 * 	You can think of a method taking supertype as argument as a Contract - mean as long as this object extends this supertype 
		 * 	i will expect it, bcz thats the guarantee that subtype will implement super type functionality
		 * 	Above is know as CONTRACT BASED PROGRAMMING - comes with inheritance*/
		
		/*If you take UserModel_4 , it is a class , It does not extend any otherclass
		but every class extends Object class IMPLICITLY that is why we get toString() method by default because it is part of Object class
		and as we are inheriting toString from Object super class, everytime you want to give special behaviour we override toString() method */
		
/*		SUPERCLASSES
			Super class does not need any special code, any class can be super class if it extends by other
			If a class is "final" , we CAN NOT Extend it
			All fields and methods are inherited unless marked PRIVATE
			So the common practice is to mark fields as private and getters/setters as public or any other method as protected
			Mark methods accessed by sub as protected or public
		
		And if any other class extends our UserModel class it will use extends keyword*/
		
		SubUser subUser = new SubUser();
		SubUser subUser2 = new SubUser("hi");
		
		//no arg 
		System.out.println(subUser.getName());
		System.out.println(subUser.getName1());
		
		//arg
		System.out.println(subUser2.getName());
		System.out.println(subUser2.getName1());
		
	}

}
