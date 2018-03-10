/**
 * 
 */
package com.learning;

import java.util.ArrayList;
import java.util.List;

import com.learning.utility.UserModel_2;
import com.learning.utility.UserModel_3;
import com.learning.utility.UsersSavings;

/**
 * @author syamkumarj
 *
 */
public class UsingStaticVariablesAsConstants23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//1.Many programming languages support the concept of CONSTANTS
		//A VARIABLE WHOSE VALUE CAN NOT BE CHANGED
		//There is const keyword in JAVA, but it is not implemented
		//u can uncomment below line const will be highlighted as keyword but will show compilation error because it is implemented
		//const x=30;
		
		//2.Instead constants are created with ***final keyword
		//final when applied to variable it means it can be set only once
		
		//3.below when creating objects we are using "", it can be misssplet, instead we can use constants
		
		//4.Check UserModel_3.java, lets add constants
				
				List<UserModel_3> userModels = new ArrayList<>();
		
				//5.as it is static, we access directly with class
				//because of this , even we want to change company name, u dont have to update all 3 objects, just updating const is enough
				
				UserModel_3 userModel1 = new UserModel_3("jinka",25,'M',1000,UserModel_3.TCS);
				userModels.add(userModel1);
				
				UserModel_3 userModel2 = new UserModel_3("SYAM",25,'M',1000,UserModel_3.TCS); 
				userModels.add(userModel2);
				
				UserModel_3 userModel3 = new UserModel_3("jinkaSY",25,'M',1000,UserModel_3.INFY); 
				userModels.add(userModel3);
				
				UsersSavings usersSavings = new UsersSavings();
				int totalSavings = usersSavings.getSaving3(userModels);
				System.out.println(totalSavings);
	}

}
