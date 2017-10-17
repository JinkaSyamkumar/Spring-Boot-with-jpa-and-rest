package com.learning;
// 2
public class PrimitiveHelperClass {

/*	Data Types OR Variables
	Variables - used to store data in memory
	There are two major types - 1.PRIMITIVES
							  - 2.OBJECTS
	Primitive Data Types
		- used to store Numbers , characters and booleans		
		- * they are stored in fastest available memory
		- names are all lowercase
		- Not a primitive - String*/

	public static void main(String[] args) {
	
		//primitive data types
		byte b=1;
		short s =1;
		int i=1;
		long l= 1L;
		
		float f=1f;
		double d=2d;
		
		System.out.println("byte:"+b);
		System.out.println("short"+s);
		System.out.println("int"+i);
		System.out.println("long"+l);
		System.out.println("float"+f);
		System.out.println("double"+d);
		
/*		Java Class Library includes helper classes for each primitive-part of JRE 
		Helper classes support conversion from one primitive type to other and formatting tools
		Each of helper class above is a member of java.lang package.
		All of the classes in java.lang are available to you at the run time by JRE without any special declarations.*/
		
		double doubleValue=256.57d;
		System.out.println(doubleValue);
		
		//Above is primitive type.To convert that into other types
		//create helper class type ie Double Object
		Double dObject = new Double(doubleValue);
		
		//Now it is in Double object format
		//Now we can convert to any type - if necessary truncates and assigns
		
		//if u assign directly, without the help of Helper class - u get Type Mismatch error - below
		//byte byteValue = doubleValue;
		
		//byte - 128 to 128
		byte byteValue = dObject.byteValue();
		System.out.println("byteValue:"+byteValue);
		
		//-32,768 to 32,767
		short shortValue=dObject.shortValue();
		System.out.println("shortValue:"+shortValue);
		
		//2147483648 to 2147483647
		int intValue= dObject.intValue();
		System.out.println("intValue:"+intValue);
		
		//-9.22337E+18 to 9.22337E+18
		long longValue=dObject.longValue();
		System.out.println("longValue:"+longValue);
		
		float floatValue = dObject.floatValue();
		System.out.println("floatValue:"+floatValue);
		
		//casting to String
		String stringValue = dObject.toString();
		System.out.println("stringValue:"+ stringValue);
		
		/*byte range -128 to 128 
		 * What happens when try to assign a value bigger*/ 
		
		//trying with 129
		//when u assign directly, u get error saying type mismatch can not convert from int to byte
		//byte x = 129;
		//we can not assign but what if we cast with helper class
		double test = 129;
		Double testObject = new Double(test);
		byte b2 = testObject.byteValue();
		System.out.println("assigning greater value than range - 129: "+b2);
		
		//it goes negative range and starts printing value till 256
		double test1 = 256;
		Double testObject1 = new Double(test1);
		byte b1 = testObject1.byteValue();
		System.out.println("assigning greater value than range -(-128) + 128 -> 256: "+b1);
		
		//Now we go beyond 256+24 - we assign 280
		//it starts again from positive
		double test2 = 280;
		Double testObject2 = new Double(test2);
		byte b3 = testObject2.byteValue();
		System.out.println("value bigger than sum of + and - range -> 280: "+b3);
		
		//Now we go beyond 256+128+3 - we assign 440
		//it starts again from positive
		double test3 = 440;
		Double testObject3 = new Double(test3);
		byte b4 = testObject3.byteValue();
		System.out.println("value bigger than sum of + and - range -> 440: "+b4);
		
		//to condition max range value
		byte b5=127;
		System.out.println("initial value"+b5);
		if(b5<Byte.MAX_VALUE) {
			b5++;	
		}
		System.out.println("condition"+b5);
		

	}

}
