/**
 * 
 */
package com.learning.abstracts;

/**
 * @author syamkumarj
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		
		
		//System.out.println(abstractClass2.getName());
	}
}
