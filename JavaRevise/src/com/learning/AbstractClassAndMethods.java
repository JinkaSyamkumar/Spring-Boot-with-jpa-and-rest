package com.learning;

import com.learning.abstracts.AbstractClass;

public class AbstractClassAndMethods {
	
	//We can frequently choose between interface and abstract classes
	
	//An abstract class is a class with Abstract keyword - 
	//meaning of abstract in english is EXISTING IN THOUGHT OR an IDEA but not having any physical or concrete existence
	//It can contain a mixture of fully implemented methods and abstract methods
	
	//An abstract method is just like a method in interface infact all methods in interface are abstract it does not any implementations bcz abstract means an idea which does not any physical existence
	//It just indicates method signature
	
	//All sub classes of abstract class must implememnt
	
	//An abstract class may or may not contain abstract methods
	//but if a abstract method is present in a class it must be marked as abstract class
	
	//abstract method just signature no body
	//if u uncomment below in com.learning.abstracts--abstractclass.java - u get error saying abstract can not have body
	/*public abstract String sayMyName() {
		return "name";
	}*/
	
	//And if a class has absract method it must be marked as abstract class
	//and u write method or thought and u can just leave it as suh
	/*public abstract class AbstractClass {
		
		private String name;

		public AbstractClass(String name) {
			super();
			this.name = name;
		}
		
		public String getName() {
			return "name";
		}
		
		public abstract String sayMyName();

	}*/
	
	
	//in future if u get solution to idea or though , u can create a subclass
	//and any subclass that extends abstract class must have implementation
/*	public class AbstractClassExtend extends AbstractClass{
		
		//as there is no default constructor in parent 
		//you must explicitly declare one here using super
		
		public AbstractClassExtend() {
			super("hello");
		}

		@Override
		public String sayMyName() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}*/
	
/*	And the only way subclass can escape without implemeting abstract methods of parent class
	**by marking subclass also ABSTRACT*/
/*	public abstract class AbstractClassExtend extends AbstractClass{	
		//as there is no default constructor in parent 
		//you must explicitly declare one here using super	
		public AbstractClassExtend() {
			super("hello");
		}
	}*/
	
	//abstract classes can not be instantiated
	//AbstractClass abstractClass = new AbstractClass("syam");
	
	//polymorphic way works
	//AbstractClass abstractClass2 = new AbstractClassExtend();
	
	//only way u can have 1 to work is by adding implemetation  to abstract methods 
	//JUST LIKE INTERFACES
/*		AbstractClass abstractClass1 = new AbstractClass() {
		@Override
		public String sayMyName() {
			// TODO Auto-generated method stub
			return null;
		}
	};*/

	//CHECK COM.LEARNING.INTERFACES
}
