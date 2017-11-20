/**
 * 
 */
package com.learning;

import java.util.ArrayList;
import java.util.List;

import com.learning.utility.EnumClass;
import com.learning.utility.UserModel_3;
import com.learning.utility.UserModel_4;
import com.learning.utility.UsersSavings;

/**
 * @author syamkumarj
 *
 */
public class UsingEnumTypes24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.Earlier we have seen how to standardize values using STATIC and FINAL keywords to create constants
		
		//2.We can also Enumerations - lists of possible values for any particular variable
		//3.Enumerations in java is also called Enum class
		//4.We can create it as a separate file or nested if its going to be used by one
		//5.Check EnumClass.java till 2 points - ONLY **A BLOCK
		//6.When you assign value like below to object you will get error because object expects string but you are passing of type enum
		//UserModel_4 userModel1 = new UserModel_4("jinka",25,'M',1000,EnumClass.TCS);
		//7.so go to UserModel_4, change ***datatype of company from string to enum
		
		List<UserModel_4> userModels = new ArrayList<>();
		
		//5.as it is static, we access directly with class
		//because of this , even we want to change company name, u dont have to update all 3 objects, just updating const is enough
		
		UserModel_4 userModel1 = new UserModel_4("jinka",25,'M',1000,EnumClass.TCS);
		
		System.out.println("Company value is -"+userModel1.getCompany());
		
		//**here if you see, values that are printed are uppercase
		//check EnumClass.java
		//Comment A block and uncomment B block
		userModels.add(userModel1);
		
		UserModel_4 userModel2 = new UserModel_4("SYAM",25,'M',1000,EnumClass.TCS); 
		userModels.add(userModel2);
		
		UserModel_4 userModel3 = new UserModel_4("jinkaSY",25,'M',1000,EnumClass.INFY); 
		userModels.add(userModel3);
		
		UsersSavings usersSavings = new UsersSavings();
		int totalSavings = usersSavings.getSaving4(userModels);
		System.out.println(totalSavings);
		
		
	}

}
