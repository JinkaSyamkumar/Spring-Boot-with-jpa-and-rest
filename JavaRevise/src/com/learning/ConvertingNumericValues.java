/**
 * 
 */
package com.learning;

/**
 * @author syamkumarj
 * 4
 */
public class ConvertingNumericValues {

	public static void main(String[] args) {
	
		int intValue1 = 56;
		int intValue2=intValue1;
/*		above we are assigning intValue1 to intValue2
		intValue2 does not create reference(pointer) to intValue1
		it takes copy of intValue1
		WHEN WORKING WITH PRIMITIVES, it always creates copy not reference.*/
		
		/*1)WIDENING - WHEN WE ARE CONVERTING A TYPE WHICH TAKES SMALL AMOUNT OF MEMORY 
			TO TYPE THAT TAKES LARGE AMOUNT OF MEMORY,IT IS CALLED WIDENING
		  2)NARROWING - REVERSE */
		
		/*WIDENING IS AUTOMATIC.WE DONT LOOSE ANY DATA.*/
		long longValue1 = intValue1;
		System.out.println("long value is : "+longValue1);
		
/*		Narrowing - within limits
		We need to cast it - without u get type mismatch error - can not convert from int to short
		short shortValue1=intValue1; 
		so CASTING what it does? - it indicates compiler, treat the original value as new type , mentioned in () */
		short shortValue1 = (short)intValue1;
		System.out.println("Short Value is :"+shortValue1);
		//above intValue1 is within range of short
		
		//now - assigning bigger range
		int intValue3=1025;
		byte byteValue =(byte)intValue3;
		System.out.println("byte value : "+byteValue);
		//above we lost data - so widening works but when we go for narrowing we lost data so we should handle data conversion carefully.
		
		
		
	}

}
