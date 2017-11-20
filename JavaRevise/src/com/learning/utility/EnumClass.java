package com.learning.utility;

//1.public -so accessible by other
//enum - to mark this as type of enum
public enum EnumClass {

	//2.vales added as simple list - separated by COMMA
	//A
	TCS,INFY;
	
	
	
	
	//3.inorder to transalate enumerations identifier value to string
	
	//a.declare a string variable and make it ***private to the enumerations
	//b.create a constructor method for enum,**constructor to enum will be called enum itself so we can not keep
	//***no public keyword on it
	//c.set it up to recieve String
	//now to access name value go to identifier
	//TCS, START () AND ENTER YOU STRING
	//d.whenever this instance of enum output to the console,we want the string () in to be displayed to do that, we need to override toString method
	//the default one just translates identifier without string value so we override
	//****Every java class and enum has toString method
	
	//B
	/*TCS("TCS ltd"),INFY("Infosys Ltd");
	private String name;
	
	EnumClass(String name) {
		this.name=name;
	}
	
	@Override
	public String toString() {
		return name;
	}*/
	
}
