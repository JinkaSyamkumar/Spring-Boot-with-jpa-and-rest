/**
 * 
 */
package com.learning;

/**
 * @author syamkumarj
 *5
 */
public class SelfInstantiatingClass5 {
	//BELOW 3 ARE IMPORTANT
	/*	INSTANCE VARIABLE
	INSTANTIATION
	INSTANCE METHOD*/
	/*	Instance variable
	 * 	Below does not have Static keyword in the declaration.It means
	it is not member of the class then what? called INSTANCEVARIABLE OR FIELDS
	An instance variable is not member of class.It is member of  *INSTANCE* OF THE CLASS
	Instance Variable*/
	public String type;

	/*below has static ie Member of the class - that is why it does not require any call*/
	public static void main(String[] args) {
		/*Instantiation
		 * Below we are creating instance of the class
		 * data type --> SelfInstantiatingClass  ie name of the the class
		 * identifier --> item ie name of the variable
		 * keyword --> new
		 * constructor method --> SelfInstantiatingClass()
		 * thats how we create instance of any class
		 * we need all 4 --> datatype , identifier , new , constructor method to perform instantiation
		 * */

		SelfInstantiatingClass5 sic = new SelfInstantiatingClass5();

		sic.type="hello";
		sic.display();	
	}
	/*Instnace Method
	 * no static keyword - so it is member of the instance of the class not member of the class
	 * so we need to call from object ie what is happening at sic.display() where sic is instance of the class
	 * */
	public void display() {
		/*below this refers to current INSTANCE of the class*/
		System.out.println("type"+ this.type);
	}

}
