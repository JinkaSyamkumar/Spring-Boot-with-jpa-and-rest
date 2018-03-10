/**
 * 
 */
package com.learning.interfaces;

/**
 * @author syamkumarj
 *
 */
public class InterfaceExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//"Programming/CODE to interface than implementation" is one of the popular Object oriented design principle, 
		//and use of interface promotes this. A code written on interface is much more flexible than the one which is written on implementation.

		//	Here getName() method defined in interface
		//so you can access it directly but when you try to access getSelfName(), you get error
		//because getSelfName only available in ExampleInterfaceImpl NOT IN ExampleInterface and our object is of type ExampleInterface
		ExampleInterface interfaceObject = new ExampleInterfaceImpl();
		interfaceObject.getName();
		//interfaceObject.getSelfName();
		
		//you can not create instance for interface but
		//incase if you want to you have to owrite implementation for it
		ExampleInterface interfaceObject1 = new ExampleInterface() {
			public String getName() {
				return "hello";
			}
		};
		
/*		1. Interface in java is declared using keyword interface and it represent a Type like any Class in Java. a reference variable of 
		type interface can point to any implementation of that interface in Java. Its also a good Object oriented design principle 
		to "program for interfaces than implementation" because when you use interface to declare reference variable, 
		method return type or method argument you are flexible enough to accept any future implementation of that 
				interface which could be much better and high performance alternative of current implementation. similarly calling any method
				on interface doesn't tie you with any particular implementation and you can leverage  benefit of better or 
				improved implementation over time.
					
		2) All variables declared inside interface is implicitly *****public final variable or constants. 
		which brings a useful case of using Interface for declaring Constants. We have used both Class 
		and interface for storing application wide constants and advantage of using Interface was that
		 you can implement interface and can directly access constants without referring them with class name which was the case earlier
		  when Class is used for storing Constants. Though after introduction of static imports in 
		  Java 5 this approach doesn't offer any benefit over Class approach.

		3) All methods declared inside Java Interfaces are implicitly ****** public and abstract, 
		even if you don't use public or abstract keyword. you can not define any concrete method in interface.
		 That's why interface is used to define contracts in terms of variables and methods and 
		 you can rely on its implementation for performing job.

		4) In Java its legal for an interface to extend multiple interface. for example following code will run without any compilation error:*/

	}

}
