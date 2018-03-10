/**
 * 
 */
package com.learning.utility;

import java.util.List;

/**
 * @author syamkumarj
 *
 */
public class UsersSavings {

	public int getSavings(List<UserModel> lst) {
		for (UserModel userModel : lst) {
			System.out.println(userModel.savings);
		}
		return 0;
	}
	
	//called for 20
	public int getSaving(List<UserModel_1> lst) {
		int savings =0;
		for (UserModel_1 userModel : lst) {
			savings+=userModel.getSavings();
			
		}
		return savings;
	}
	
	public int getSavingSS(List<UserModel_2> lst) {
		int savings =0;
		for (UserModel_2 userModel : lst) {
			savings+=userModel.getSavings();
			
		}
		return savings;
	}
	public int getSaving3(List<UserModel_3> lst) {
		int savings =0;
		for (UserModel_3 userModel : lst) {
			savings+=userModel.getSavings();
			
		}
		return savings;
	}
	public int getSaving4(List<UserModel_4> lst) {
		int savings =0;
		for (UserModel_4 userModel : lst) {
			savings+=userModel.getSavings();
			
		}
		return savings;
	}
}
