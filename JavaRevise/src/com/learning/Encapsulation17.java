/**
 * 
 */
package com.learning;

/**
 * @author syamkumarj
 *
 */
public class Encapsulation17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Java is object oriented language.(makes development and code maintaining easier)
		 * One of the main principles of OOPS is Encapsulation 
		 * 1. Encapsulation means - Packaging functionality for ease of programming*/
		
		/*		10.Benifits of ENCAPSULATION
		A.When you encapsulate code, it breaks functionality into small,maintainable units
		B.groups functions and data together wrapping it up in classes which can be instantiated when needed
		C.Supporting testing of software at a granular level*/
		
       /*When a new programmer uses java, they usually put everything in main method
		but as the application grows, having lot of code in main method causes it to difficult to maintain and to work with.
		**so instead you want to break the code into individual classes and packaging them based on business req.
		Above gives great advantage
			- Not all functionality needs to available for all parts of application
		***2 .with Encapsulation 
		Access to individual functions can be restricted.
		Each class can be put in a particular package and each method access can be specified by
		public,private and protected*/
		
        /*3.Each of those methods can hide complex functionality.
		So if a person is working file io, he can continue and he can expose those methods as an api
		so other person no need to worry about the logic and can simply call it.*/
		
        /*4.The true nature of encapsulated data may also be hidden
		Hiding functionality goes to data storage too.When you encapsulate data access, you are essentially hiding the mechanism, 
		how the data is stored.like a method will be writing data to json later u can update it to write in xml without impacting other
		so this way encapsulation reduces the application breakup*/
		
		/*5.nonenpasulated.jpg- you need to know how to operate it fully.put olives, pull one lever, 
		once crushed pull different lever etc*/
		
		/*6.enpasulated.jpg - Most of the encapsulated machines wrapup and hides complex functionality in big box.Here you dont have to know much about when pull
		which lever, you just have to press a button..there is still levers and everything but all wrapped up and hidden*/
		
		/*7.Non Encapsulated code can be complex
		Below code may look simple but imagine, u r doing similar functionality with 100 lines of code and everything in single main method
		public static void main(String[] args) {
		Olive[] olives = {new Olive(),new Olive()};
		OliveOil oil = new OliveOil();
		OlivePress press = new OlivePress():
			for(Olive olive:olives) {
				olive.crush();
				oil.add(olive);
			}
			}*/
		
/*		***8 Encapsulating Code
		In java , it is recommended to break application in to multiple classes
		We take code from main method and we create  a new class OlivePress
		constructore takes care of creating array of Olives
		and instance method takes care of metod impl.
		public class OlivePress {
			private Olive[] _olives;
			public void OlivePress(Olive[] olives) {
				this._olives = olives;
			}
			public OliveOil getOil() {
				....implementations
			}
		}*/
		
		/*9...With above 8 , 7 becomes simpler
		in 7 - we just call encapsulated method
		OlivePress press = new OlivePress({new Olive(),new Olive(),new Olive()});
		OliveOil oil = press.getOil(olives);*/
		
		//9 is equivalent of pressing the single button in encapsulated machine
		

		
		
	}

}
