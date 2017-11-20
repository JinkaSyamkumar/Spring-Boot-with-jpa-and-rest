/**
 * 
 */
package com.learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author syamkumarj
 *
 */
public class LoopingThroughWithIteratorNforEach16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		list.add("syam");
		list.add("syam");
		list.add("syam");
		System.out.println("toString method output");
		System.out.println(list);
		
		System.out.println("1.ArrayList Iterator");
		
		//Iterator<String> - need to specify what kind of data we are looping on
		//list.iterator() - returns reference to iterator object of list, that we can use it to iterate
		Iterator<String> iterator = list.iterator();
		//To iterate with iterator, we use two methods
		//1.method that returns boolean - hasNext - indicates whether there is data in the object you are looping through
		//2. - next method- moves next object in the list and returns reference of it
		
		while(iterator.hasNext()) { // here hasnext goes through list , takes 1 object, sees ok we have data and passes, and takes next a untill there is no object then returns false and loop goes off
			String value = iterator.next();
			System.out.println(value);
		}
		
		System.out.println("2.For Each");
		//same above can be done with foreach
		//here it wont requires iterator object which is extra
		//it is little bit efficient and takes less code
		for (String string : list) {
			System.out.println(string);
		}
		
		//***********THE MOST EFFIECIENT IN JAVA8 perf wise and also less code*******************
		//apart from iterator and foreach, a *** new method introduced in JAVA8
		//CALLED METHOD REFERENCE
		System.out.println("3.Method Reference");
		//we use forEach literally on list 
		//and we use a class which has static method inside it ie 
		//class Syste.out and static METHOD is println ..just name ..no need of ()
		list.forEach(System.out::println);
		
		
		
		System.out.println("HashMap Iterator");
		Map<String, String> map = new HashMap<>();
		//Adding
		map.put("TS", "HYD");
		map.put("Andhra", "ATP");
		map.put("TN", "CHENNAI");
		
		//we needs keys to iterate over
		//step1: get all keys and assign to Set so that it will be unique
		//step2:create iterator and iterate over keys .. so next method gives key,we use key to get value with map.get(key)
		Set<String> keys = map.keySet();
		Iterator<String> iterator2= keys.iterator();
		while(iterator2.hasNext()) {
			String key = iterator2.next();
			System.out.println("capital of "+key+" is "+map.get(key));
		}
		
		System.out.println("HashMap For Each");
		for (String key : keys) {
			System.out.println("capital of "+key+" is "+map.get(key));
		}
		System.out.println("3.Method Reference");
		
	}

}
