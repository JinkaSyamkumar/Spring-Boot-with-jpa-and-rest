/**
 * 
 */
package com.learning;

import java.util.HashMap;
import java.util.Map;

/**
 * @author syamkumarj
 *
 */
public class UnorderedDataWithHashMap15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Managing unordered data with HashMap
		//****just like List, MAP also holds only objects for both key and value
		//LIKE Arraylist, here we use concrete implementation of map ie hashmap we have other as well
		Map<String, String> map = new HashMap<>();
		//Adding
		map.put("TS", "HYD");
		map.put("Andhra", "ATP");
		map.put("TN", "CHENNAI");
		
		//when you look at output, it wont be the way, we inserted
		System.out.println(map);
		
		//getting
		String value = map.get("TS");
		System.out.println(value);
		
		//remove
		map.remove("TN");
		System.out.println(map);
		
	}

}
