/**
 * 
 */
package com.learning;

import java.util.ArrayList;
import java.util.List;

import com.learning.utility.UserModel;
import com.learning.utility.UsersSavings;

/**
 * @author syamkumarj
 *
 */
public class StoringDataInInstanceVariables20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		1.When we create a custom class, we can design it to encapsulate data using instance variables or fields
		2.Create a new class - UserModel.java in utilities
		3.My goal is to create encapsulated user model sysytem
		4.Each instance of UserModel will represent one unique user 
		5.so i need to represent, name, age, gender, savings
		6.so defines the above as ***fields
		7.set initial value*/
		
	//	8.I want to hold list of users so
		List<UserModel> userModels = new ArrayList<>();
	//	9.Lets instantiate
		UserModel userModel1 = new UserModel(); //javac creates no arg constructor fir us
		userModels.add(userModel1);
		UserModel userModel2 = new UserModel(); //javac creates no arg constructor fir us
		userModels.add(userModel2);
		UserModel userModel3 = new UserModel(); //javac creates no arg constructor fir us
		userModels.add(userModel3);
		
	//	10.If u check all fields in usermodel are public so
	//	these can be accessed directly without any setter and getters like below
	// without public accessor, you get error like name is not visible
		for(UserModel userModel:userModels) {
			System.out.println(""+userModel.savings);
		}
		
	//11. Now i create a new class, UsersSavings, which calculates net savings of all
	// i make the method public so it can be accessed from anywhere
		UsersSavings usersSavings = new UsersSavings();
		usersSavings.getSavings(userModels);
		
	//main diff bw 10 and 11, we separated the logic in 11 ie encapsulated so in future adding more logic wont do any break to main
	
	/* ***so we used usermodel to contain and manage data
	and userssavings to do the processing and business*/
	}

}
