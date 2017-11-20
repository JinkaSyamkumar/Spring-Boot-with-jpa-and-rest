/**
 * 
 */
package com.learning;

import java.util.ArrayList;
import java.util.List;

import com.learning.utility.UserModel;
import com.learning.utility.UserModel_1;
import com.learning.utility.UsersSavings;

/**
 * @author syamkumarj
 *
 */
public class DeclaringInstanceAndStaticMethods21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.before we used UserModel.java - 
		//here when you create methods and u dont include static keyword means it is ****instance method
		//a class that is designed to hold the data such as UserModel will have instance methods known as Setters and Getters
		//GETTER is called Accessor method - simply returns value
		//SETTER is called modifier method - receives argument and will have this keyword to distinguish class instance variable and passed variable
		//this represents that particular class instance
		
		//2.Create a copy of UserModel.java to UserModel_1.java
		//ADD SETTERS AND GETTERS - set and get exact name is optional , its up to you
		
		List<UserModel_1> userModels = new ArrayList<>();
			UserModel_1 userModel1 = new UserModel_1();
			//setting values
			userModel1.setSavings(40);
			userModels.add(userModel1);
			
			UserModel_1 userModel2 = new UserModel_1(); 
			userModel1.setSavings(40);
			userModels.add(userModel2);
			UserModel_1 userModel3 = new UserModel_1(); 
			userModel1.setSavings(20);
			userModels.add(userModel3);
			
			UsersSavings usersSavings = new UsersSavings();
			int totalSavings = usersSavings.getSaving(userModels);
			System.out.println(totalSavings);
			
			//3. so we used instance class to create diff users and its setters and getetrs to set and access its values
			//we then used to usersavings to do the processing like how much savings is done
			
			/*we are using instance variables and instance methods to manage the data.
			4.To make the fields of usermodel fully encapsulate and can not be accessedd without getters and setters , we change it to private
			so only way to manipulate them is through setters and getters*/
	}

}
